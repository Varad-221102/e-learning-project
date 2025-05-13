import React from "react";
import { Link } from "react-router-dom";
import "./App.css";
import { FaShoppingCart } from "react-icons/fa";

function Header() {
  return (
    <header className="header">
      <h1 className="logo">CourseMania</h1>
      <nav className="nav">
        <Link to="/">Home</Link>
        <Link to="/about">About</Link>
        <Link to="/courses">Courses</Link>
        <Link to="/contact">Contact</Link>
        <Link to="/login" className="auth">Login</Link>
        <Link to="/register" className="auth">Register</Link>

        {/* 🛒 Shopping Cart Icon */}
        <Link to="/cart" className="cart-icon">
          <FaShoppingCart />
          <span className="cart-count">0</span> {/* you can replace 2 with dynamic count */}
        </Link>
      </nav>
    </header>
  );
}

export default Header;
