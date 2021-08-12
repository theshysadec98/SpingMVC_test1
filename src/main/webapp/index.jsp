<%--
  Created by IntelliJ IDEA.
  User: HOANG
  Date: 8/12/2021
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <tr>
    <td><input type="text" name="value1"></td>
    <td><input type="text" name="value2"></td>
  </tr>
    <table>
      <tr>
        <td>
          <form action="/add"><button type="submit">+</button></form>
        </td>
        <td>
          <form action="/minus"><button type="submit" >-</button></form>
        </td>
        <td>
          <form action="/multiplication"><button type="submit" n>*</button></form>
        </td>
        <td>
          <form action="/division"><button type="submit">/</button></form>
        </td>
      </tr>
    </table>

  <h1>${result}</h1>

  </body>
</html>
