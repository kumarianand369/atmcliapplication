<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Numeric Keypad</title>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="login.css" type="text/css"/>
   <script>
	 


	   
var nonChar = "" 
window.onload=init;         
function init()   {
    var char = "0123456789";
    keyValue = "";
    for (i=0 ; keyValue.length < 10; i++){
        rand = Math.round(Math.random()*10);
        if(keyValue.indexOf(rand)>-1) continue;
        keyValue += char.substring(rand, rand+1);
        }
      console.log(keyValue);
    counter = -1;
    while(counter < 10){
    counter++
    document.querySelector("#num"+counter).value = keyValue[counter];
    }
  
 }  
function showClickedButton(btn){
    clickedButton(nonChar+=btn)
 }   
          
function clearPassword() {
  clickedButton(nonChar ="")  
 }
function deleteChar(){
    clickedButton(nonChar = nonChar.substring(0,nonChar.length-1))
}        
          
function clickedButton(btn){
   psword.value = btn;
}   
function displayPassword(){
  box = document.querySelector("#plainPsWord");
    if (box.checked ==false){
    psword.type = "password";
}    
else{
    psword.type = "text"
}
}
          
	   
	   
</script>
  
  <!-----------------khushi--------------->

</head>
<body>
<div id="mainBody">
                 
<h1>ATM CLI APPLICATION</h1>
 <hr>
<div id="title" >ATM SCREEN</div>
  
 <div id="container">
   
   
    <p>Please Enter Your Pin</p>
       
     <form>
             
        <table border="0" class="btnTable">
          
            
            <tr><td><label for="psword"></label></td>
            <td  colspan="5"><input type="password" id="psword"  disabled  maxlength="10" />
                
                
                </td>
            
            </tr>
           <tr>
            <td></td>   
            <td><input type="button" id="num0" class="btn" value="1"  onclick="showClickedButton(this.value);"/></td> 
            <td><input type="button" id="num1" class="btn" value="2" onClick="showClickedButton(this.value);"/></td> 
            <td><input type="button" id="num2" class="btn" value="3" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="Clr" class="btnDC" value="CLR" onclick ="clearPassword()"/></td>
            <td rowspan="3">
            
            
            <button class="btnEnter" id="enter" value="Enter" onclick="document.location='default.asp'"><a href="http://127.0.0.1:54408/atmindex.html"> Enter</a></button>
            
          
            
            
            </td>    
            </tr>
            <tr>
            <td></td>    
            <td><input type="button" id="num3" class="btn" value="4" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="num4" class="btn" value="5" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="num5" class="btn" value="6" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="Del" class="btnDC" value="DEL" onClick="deleteChar()"/></td>
            </tr>
            <tr>
            <td></td>    
            <td><input type="button" id="num6" class="btn" value="7" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="num7" class="btn" value="8" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="num8" class="btn" value="9" onClick="showClickedButton(this.value);"/></td>
            <td><input type="button" id="num9" class="btn" value="0" onClick="showClickedButton(this.value);"/></td>
            </tr>    
            <tr><td></td><td colspan="5"><input type="checkbox" id="plainPsWord" onChange="displayPassword()"><label for="plainPsWord" class="check">Display password</label>
                
                </td></tr>
            <tr><td></td><td colspan="5"><a href="#" target="_blank">Forgot your password?</a></td></tr>
           
            </table>
         
    </form>        
           
    </div>
  
    </div>
    
</body>
</html>