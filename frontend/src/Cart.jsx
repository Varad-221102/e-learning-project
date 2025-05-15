import React, { useEffect, useState } from "react";
import axios from "axios";
import "./Cart.css";

const Cart = () => {
  const [cartItems, setCartItems] = useState([]);

  // Replace this with actual user ID from localStorage/auth context
  const userId = localStorage.getItem("userId");

  const fetchCartItems = async () => {
    try {
      const response = await axios.get(`http://localhost:8080/api/users/${userId}/cart`);
      setCartItems(response.data);
    } catch (error) {
      console.error("Failed to fetch cart items:", error);
    }
  };

  useEffect(() => {
    if (userId) {
      fetchCartItems();
    }
  }, [userId]);

  return (
    <div className="cart-container">
      <h2>Your Shopping Cart</h2>

      {cartItems.length === 0 ? (
        <p>Your cart is empty 😢</p>
      ) : (
        <ul className="cart-list">
          {cartItems.map((item) => (
            <li key={item.id} className="cart-item">
              <h3>{item.title}</h3>
              <p>Duration: {item.duration || "N/A"}</p>
              <p>Price: {item.price === 0 ? "Free" : `₹${item.price}`}</p>
            </li>
          ))}
        </ul>
      )}

      {cartItems.length > 0 && (
        <button className="checkout-btn">Proceed to Checkout</button>
      )}
    </div>
  );
};

export default Cart;
