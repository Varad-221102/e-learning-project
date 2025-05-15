import React, { useState } from "react";
import axios from "axios";
import "./Contact.css";

function Contact() {
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    message: "",
  });

  const [status, setStatus] = useState("");

  const handleChange = (e) => {
    setFormData((prev) => ({
      ...prev,
      [e.target.name]: e.target.value,
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("http://localhost:8080/api/contact", formData);
      setStatus("Message sent successfully ✅");
      setFormData({ name: "", email: "", message: "" });
    } catch (error) {
      console.error("Error sending message:", error);
      setStatus("Failed to send message ❌");
    }
  };

  return (
    <div className="contact-container">
      <h2 className="contact-heading">Contact Us</h2>
      <div className="contact-box">
        {/* Left: Form */}
        <div className="contact-form">
          <h3>Leave message</h3>
          <form onSubmit={handleSubmit}>
            <input
              type="text"
              name="name"
              placeholder="Name"
              value={formData.name}
              onChange={handleChange}
              required
            />
            <input
              type="email"
              name="email"
              placeholder="Email Address"
              value={formData.email}
              onChange={handleChange}
              required
            />
            <textarea
              name="message"
              rows="4"
              placeholder="Your Message"
              value={formData.message}
              onChange={handleChange}
              required
            ></textarea>
            <button type="submit">Send</button>
          </form>
          {status && <p style={{ marginTop: "10px", color: "green" }}>{status}</p>}
        </div>

        {/* Right: Info */}
        <div className="contact-info">
          <h3>Contact information</h3>
          <p><strong>Email:</strong> coursemania@gmail.com</p>
          <p><strong>Phone:</strong> 9090909090</p>
          <p><strong>Address:</strong> CourseMania, 42 Learn Street, Edutown, CA 90210</p>
          <iframe
            className="contact-map"
            src="https://maps.google.com/maps?q=Edutown,%20CA&t=&z=13&ie=UTF8&iwloc=&output=embed"
            title="Google Map"
          ></iframe>
        </div>
      </div>
    </div>
  );
}

export default Contact;
