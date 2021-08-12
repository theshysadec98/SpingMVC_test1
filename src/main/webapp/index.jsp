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

  <form action="/create">
    <table>
      <tr>
        <td><input type="text" name="value1"></td>
        <td><input type="text" name="value2"></td>
        <td><button type="submit" name="check" value="+">+</button></td>
        <td><button type="submit" name="check" value="-">-</button></td>
        <td><button type="submit" name="check" value="*">*</button></td>
        <td><button type="submit" name="check" value="/">/</button></td>
      </tr>
    </table>
    <h1>${result}</h1>
  </form>

  </body>
</html>
