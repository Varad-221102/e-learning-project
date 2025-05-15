import React, { useState, useEffect } from "react";
import axios from "axios";

function Home() {
  const [courses, setCourses] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    const fetchCourses = async () => {
      try {
        const response = await axios.get("http://localhost:8080/api/courses");
        setCourses(response.data);
        setLoading(false);
      } catch (err) {
        console.error("Error fetching courses:", err);
        setError("Failed to load courses.");
        setLoading(false);
      }
    };

    fetchCourses();
  }, []);

  return (
    <div className="content">
      <div className="search-section">
        <input type="text" placeholder="Search for courses" className="search-bar" />
        <button className="search-btn">SEARCH</button>
      </div>

      {loading && <p>Loading courses...</p>}
      {error && <p style={{ color: "red" }}>{error}</p>}

      <div className="course-list">
        {courses.map((course) => (
          <div key={course.id} className="course-card">
            <h3>{course.title}</h3>
            <p>{course.description}</p>
            <p>Price: ₹{course.price}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Home;
