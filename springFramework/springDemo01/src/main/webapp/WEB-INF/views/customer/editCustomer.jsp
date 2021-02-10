<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Customer</title>
</head>
<body>
<form action="save_customer" method="post">
    <div>
        <label>Customer Number:</label>
        <input type="text" name="customer_number" value="${customer.customer_number}" readonly>
    </div>
    <div>
        <label>Customer name:</label>
        <input type="text" name="customer_name" value="${customer.customer_name}">
    </div>
    <div>
        <label>Phone:</label>
        <input type="text" name="phone" value="${customer.phone}">
    </div>
    <div>
        <label>Address line: </label>
        <input type="text" name="address_line" value="${customer.address_line}">
    </div>
    <div>
        <lable>City:</lable>
        <input type="text" name="city" value="${customer.city}">
    </div>
    <div>
        <label>State: </label>
        <input type="text" name="state"value="${customer.state}">
    </div>
    <div>
        <label>Zipcode: </label>
        <input type="text" name="postal_code" value="${customer.postal_code}">
    </div>
    <div>
        <lable>Country:</lable>
        <input type="text" name="country" value="${customer.country}">
    </div>
    <div>
        <label>Date of Birth: </label>
        <input type="date" name="date_of_birth" value="${customer.date_of_birth}">
    </div>
    <div>
        <label>Comments: </label>
        <textarea rows="5" cols="20" name="comments" >${customer.comments}</textarea>
    </div>

    <div><input type="submit" value="Submit"></div>
</form>
</body>
</html>