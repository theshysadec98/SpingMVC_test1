<%--
  Created by IntelliJ IDEA.
  User: HOANG
  Date: 8/12/2021
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyen doi tien te</title>
</head>
<body>
    <form action="/VNtoUSD">
        <table>
            <tr>
                <td><input type="text" name="VND"></td>
                <td><button type="submit">VN -> USD</button></td>
            </tr>
            <tr>
                <td>${VND} USD</td>
            </tr>
        </table>
    </form>

    <form action="/USDtoVN">
        <table>
            <tr>
                <td><input type="text" name="USD"></td>
                <td><button type="submit">USD -> VN</button></td>
            </tr>
            <tr>
                <td>${USD} VND</td>
            </tr>
        </table>
    </form>
</body>
</html>
