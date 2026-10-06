import React,{useState,useEffect} from 'react';
import {useParams,useNavigate} from 'react-router-dom';

function UpdateStudent()
{
	const{id} = useParams();
	const navigate = useNavigate();
	const API="https://6abe8f50c4d5ac5483029546.mockapi.io/StudentData";

	const [data,setData] = useState({
							RollNo:"",
							Name:"",
							Class:"",
							Profile:""
							});

	useEffect(()=>{
		fetch(API+"/"+id)
			.then((res)=>res.json())
			.then((data)=>{
				setData(data);
			});
	},[id]);

	const imgChange=(e)=>{
		const file=e.target.files[0];
		const reader=new FileReader();
		reader.onloadend = () => {setData({...data,Profile:reader.result})}
		reader.readAsDataURL(file);
	}

	return(
		<div>
			<h1>Update Student Data Form</h1>

			RollNo: <input type="text" value={data.RollNo}
			onChange={(e)=>{setData({...data,RollNo:e.target.value})}}/>

			Name: <input type="text" value={data.Name}
			onChange={(e)=>{setData({...data,Name:e.target.value})}}/>

			Class: <input type="text" value={data.Class} 
			onChange={(e)=>{setData({...data,Class:e.target.value})}}/>

			Profile: <input type="file" accept="image/*" onChange={imgChange}/>

			<input type="button" value="UPDATE" onClick={()=>{
				fetch(API+"/"+id,{
					method:"PUT",
					body:JSON.stringify(data),
					headers:{"Content-Type":"application/json"}
				})
				.then(()=>{
					alert("Record Updated Succcesfully!");
					navigate("/Student")
				})
			}}/>

		</div>
		);
}

export default UpdateStudent;