<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

    <jsp:directive.page contentType="text/html; chartset=UTF-8" />
    <head><title>Spizza</title></head>
    <body>
        <h2>Welcome to Spizze!!!</h2>
        <p>Hello <security:authentication property="principal"/>!</p>
        <form:form>
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <input type="text" name="phoneNumber" /><br/>
            <input type="submit" name="_eventId_phoneEntered" value="Lookup Customer" />
        </form:form>
    </body>

</html>