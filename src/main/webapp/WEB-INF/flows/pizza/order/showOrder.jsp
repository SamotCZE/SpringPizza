<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Pizza</title>
</head>
<body>

	<h2>Your order</h2>
	
	<h3>Deliver to:</h3>
		<b>${order.customer.name}</b><br/>
		<b>${order.customer.address}</b><br/>
		<b>${order.customer.city}, ${order.customer.state} ${order.customer.zipCode}</b><br/>
		<b>${order.customer.phoneNumber}</b><br/>
		<hr/>
		<h3>Order total: <fmt:formatNumber type="currency" 
		    value="${order.total}"/></h3>
		<hr/>
		<h3>Pizzas: </h3>
		
		<c:if test="${fn:length(order.pizzas) eq 0}">
			<b>No pizzas in this order.</b><br/>
		</c:if>
		
		
		<br/>
		<c:forEach items="${order.pizzas}" var="pizza">
			<li>${pizza.size} :
				<c:forEach items="${pizza.toppings}" var="topping">
					<c:out value="${topping}" />,
				</c:forEach>
			</li>
		</c:forEach>
		<br/>
		<form:form>
			<input type="hidden" name="_flowExecutionKey"
				value="${flowExecutionKey}"/>
			<input type="submit" name="_eventId_createPizza" value="Create Pizza" />
			<c:if test="${fn:length(order.pizzas) gt 0}">
				<input type="submit" name="_eventId_checkout" value="Checkout" />
			</c:if>
				<input type="submit" name="_eventId_cancel" value="Cancel" />
		</form:form>

</body>
</html>