import React from "react";
import "./Contact.css";

function Contact() {
  return (
    <div className="contact-container">
      <h2 className="contact-heading">Contact Us</h2>
      <div className="contact-box">
        {/* Left: Form */}
        <div className="contact-form">
          <h3>Leave message</h3>
          <form>
            <input type="text" placeholder="Name" />
            <input type="email" placeholder="Email Address" />
            <textarea rows="4" placeholder="Your Message"></textarea>
            <button type="submit">Send</button>
          </form>
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
