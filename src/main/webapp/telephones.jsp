<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Liste des téléphones</title>
</head>
<body>
    <h1>Liste des téléphones</h1>
    <table border="1">
        <tr>
            <th>Marque</th>
            <th>Modèle</th>
            <th>Prix</th>
            <th>Description</th>
            <th>Image</th>
        </tr>
        <c:forEach var="telephone" items="${telephones}">
            <tr>
                <td>${telephone.marque}</td>
                <td>${telephone.modele}</td>
                <td>${telephone.prix}</td>
                <td>${telephone.description}</td>
                <td><img src="${telephone.urlImage}" alt="${telephone.modele}" width="100"></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
