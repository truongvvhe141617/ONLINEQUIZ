<%-- 
    Document   : Login
    Created on : Jul 16, 2021, 7:44:59 PM
    Author     : Vuong Van Truong
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="content">
                    <h3>Login Form</h3>
<!--                    <span>${mess}</span>-->
                    <form action="login" method="post">
                    <table>
                        <tr>
                            <td class="loginLabels">User Name:</td>
                            <td>
                                <input type="text" name="user" class="inputUsername">
                            </td>
                        </tr>
                        <tr>
                            <td class="loginLabels">Password:</td>
                            <td>
                                <input type="password" name="pass" class="inputPassword">
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input type="submit" class="btnLogin" value="Sign in"/>
                                <a class="registerLink" href="register">Register</a>
                            </td>
                        </tr>
                    </table>
                </form>
                <div class="loginProblemMessage">${mess}</div>
            </div>
        </div>
    </body>
</html>
