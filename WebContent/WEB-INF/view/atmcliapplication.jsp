<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="">
<head>
    <meta charset="UTF-8">
    <title>atmcliappication</title>
	<meta name="Author" content=""/>
	<link rel="stylesheet" type="text/css" href="style.css">
	
	<style>
     .img-container {
        text-align: center;
      }
			
	  h1 {text-align: center;}
		
	  .container {
             position: relative;
             width: 100%;
             max-width: 400px;
            }
            
            <!-----------------------------khushi-------------------->

.container img {
  width: 100%;
  height: auto;
}

.img-container .btn {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  background-color: #555;
  color: white;
  font-size: 16px;
  padding: 12px 24px;
  border: none;
  cursor: pointer;
  border-radius: 5px;
  text-align: center;
}

.img-container .btn:hover {
  background-color: black;
}
    
	</style>
	
</head>
<body>

	
	

<h1><i>ATM CLI APPLICATION</i></h1>
<div class="img-container"> 
  <button class="btn"  onclick="document.location='default.asp'"><a href="http://127.0.0.1:54408/login.html">Please Enter Your Pin.</a></button>
    
   
   
     <img src="atmimg1.jpg"  width="600" height="500">
    </div>
    
   
   
</body>
</html>
