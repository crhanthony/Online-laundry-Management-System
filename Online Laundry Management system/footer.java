<footer class="foot-container">
  <div class="foot-dis">
    <div id="logofoot">
      <img src="./src/images/logo-white.png" alt="Logo" />
    </div>

    <p>
      Welcome to the Online Laundry Management System. Easily manage your laundry tasks with us.
    </p>
    <div>
      <!-- Add Java code here for social media links if needed -->
      <i class="fa-brands fa-facebook-f fa-xl" style="color: #ffffff;"></i>
      <i class="fa-brands fa-instagram fa-xl " style="color: #ffffff;"></i>
      <i class="fa-brands fa-twitter fa-xl " style="color: #ffffff;"></i>
      <i class="fa-brands fa-linkedin fa-xl " style="color: #ffffff;"></i>
      <i class="fa-brands fa-youtube fa-xl " style="color: #ffffff;"></i>
    </div>
  </div>
  <div class="foot-nav">
    <ul>
      <li><a href="./about_us.jsp">About Us</a></li>
      <li><a href="./place_order.jsp">Place Order</a></li>
      <li><a href="./order_history.jsp">Order History</a></li>
      <li><a href="./manage_laundry.jsp">Manage Laundry</a></li>
    </ul>
  </div>
  <div class="foot-nav">
    <ul>
      <!-- Add Java code here for user account links and privacy policy -->
      <li><a href="<%= userLoggedIn ? "account.jsp" : "login.jsp" %>">Account</a></li>
      <li><a href="privacy_policy.jsp">Privacy Policy</a></li>
      <li><a href="help.jsp">Help</a></li>
    </ul>
  </div>
  <div class="foot-nav">
    <ul>
      <!-- Add Java code here for company-related links and pricing information -->
      <li><a href="for_companies.jsp">For Companies</a></li>
      <li><a href="blog.jsp">Blog</a></li>
      <li><a href="account.jsp">Company Account</a></li>
      <li><a href="pricing.jsp">Pricing</a></li>
      <li><a href="help.jsp">Help</a></li>
    </ul>
  </div>
</footer>
