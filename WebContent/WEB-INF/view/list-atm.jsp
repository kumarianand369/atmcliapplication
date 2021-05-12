<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atm Cli Application</title>

 <link type="text/css"
        rel="stylesheet"
        href="${pageContext.request.contextPath}/resources/css/style.css"/>
        
</head>
<body>

    <div id="wrapper">
     <div id="header">
      <h2>Atm Cli Application</h2>
     </div>
    </div>
    
    <div id="container">
      <div id="content">
      <!-- put new button:Add atm -->
      <input type="button" value="Add Atm"
             onclick="window.location.href='showFormForAdd';return false;"
             class="add-button"
             />
      
      
      <!-- add out of html table here -->
      <table>
          <tr>
          
          <th> Cashwithdrawal </th>
          <th> Transfer </th>
          <th> Billpayment </th>
          <th> Deposit </th>
          <th> Balanceinquiry</th>
          <th> Exit</th>
          </tr>
          
          <!-- -loop over and print out atm -->
        <c:forEach  var="tempAtm" items="${atm}">
        
        
        
        <!-- Construct an "update" link with atm id -->
       <c:url var="updateLink" value="/atm/showFormForUpdate">
       
       <c:param name="atmId" value="${tempAtm.id}"/>
       </c:url>
       
       
       <!-- Construct an "delete" link with atm id -->
       <c:url var="deleteLink" value="/atm/delete">
       
       <c:param name="atmId" value="${tempAtm.id}"/>
       </c:url>
       
       
       
      
        <tr>
           <td> ${tempCustomer.Cashwithdrawal}</td>
           <td> ${tempCustomer.Transfer}</td>
            <td> ${tempCustomer.Billpayment}</td>
             <td> ${tempCustomer.Deposit}</td>
              <td> ${tempCustomer.Balanceinquiry}</td>
               <td> ${tempCustomer.Exit}</td>
            <td>
            <!-- Display the update link -->
            <a href="${updateLink}">Update</a>
            |
            <a href="${deleteLink}"
               onclick="if (!(confirm('Are you sure you want to delete this atmpin?'))) return false">Delete</a>
            
            </td>
         </tr>  
        
        </c:forEach>
          
      </table>
      </div>
      </div>

</body>
</html>