<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List User</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1>All customer</h1>
    <div>
            <c:if test="${!empty customers}">
                <table>
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Customer Name</th>
                        <th>Phone</th>
                        <th>Address Line</th>
                        <th>City</th>
                        <th>State</th>
                        <th>Postal Code</th>
                        <th>Country</th>
                        <th>Date of Birth</th>
                        <th>Comments</th>
                    </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${customers}" var="c">
                            <tr>
                                <th>${c.customer_number}</th>
                                <th>${c.customer_name}</th>
                                <th>${c.phone}</th>
                                <th>${c.address_line}</th>
                                <th>${c.city}</th>
                                <th>${c.state}</th>
                                <th>${c.postal_code}</th>
                                <th>${c.country}</th>
                                <th>${c.date_of_birth}</th>
                                <th>${c.comments}</th>
                                <th>
                                    <a href="edit_customer?id=${c.customer_number}">Edit</a>|
                                    <a href="delete_customer?id=${c.customer_number}">Delete</a>
                                </th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
    </div>
</body>
</html>