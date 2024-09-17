
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dictionary Project</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 400px;
        }

        h1 {
            margin-bottom: 20px;
            color: #333;
        }

        p {
            margin-bottom: 30px;
            color: #555;
        }

        .buttons {
            display: flex;
            justify-content: space-between;
        }

        .btn {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            font-size: 16px;
        }

        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Dictionary Using Trie Data Structure</h1>
    <p>This project demonstrates a dictionary implemented with a Trie data structure. You can insert words into the dictionary and search for existing words.</p>
    <div class="buttons">
        <form method="post" action="/insertPage">
            <button class="btn">Insert Word</button></a>
        </form>

        <form method="post" action="/searchPage">
            <button class="btn">Search Word</button></a>
        </form>
    </div>
</div>
</body>
</html>
