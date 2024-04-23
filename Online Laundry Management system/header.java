<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Import necessary Java classes --%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="your.package.UserSessionManager" %>

<%-- Get user session data if available --%>
<%
    UserSessionManager sessionManager = new UserSessionManager(session);
    Map<String, String> userData = sessionManager.getUserData();
%>

<header>
  <nav class="navbar">
    <h1 class="navbar-logo"><a href="/LaundryManagementSystem/home.jsp">LaundryHub</a></h1>
    <div>
      <div class="nav">
        <ul>

          <%-- Check if user is logged in based on session data --%>
          <c:choose>
            <c:when test="${not empty userData}">
              <li><a href="/LaundryManagementSystem/place_order.jsp">Place Order</a></li>
              <li><a href="/LaundryManagementSystem/order_history.jsp">Order History</a></li>
              <li><a href="/LaundryManagementSystem/manage_laundry.jsp">Manage Laundry</a></li>
              <li><a href="/LaundryManagementSystem/logout.jsp">Logout</a></li>
            </c:when>
            <c:otherwise>
              <li><a href="/LaundryManagementSystem/place_order.jsp">Place Order</a></li>
              <li><a href="/LaundryManagementSystem/order_history.jsp">Order History</a></li>
              <li><a href="/LaundryManagementSystem/about_us.jsp">About</a></li>
              <li><a href="/LaundryManagementSystem/sign_up.jsp">Sign up</a></li>
              <li><a href="/LaundryManagementSystem/login.jsp">Login</a></li>
            </c:otherwise>
          </c:choose>
        </ul>
      </div>
    </div>
  </nav>
</header>
