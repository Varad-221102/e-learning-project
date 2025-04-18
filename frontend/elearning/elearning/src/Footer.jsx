import React from "react";
import "./App.css";

function Footer() {
  return (
    <footer className="footer">
      <div className="footer-content">
        <div className="footer-column">
        <ul>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Contact Us</a></li>
            <li><a href="#">Careers</a></li>
            <li><a href="#">Blog</a></li>
          </ul>
        </div>
        <div className="footer-column">
          <ul>
            <li><a href="#">Udemy Business</a></li>
            <li><a href="#">Tech On Udemy</a></li>
            <li><a href="#">Get The App</a></li>
          </ul>
        </div>
        <div className="footer-column">
          <ul>
            <li><a href="#">Helps And Support</a></li>
            <li><a href="#">Privacy And Plicy</a></li>
          </ul>
        </div>
        <div className="footer-column">
        
          <p>Email: support@elearning.com</p>
          <p>Phone: +123456789</p>
        </div>
      </div>
      <p className="footer-bottom">© 2025 E-Learning Platform. All rights reserved.</p>
    </footer>
  );
}

export default Footer;
