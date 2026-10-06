import React,{useState} from 'react';
import {useNavigate} from 'react-router-dom';
function AddStudent()
{
	const API="https://6abe8f50c4d5ac5483029546.mockapi.io/StudentData";
	const navigate = useNavigate();
	const [data,setData] = useState({
							RollNo:"",
							Name:"",
							Class:"",
							Profile:""
							});

	const imgChange=(e)=>{
		const file=e.target.files[0];
		const reader=new FileReader();
		reader.onloadend = () => {setData({...data,Profile:reader.result})}
		reader.readAsDataURL(file);
	}

	return(
		<div>
			<h1>Add Student Data Form</h1>

			RollNo: <input type="text" 
			onChange={(e)=>{setData({...data,RollNo:e.target.value})}}/>

			Name: <input type="text" 
			onChange={(e)=>{setData({...data,Name:e.target.value})}}/>

			Class: BCA <input type="radio" value="BCA" 
			onChange={(e)=>{setData({...data,Class:e.target.value})}}/>

			 MCA <input type="radio" value="MCA" 
			onChange={(e)=>{setData({...data,Class:e.target.value})}}/>

			 B.Tech <input type="radio" value="B.Tech" 
			onChange={(e)=>{setData({...data,Class:e.target.value})}}/>

			Profile: <input type="file" accept="image/*" 
			onChange={imgChange}/>

			<input type="button" value="ADD" onClick={()=>{
				fetch(API,{
					method:"POST",
					body:JSON.stringify(data),
					headers:{"Content-Type":"application/json"}
				})
				.then(()=>{
					alert("Record Added Succesfully!");
					navigate("/Student")
				})

			}}/>
		</div>
		);
}

export default AddStudent;