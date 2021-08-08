<%-- 
    Document   : Header
    Created on : Jul 16, 2021, 7:26:01 PM
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
        <title>Header</title>
    </head>
    <body>
        <div class="header"></div>
        <div class="menu">
            <div class="menuItems">
                <c:choose>                
                    <c:when test="${sessionScope.user.role == null}">
                        <a href="#">Home</a>
                        <a href="#">Take Quiz</a>
                        <a href="#">Make Quiz</a>
                        <a href="#">Manage Quiz</a>
                        </c:when>
                    <c:otherwise>
                        <c:if test="${sessionScope.user.role == 2}">
                            <a href="#">Home</a>

                            <a class="menuTakeQuiz" href="take-quiz">Take Quiz</a>
                            <a class="menuLogout" href="logout">Log out</a>
                            
                        </c:if>
                        <c:if test="${sessionScope.user.role == 1}">
                            <a href="#">Home</a>
                             <a class="menuTakeQuiz" href="take-quiz">Take Quiz</a>
                             <a class="menuMakeQuiz" href="make-quiz">Make Quiz</a>
                             <a class="menuManageQuiz"href="manage-quiz">Manage Quiz</a>
                             <a class="menuLogout" href="logout">Log out</a>
                            
                        </c:if>
                    </c:otherwise>
               </c:choose>
            </div>
        </div>
    </body>
</html>
