<%--
  Created by IntelliJ IDEA.
  User: HOANG
  Date: 8/12/2021
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/search">
    <table>
      <tr>
        <td><input type="text" name="input" placeholder="Enter input"></td>
        <td><button type="submit">Search</button></td>
      </tr>
      <tr>
        <td>${output}</td>
      </tr>
    </table>
  </form>
  </body>
</html>
