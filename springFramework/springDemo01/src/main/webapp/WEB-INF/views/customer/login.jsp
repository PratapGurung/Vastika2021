<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login Page </title>
    <style>
        Body {
            font-family: Calibri, Helvetica, sans-serif;
            background-color: whitesmoke;
        }
        button {
            background-color: #4CAF50;
            width: 50%;
            color: orange;
            padding: 15px;
            margin: 10px 0px;
            border: none;
            cursor: pointer;
        }
        form {
            border: 3px solid #f1f1f1;
        }
        input[type=text], input[type=password] {
            width: 50%;
            margin: 8px 0;
            padding: 12px 20px;
            display: inline-block;
            border: 2px solid green;
            box-sizing: border-box;
        }
        button:hover {
            opacity: 0.7;
        }

        .container {
            width: 50%;
            padding: 25px;
        }
    </style>
</head>
<body>
<h1> Login Form </h1>
<form action="login" method="post">
    <div class="container">
        <div>
            <label>Username : </label>
            <input type="text" placeholder="Enter Username" name="username" required>
        </div>

        <div>
            <label>Password : </label>
            <input type="password" placeholder="Enter Password" name="password" required>
        </div>
        <button type="submit" value="Login">Login</button>
    </div>
</form>
</body>
</html>