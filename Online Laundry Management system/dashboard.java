<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Dashboard - Online Laundry Management System</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./src/styles/dashboard.css">
    <link rel="stylesheet" href="./src/styles/header.css">
    <link rel="stylesheet" href="./src/styles/footer.css">
</head>

<body>
    <div style="height: 70px;"></div>
    
    <% 
    // Add your Java code here to check if the user is logged in.
    // Replace the PHP session code with equivalent Java code.
    if (userIsLoggedIn) { 
    %>

    <div class="container">
        <div class="sidebar">
            <div class="navigation">
                <label id="leb">Dashboard</label>
                <a href="profile.jsp" class="nav-link">Profile</a>
                <a href="place_order.jsp" class="nav-link">Place Order</a>
                <a href="order_history.jsp" class="nav-link">Order History</a>
                <a href="manage_laundry.jsp" class="nav-link">Manage Laundry</a>
                <a href="manage_staff.jsp" class="nav-link">Manage Staff</a>
                <a href="reports.jsp" class="nav-link">Reports</a>
            </div>
        </div>
        
        <div class="main-content" id="content">
            <h1 class="h1">Welcome to the Online Laundry Management System</h1>
            <div class="dash"></div>
        </div>
    </div>
    
    <% 
    // Add your Java code for the main content of the dashboard here.
    } else {
        // Redirect the user to the login or sign-up page if not logged in.
        response.sendRedirect("sign_up.jsp");
    } 
    %>

    <script src="./src/js/dashboard.js"></script>
</body>

<footer>
    <!-- Your Java code for the footer section goes here -->
    <% 
    // Add your Java code for the footer here.
    %>
</footer>

</html>
