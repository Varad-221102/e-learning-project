// Cart.js
import React from "react";
import "./Cart.css";

const Cart = () => {
  // Sample cart data (replace with actual logic later)
  const cartItems = [
    {
      id: 1,
      title: "Khan academy special",
      price: 0,
      duration: "25mins",
    },
    {
      id: 2,
      title: "Critical Thinking Mastery",
      price: 15,
      duration: "40mins",
    },
  ];

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
              <p>Duration: {item.duration}</p>
              <p>Price: {item.price === 0 ? "Free" : `$${item.price}`}</p>
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
