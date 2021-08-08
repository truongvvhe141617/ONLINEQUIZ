
<%-- 
    Document   : ManageQuiz
    Created on : Jul 16, 2021, 10:00:59 PM
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
        <title>Manage Quiz</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="content">
                    <div class="manageQuizContent">
                        <span class="totalQuestion">
                            Number of question:
                        </span>
                        <span class="numOfQuest">
                       ${numOfQuestion}
                    </span>
                    <div class="listQuiz">
                        <table>
                            <tr>
                                <th class="titleQuestion">
                                    Question
                                </th>
                                <th class="titleDateCreated">
                                    Date Created
                                </th>
                            </tr>
                            <c:forEach items="${listQuiz}" var="o" >
                                <tr>
                                    <td class="questionName">
                                        <a href="">${o.question}</a>
                                    </td>
                                    <td class="dateCreated">
                                        ${o.createdDate}
                                    </td>
                                </tr>
                            </c:forEach>    
                        </table>
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
</html>
