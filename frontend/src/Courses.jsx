import React, { useEffect, useState } from "react";
import axios from "axios";
import "./Courses.css";

function Courses() {
  const [courses, setCourses] = useState([]);
  const [searchTerm, setSearchTerm] = useState("");

  // Fetch courses from backend
  const fetchCourses = async () => {
    try {
      const response = await axios.get("http://localhost:8080/api/courses");
      setCourses(response.data);
    } catch (error) {
      console.error("Error fetching courses:", error);
    }
  };

  // Fetch on component mount
  useEffect(() => {
    fetchCourses();
  }, []);

  // Filtered courses based on search input
  const filteredCourses = courses.filter((course) =>
    course.title.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div className="content">
      {/* Search Section */}
      <div className="search-section">
        <input
          type="text"
          placeholder="Search for courses"
          className="search-bar"
          value={searchTerm}
          onChange={(e) => setSearchTerm(e.target.value)}
        />
        <button className="search-btn">SEARCH</button>
      </div>

      {/* Heading */}
      <h2>Our Courses</h2>

      {/* Course List */}
      <div className="course-list">
        {filteredCourses.length > 0 ? (
          filteredCourses.map((course) => (
            <div className="course-card" key={course.id}>
              <img
                src={course.imageUrl || "default-course.jpg"}
                alt={course.title}
                className="course-image"
              />
              <h3>{course.title}</h3>
              <p>{course.description}</p>
              <p><strong>Instructor:</strong> {course.instructorName}</p>
              <p><strong>Price:</strong> ₹{course.price}</p>
            </div>
          ))
        ) : (
          <p>No courses found.</p>
        )}
      </div>
    </div>
  );
}

export default Courses;
