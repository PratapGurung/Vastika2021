<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<sec:authentication property="principal" var="principal"></sec:authentication>
<nav>
    <a href="home">Home</a>
    <a href="list_customer">Customer</a>
    <a href="add_customer">Add Customer</a>
    <a href="logout">Logout</a>
    <a>${principal.username}</a>
</nav>