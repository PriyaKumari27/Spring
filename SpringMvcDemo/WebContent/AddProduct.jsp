<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "fo" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Add product

<table>
<fo:form action="pagesubmit"  method="POST" modelAttribute="product">
<tr>
<td>Product Id </td>
<td><fo:input path="prodId" /> </td>

</tr>
<td><span><fo:errors path="prodId"> </fo:errors></span></td>

<tr>
<td>Product Name </td>
<td><fo:input path="prodName" /> </td>

</tr>
<td><span><fo:errors path="prodName"> </fo:errors></span></td>

<tr>
<td>Product Price</td>
<td><fo:input path="prodPrice" /> </td>

</tr>
<td><span><fo:errors path="prodPrice"> </fo:errors></span></td>

<tr>
<td>Product Type</td>
<td><fo:select path="type" items="${dataitem}" /> </td>    
</tr>
<td><span><fo:errors path="type"> </fo:errors></span></td>


<tr>
<td>Online</td>
<td><fo:radiobuttons path="online" items="${onli}" /> </td>    
</tr>
<td><span><fo:errors path="online"> </fo:errors></span></td>


<tr>
<td>Product features</td>
<td><fo:checkbox path="features" value="Abc"/>Abc<br>
<fo:checkbox path="features" value="Bcd"/>Bcd<br>
<fo:checkbox path="features" value="Xyz"/>Xyz</td>    
</tr>

<tr>
<td><input type= "submit" value="Add Product" />
<td><input type="reset" value = "Clear"> 
</tr>
</fo:form>
</table>
</body>
</html>