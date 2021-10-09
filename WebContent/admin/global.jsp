<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.simplilearn.shop.User"%>
<%@page import="com.simplilearn.hibernate.HibernateUtil"%>
<%@page import="org.hibernate.Session"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Session se = HibernateUtil.getSessionFactory().openSession();
		int userId = (int) session.getAttribute("userId");
		User adminUser = se.load(User.class, userId);
		out.print("Welcom, " + adminUser.getName() + " " + adminUser.getFamily());
	%>
	<hr>

	<a href="list_product.jsp"> Dashboard </a> |

	<a href="new_product.jsp"> New Product </a> |

	<a href="logout"> Logout </a>

	<hr>
</body>
</html>