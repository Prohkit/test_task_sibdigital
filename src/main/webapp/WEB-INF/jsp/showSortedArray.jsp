<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>

<h2>Отсортированный массив:</h2>
<br>

<c:forEach items="${result.arrayValues}" var="sortedArrayItem">
    <c:out value="${sortedArrayItem.sortedValue}"/>
</c:forEach>

</body>
</html>
