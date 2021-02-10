<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <%@ include file="header.jsp"%>
</head>
<body>
<form action="save_customer" method="post">
    <div>
        <label>Customer name:</label>
        <input type="text" name="customer_name">
    </div>
    <div>
        <label>password:</label>
        <input type="password" name="password">
    </div>
    <div>
        <label>Phone:</label>
        <input type="text" name="phone">
    </div>
    <div>
        <label>Address line: </label>
        <input type="text" name="address_line">
    </div>
    <div>
        <lable>City:</lable>
        <input type="text" name="city">
    </div>
    <div>
        <label>State: </label>
        <input type="text" name="state">
    </div>
    <div>
        <label>Zipcode: </label>
        <input type="text" name="postal_code">
    </div>
    <div>
        <lable>Country:</lable>
        <input type="text" name="country">
    </div>
    <div>
        <label>Date of Birth: </label>
        <input type="date" name="date_of_birth">
    </div>
    <div>
        <label>Comments: </label>
        <textarea rows="5" cols="20" name="comments"></textarea>
    </div>

    <div><input type="submit" value="Submit"></div>
</form>
</body>
</html>