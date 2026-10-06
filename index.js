  import React from 'react';
  import ReactDOM from 'react-dom/client';
  import './index.css';
  import App from './App';
  import {BrowserRouter,Routes,Route,Link} from 'react-router-dom'
  import Student from './Student';
  import AddStudent from './AddStudent';
  import UpdateStudent from './UpdateStudent';

  const root = ReactDOM.createRoot(document.getElementById('root'));
  root.render(
    <BrowserRouter>
      
      <header className="header">
       <Link to="/Student">Home</Link> &nbsp;&nbsp;&nbsp;
        <Link to="/Student/AddStudent">ADD STUDENT</Link> &nbsp;&nbsp;&nbsp;
      </header>
      
      <Routes>
        <Route path="/Student" element={<Student/>}/>
        <Route path="/Student/AddStudent" element={<AddStudent/>}/>
        <Route path="/update/:id" element={<UpdateStudent/>}/>      
    </Routes>
    
    <footer className="footer">
      <p>HARSHIL VADGASIYA BCA-25030401096</p>
    </footer> 
    </BrowserRouter>
  );


