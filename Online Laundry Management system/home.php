<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Import necessary Java classes and packages --%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="your.package.DatabaseConnection" %>
<%@ page import="your.package.LaundryItem" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/LaundryManagementSystem/src/styles/home.css" />

    <!-- Font Awesome icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
        integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

    <title>LaundryHub</title>
</head>

<%-- Include necessary Java files for header and session management --%>
<%@ include file="./header.jsp" %>

<body>
    <div class="hero">
        <div>
            <h1 class="header-title">
                Easy to manage your laundry with LaundryHub
            </h1>
            <p class="hero-disc"><span>LaundryHub</span> is your one-stop solution for all your laundry needs. We make it
                <span>easy and quick</span> to manage your laundry tasks.</p>
        </div>
        <!-- search bar -->
        <form action="findLaundry.jsp" method="get">
            <div class="search-wrapper">
                <div class="search">
                    <div class="search-bar">
                        <input type="text" placeholder="Search Laundry, Service, Location..." class="search-input"
                            name="search" />

                        <select class="category" name="category">
                            <option value="dry-cleaning">Dry Cleaning</option>
                            <option value="laundry-service">Laundry Service</option>
                            <option value="ironing-service">Ironing Service</option>
                        </select>
                        <button class="btn btn-search" type="submit">Search</button>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <div class="body">
        <div class="recent-laundry">
            <h1>Most Recent Laundry Services</h1>

            <%
                // Retrieve most recent laundry services from the database using Java
                List<LaundryItem> laundryItems = DatabaseConnection.getMostRecentLaundryItems();

                for (LaundryItem item : laundryItems) {
            %>
            <form action="viewLaundry.jsp" method="get">
                <div class="laundry-tag">
                    <h3><%= item.getLaundryService() %></h3>
                    <h3><%= item.getLocation() %></h3>
                    <h4><%= item.getServiceType() %></h4>
                    <a class="viewLaundry" href="viewLaundry.jsp?id=<%= item.getId() %>"><i
                            class="fa-solid fa-circle-chevron-right fa-lg"></i></a>
                </div>
            </form>
            <%
                }
            %>

            <a href="/LaundryManagementSystem/findLaundry.jsp" class="btn btn-seemore">See More</a>
        </div>
    </div>

    <!-- Testimonial section (remains unchanged) -->
    <!-- Add your Java code for testimonials here if needed -->

    <script src="/LaundryManagementSystem/src/js/home.js"></script>
</body>

<%-- Include necessary Java files for footer --%>
<%@ include file="./footer.jsp" %>

</html>
