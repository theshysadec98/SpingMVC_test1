<%--
  Created by IntelliJ IDEA.
  User: HOANG
  Date: 8/11/2021
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Controllers.CustomerController" %>
<%@ page import="Models.Customer" %>
<%@ page import="services.CustomerServiceFactory" %>
<%@ page import="services.CustomerService" %>
<%!
    private CustomerService customerService = CustomerServiceFactory.getInstance();
%>
<%
    Long id = Long.valueOf(request.getParameter("id"));
    Customer customer = customerService.findOne(id);
%>
<form action="/customers" method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <input type="hidden" name="id" value="<%= customer.getId() %>">
        <table>
            <tr>
                <td>Id</td>
                <td>
                    <%= customer.getId() %>
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td>
                    <input type="text" name="name" value="<%= customer.getName() %>">
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <input type="text" name="email" value="<%= customer.getEmail() %>">
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    <input type="text" name="address" value="<%= customer.getAddress() %>">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
<a href="/costumers">Back to list</a>.