import React, { useState } from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faStar } from "@fortawesome/free-solid-svg-icons";

const StarRating = () => {
  const [rating, setRating] = useState(0);
  const [count, setCount] = useState(0);

  const handleRating = (newRating) => {
    setRating(newRating);
    setCount(count + 1);
  };

  return (
    <div className="star-rating">
      <span>{rating}</span>
      {[...Array(5)].map((_, index) => (
        <FontAwesomeIcon
          key={index}
          icon={faStar}
          className={`star-icon ${index < rating ? "selected" : ""}`}
          onClick={() => handleRating(index + 1)}
        />
      ))}
      <span>({count})</span>
    </div>
  );
};

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

function Home() {
  return (
    <>
      <div className="banner-container" style={{ position: "relative" }}>
        <img src="first.png" alt="Learning Banner" className="banner-image" />

        {/* 🔍 Search Bar added here */}
        <div className="search-bar-container" style={{
          position: "absolute",
          top: "10%",
          left: "50%",
          transform: "translate(-50%, -50%)",
          width: "60%",
          backgroundColor: "#fff",
          border: "1px solid #ccc",
          borderRadius: "8px",
          padding: "10px 20px",
          boxShadow: "0px 4px 12px rgba(0, 0, 0, 0.1)"
        }}>
          <input
            type="text"
            placeholder="🔍 Search for courses"
            className="search-input"
            style={{
              width: "100%",
              border: "none",
              outline: "20%",
              fontSize: "18px",
              background: "transparent"
            }}
          />
        </div>
      </div>

      <div className="services">
        <h4>Our Services</h4>
        <h1>Fostering a playful & engaging learning environment</h1>
        <div className="cardcontainer">
          {[1, 2, 3].map((_, index) => (
            <div className="card" key={index}>
              <div className="icon-text">
                <img src="Frame 390 (1).png" alt="Learning Banner" className="imgicon" />
                <h3>Interaction Design</h3>
              </div>
              <h5>Lessons on design that cover the most recent developments</h5>
              <a href="#">Learn More &gt;</a>
            </div>
          ))}
        </div>
      </div>

      <div className="thirdscreen">
        <h4>Our Services</h4>
        <h1>Our Most Popular Class</h1>
        <h3>Let's join our famous class, the knowledge provided will definitely be useful for you.</h3>
        <div className="thirdcardcontainer">
          {[
            { title: "Figma UI UX Design", category: "Design", image: "figma.png" },
            { title: "Frontend Development", category: "Development", image: "frontend.png" },
            { title: "Backend Development", category: "Development", image: "backend.png" },
          ].map((course, idx) => (
            <div className="card3" key={idx}>
              <img src={course.image} alt={course.title} className="thirdimg" />
              <div className="thirdtext">
                <h5>{course.category}</h5>
                <h2>{course.title}</h2>
                <h3>
                  A course to build {course.category.toLowerCase()} systems with real-world
                  projects.
                </h3>
                <StarRating />
                <div>
                  <img src="Avatar.png" alt="lecturor" className="thirdimg2" />
                  <div className="thirdimg2text">
                    <h5 className="a">Robert James</h5>
                    <h5 className="b">2001 Enrolled</h5>
                  </div>
                  <h2 className="c">$17.84</h2>
                </div>
              </div>
            </div>
          ))}
        </div>
        <button className="btn_explore">Explore All Programs</button>
      </div>

      <div className="fourthscreen">
        <h4>Tutors</h4>
        <h1>Meet Our Heroes</h1>
        <div className="fourthcardcontainer">
          {[1, 2, 3].map((_, idx) => (
            <div className="card4" key={idx}>
              <img src="teachers.png" alt="teacher" className="fourthimg" />
              <div className="fourthtext">
                <h3>Robert James</h3>
                <h4>UI UX Developer</h4>
              </div>
              <StarRating1 />
            </div>
          ))}
        </div>
      </div>

      <div className="fifthscreen">
        <img src="fifth_logo.png" alt="fifthlogo" className="fifthimgicon" />
        <h1>
          Courses was fantastic! It is Master platform for those looking to start a new career, or
          need a refresher.
        </h1>
        <img src="fifthimg2.jpeg" alt="fifthimg" className="fifthimg2" />
        <h3>Ryan Dan</h3>
      </div>

      <div className="sixthscreen">
        <h4>Tutors</h4>
        <h1>Meet Our Heroes</h1>
        <div className="sixthcardcontainer">
          {["Robert James", "Sophia Carter", "Daniel Smith"].map((name, idx) => (
            <div className="card6" key={idx}>
              <img src="teachers.png" alt="teacher" className="sixthimg" />
              <div className="sixthtext">
                <h3>{name}</h3>
                <h4>
                  "The expert faculty, hands-on projects, and industry-focused curriculum helped me
                  build strong technical skills and confidence. Highly recommended for anyone aiming
                  to excel in web development!"
                </h4>
              </div>
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default Home;
