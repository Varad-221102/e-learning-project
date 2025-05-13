  function Courses() {
    return (
     
      <div className="content">
  
      <div className="search-section">
          <input type="text" placeholder="Search for courses" className="search-bar" />
          <button className="search-btn">SEARCH</button>
        </div>
        <h2>Our Courses</h2>
        <ul className="list">
          <li>Web Development</li>
          <li>Machine Learning</li>
          <li>Cybersecurity</li>
          <li>Data Science</li>
        </ul>
      </div>
    );
  }
  
  export default Courses
  