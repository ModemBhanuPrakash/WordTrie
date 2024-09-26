<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Word</title>
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

        .search-bar {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border-radius: 5px;
            border: 1px solid #ddd;
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
            width: 48%; /* Make buttons take 48% of container width */
        }

        .btn:hover {
            background-color: #0056b3;
        }

        .buttons {
            display: flex;
            justify-content: center; /* Align buttons side by side */
            gap: 10px; /* Add some space between buttons */
            padding: 10px;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Search Word in Dictionary</h1>
    <h3 align="center" style="color:red">${message}</h3>

    <!-- Form for Search functionality -->
    <form method="post" action="searchWord">
        <input name="searchword" type="text" placeholder="Enter word to search" class="search-bar">
        <div class="buttons">
            <!-- Search Button -->
            <button class="btn">Search</button>
        </div>
    </form>

    <!-- Separate form for Insert functionality -->
    <form method="post" action="insertPage">
        <div class="buttons">
            <!-- Insert Button -->
            <button class="btn">Insert</button>
        </div>
    </form>

    <form method="get" action="/">
        <div class="buttons">
            <!-- Insert Button -->
            <button class="btn">Home</button>
        </div>
    </form>

</div>
</body>
</html>
