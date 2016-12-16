<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Pierwszy servlet</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script type="text/javascript" src="ValidateForm.js" ></script>
</head>
<body>
<form onsubmit="return validateForm()" method="post">
  <p>Wprowadz imie:</p>
  <input type="text" name="imie" id="a"/>
  <input type="submit" value="OK" />
</form>
</body>
</html>