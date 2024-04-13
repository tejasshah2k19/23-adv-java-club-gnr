<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

	<form action="AddProductServlet" method="post">
		
		ProductName : <input type="text" name="productName"/>
		${productNameError }
		<br><Br> 
	
		Price : <input type="text" name="price"/>
		${priceError}
		<br><Br> 
		
		
		<input type="submit" value="Add Product"/>
	
	</form>

</body>
</html>