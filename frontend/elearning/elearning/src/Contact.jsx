// src/components/Contact.jsx
import React from "react";
import "./Contact.css";
import mapImage from "./assets/map.png"; // Make sure this path is correct

const Contact = () => {
  return (
    <section className="contact-section" id="contact">
      <div className="contact-container">
        <h2>CONTACT US</h2>
        <div className="contact-box">
          {/* Form Side */}
          <form className="contact-form">
            <label>Leave message</label>
            <input type="text" placeholder="Name" required />
            <input type="email" placeholder="Email Address" required />
            <textarea placeholder="Your Message" row="20" required></textarea>
            <button type="submit">Send</button>
          </form>

          {/* Info Side */}
          <div className="contact-info">
            <h4>Contact information</h4>
            <p><strong>Email:</strong> coursemania@gmail.com</p>
            <p><strong>Phone:</strong> 9090909090</p>
            <p><strong>Address:</strong> CourseMania, 42 Learn Street, Edutown, CA 90210</p>
            <img src={mapImage} alt="Map" />
          </div>
        </div>
      </div>
    </section>
  );
};

export default Contact;
