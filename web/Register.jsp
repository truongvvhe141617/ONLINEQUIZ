
<%-- 
    Document   : ShowResult
    Created on : Jul 16, 2021, 10:11:02 PM
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
        <title>Register</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="content">
                    <h3>Register Form</h3>
                    <form action="register" method="post">
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
                            <td class="loginLabels">User Type:</td>
                            <td>
                                <select class="slRole" name="role">
                                     <option value="1">Teacher</option>
                                    <option value="2">Student</option>
                                   
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td class="loginLabels">Email:</td>
                            <td>
                                <input type="text" name="email" class="inputEmail">
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input type="submit" class="btnLogin" value="Register"/>
                            </td>
                        </tr>
                    </table>
                </form>
                <div class="registerProblemMessage">${mess}</div>
            </div>
        </div>
    </body>
</html>
