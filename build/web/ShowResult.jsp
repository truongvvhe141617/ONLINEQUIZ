<%-- 
    Document   : ShowResult
    Created on : Jul 10, 2021, 10:10:13 PM
    Author     : edgy
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
        <title>Result</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="content">
                    <div class="titleLabel">
                        Your score
                    <c:if test="${percen>=50}">
                        <span class="passScore">${score}(${percen}%) - PASSED</span>   
                    </c:if>
                    <c:if test="${percen<50}">
                        <span class="failScore">${score}(${percen}%)  - FAILED</span>   
                    </c:if>
                </div>
                <div class="titleLabel">
                   
                      <div class="title">Take another test <a href="take-quiz" class="back">Start</a></div>
<!--                    <button href ="TakeQuiz.jsp">Start</button>-->
                      
                </div>
                <div class="endPageResult"></div>
            </div>
        </div>
    </div>
</body>
</html>
