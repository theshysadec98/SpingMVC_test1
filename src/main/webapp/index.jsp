<%--
  Created by IntelliJ IDEA.
  User: HOANG
  Date: 8/16/2021
  Time: 12:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form action="/save">
    <table>
      <tr>
        <td><input type="checkbox" name="lettuce"></td>
        <td><h3>Lettuce</h3></td>
        <td><input type="checkbox" name="tomato"></td>
        <td><h3>Tomato</h3></td>
        <td><input type="checkbox" name="mustard"></td>
        <td><h3>Mustard</h3></td>
        <td><input type="checkbox" name="sprouts"></td>
        <td><h3>Sprouts</h3></td>
      </tr>
      <tr>
        <button>Save</button>
      </tr>
    </table>
  </form>

  </body>
</html>
