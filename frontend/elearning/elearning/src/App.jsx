import React from "react";
import { Routes, Route } from "react-router-dom";
import Cart from './Cart';
import Header from "./Header";
import Footer from "./Footer";
import Login from "./Login";
import Home from "./Home";
import Contact from "./Contact";
import Register from "./Register";
import About from "./About";
import Courses from "./Courses";
import "./App.css";

function App() {
  return (
    <div className="container">
      <Header />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cart" element={<Cart />} />
        <Route path="/contact" element={<Contact />} />
        <Route path="/register" element={<Register />} />
        <Route path="/login" element={<Login />} />
        <Route path="/about" element={<About />} />
        <Route path="/courses" element={<Courses />} />
      </Routes>

      <Footer />
    </div>
  );
}

export default App;
