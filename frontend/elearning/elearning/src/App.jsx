import React, { useState } from "react";
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
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faStar } from "@fortawesome/free-solid-svg-icons";

const StarRating1 = () => {
  const [rating, setRating] = useState(0);

  return (
    <div className="star-rating1">
      {[...Array(5)].map((_, index) => (
        <FontAwesomeIcon
          key={index}
          icon={faStar}
          className={`star-icon1 ${index < rating ? "selected" : ""}`}
          onClick={() => setRating(index + 1)}
        />
      ))}
    </div>
  );
};



// Star Rating Component
const StarRating = () => {
  const [rating, setRating] = useState(0);
  const [count, setCount] = useState(0); // Count of clicks (total ratings)

  const handleRating = (newRating) => {
    setRating(newRating);
    setCount(count + 1);
  };

  return (
    <div className="star-rating">
      <span>{rating}</span> {/* ⭐ Display current rating on the left */}
      {[...Array(5)].map((_, index) => (
        <FontAwesomeIcon
          key={index}
          icon={faStar}
          className={`star-icon ${index < rating ? "selected" : ""}`}
          onClick={() => handleRating(index + 1)}
        />
      ))}
      <span>({count})</span> {/* ⭐ Show total ratings count in parentheses */}
    </div>
  );
};



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
   


      {/* Hero Section */}
     
      <div className="banner-container">
        <img src="first.png" alt="Learning Banner" />
      </div>
     

      <div className="services">
        <h4>Our Services</h4>
        <h1>Fostering a playful & engaging learning environment</h1>

        <div class="cardcontainer">
          <div class="card">
            <p>
            <div className="icon-text">
             <img src="Frame 390 (1).png" alt="Learning Banner" className="imgicon"/>
             <h3>Interaction Design</h3>
            </div>
              <h5>Lessons on design that cover the most recent developments</h5>
              <a href='#'>Learn More &gt;</a>
            </p>
          </div>
          <div class="card">
            <p>
            <div className="icon-text">
              <img src="Frame 390 (1).png" alt="Learning Banner" className="imgicon"/>
              <h3> Interaction Design</h3>
            </div>
              <h5>Lessons on design that cover the most recent developments</h5>
              <a href='#'>Learn More &gt;</a></p>
          </div>
          <div class="card">
            <p> 
            <div className="icon-text">
              <img src="Frame 390 (1).png" alt="Learning Banner" className="imgicon"/>
              <h3> Interaction Design</h3>
            </div>
              <h5>Lessons on design that cover the most recent developments</h5>
              <a href='#'>Learn More &gt;</a></p>
          </div>
        </div>
       
      </div>


      <div className="thirdscreen">
      <h4>Our Services</h4>
      <h1>Our Most Popular Class</h1>
      <h3>Let's join our famous class, the knowledge provided will definitely be useful for you.</h3>
        <div className="thirdcardcontainer">

        <div className="card3">
             <img src="figma.png" alt="figma" className="thirdimg"/>
             <div className="thirdtext">
              <h5>Design</h5>
              <h2>Figma UI UX Design</h2>
              <h3>Use Figma to get a job in UI Design, User Interface, User Experience design.</h3>
              <StarRating />
              <div >
                <img src="Avatar.png" alt="lecturor" className="thirdimg2"/>
                <div className="thirdimg2text">
                  <h5 className="a">Robert James</h5>
                  <h5 className="b">2001 Enrolled</h5>
                </div>
                <h2 className="c">$17.84</h2>
              </div>
             </div>      
          </div>

          <div className="card3">
             <img src="frontend.png" alt="figma" className="thirdimg"/>
             <div className="thirdtext">
              <h5>Development</h5>
              <h2>Frontend Development</h2>
              <h3>A course to build responsive, dynamic frontend interfaces with real-world projects.</h3>
              <StarRating />
              <div >
                <img src="Avatar.png" alt="lecturor" className="thirdimg2"/>
                <div className="thirdimg2text">
                  <h5 className="a">Robert James</h5>
                  <h5 className="b">2001 Enrolled</h5>
                </div>
                <h2 className="c">$17.84</h2>
              </div>
             </div> 
          </div>

          <div className="card3">
             <img src="backend.png" alt="figma" className="thirdimg"/>
             <div className="thirdtext">
              <h5>Development</h5>
              <h2>Backend Development</h2>
              <h3>A course to build robust, scalable backend systems with real-world projects.</h3>
              <StarRating />
              <div >
                <img src="Avatar.png" alt="lecturor" className="thirdimg2"/>
                <div className="thirdimg2text">
                  <h5 className="a">Robert James</h5>
                  <h5 className="b">2001 Enrolled</h5>
                </div>
                <h2 className="c">$17.84</h2>
              </div>
             </div>
          </div>

        </div>
        <button className="btn_explore">Explore All Programs</button>
        
      </div>

      


      <div className="fourthscreen">
        <h4>Tutors</h4>
        <h1>Meet Our Heroes</h1>
        <div className="fourthcardcontainer">
          <div className="card4">
      
              <img src="teachers.png" alt="teacher" className="fourthimg" />
              <div className="fourthtext">
              <h3>Robert James</h3>
              <h4>UI UX Developer</h4>
              </div>
            <StarRating1 /> {/* ⭐ Interactive Rating */}
           
          </div>

          <div className="card4">
          <img src="teachers.png" alt="teacher" className="fourthimg" />
          <div className="fourthtext">
            <h3>Robert James</h3>
            <h4>UI UX Developer</h4>
          </div>
          <StarRating1 /> {/* ⭐ Interactive Rating */}
          </div>

          <div className="card4">
          <img src="teachers.png" alt="teacher" className="fourthimg" />
          <div className="fourthtext">
          <h3>Robert James</h3>
          <h4>UI UX Developer</h4>
          </div>
          <StarRating1 /> {/* ⭐ Interactive Rating */}
          </div>
        </div>
      </div>

  

      <div className="fifthscreen">
        <img src="fifth_logo.png" alt="fifthlogo" className="fifthimgicon"/>
        <h1>Courses was fantastic! It is Master platform for those looking to start a new career, or need a refresher.</h1>
        <img src="fifthimg2.jpeg" alt="fifthimg" className="fifthimg2"/>
        <h3>Ryan Dan</h3>
      </div>



    


    <div className="sixthscreen">
      <h4>Tutors</h4>
      <h1>Meet Our Heroes</h1>
      <div className="sixthcardcontainer">
        
        {/* Card 1 */}
        <div className="card6">
          <img src="teachers.png" alt="teacher" className="sixthimg" />
          <div className="sixthtext">
            <h3>Robert James</h3>
            <h4>"The expert faculty, hands-on projects, and industry-focused curriculum helped me build strong technical skills and confidence. Highly recommended for anyone aiming to excel in web development!"</h4>
          </div>
        </div>

        {/* Card 2 */}
        <div className="card6">
          <img src="teachers.png" alt="teacher" className="sixthimg" />
          <div className="sixthtext">
            <h3>Sophia Carter</h3>
            <h4>"The expert faculty, hands-on projects, and industry-focused curriculum helped me build strong technical skills and confidence. Highly recommended for anyone aiming to excel in web development!"</h4>
          </div>
        </div>

        {/* Card 3 */}
        <div className="card6">
          <img src="teachers.png" alt="teacher" className="sixthimg" />
          <div className="sixthtext">
            <h3>Daniel Smith</h3>
            <h4>"The expert faculty, hands-on projects, and industry-focused curriculum helped me build strong technical skills and confidence. Highly recommended for anyone aiming to excel in web development!"</h4>
          </div>
        </div>

      </div>
    </div>




     



      <Footer />
    </div>

    
  );
}

export default App;


