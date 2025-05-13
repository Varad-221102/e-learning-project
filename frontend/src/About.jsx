import React from 'react';
import './AboutUsPage.css';

// ✅ Import images from assets folder
import students1 from './assets/students1.jpg';
import students2 from './assets/students2.jpg';
import featuresImage from './assets/features.jpg';

const services = [
  { title: 'Interaction Design', description: 'Lessons on design that cover the most recent developments.' },
  { title: 'Frontend Dev', description: 'A course to build interactive websites with real-world projects.' },
  { title: 'Backend Dev', description: 'A course to build secure backend systems with real-world projects.' },
  { title: 'Figma UI UX Design', description: 'Lessons on design that cover the most recent developments.' },
  { title: 'Data Science', description: 'A course to build interactive websites with real-world projects.' },
  { title: 'Cyber Security', description: 'A course to build secure backend systems with real-world projects.' }
];

const AboutUsPage = () => {
  return (
    <div className="about-page">
      <main className="main-content">
        <section className="intro-section">
          <h2 className="page-title">About Us</h2>
          <p className="highlight-text">
            <strong className="highlight-coursemania">CourseMania</strong> Connects You To Expert-Led Courses Across Diverse Topics – Learn Anytime, Anywhere.
          </p>
          <p className="description">
            Unlock your potential with CourseMania – the ultimate destination for online learning. From tech and design to business and creativity, access high-quality courses and take the next step in your journey.
          </p>
          <p className="description">
            Learn at your own pace, anytime, anywhere, with expert-led content designed to match real-world skills. Connect with a global community of learners, stay ahead of industry trends, and earn certifications that matter.
          </p>
          <button className="join-btn">Join Us →</button>

          {/* ✅ Replaced with local image imports */}
          <div className="intro-images">
            <img src={students1} alt="Students 1" />
            <img src={students2} alt="Students 2" />
          </div>
        </section>

        <section className="features-section">
          <h3 className="features-title">Features</h3>
          <h4 className="features-subtitle">
            We are always working to provide you best of the features in all aspects.
          </h4>
          <p className="description">
            CourseMania offers a comprehensive learning experience with expert-led courses designed to match real-world skills. With a diverse range of topics from tech and design to business and creativity – you can learn at your own pace, anytime, anywhere.
          </p>
          <p className="description">
            Gain practical knowledge through hands-on projects and real-world case studies and earn industry-relevant certifications that add value to your resume. Connect with a global community of learners, share insights, and stay ahead of industry trends.
          </p>
          <button className="learn-btn">Learn More →</button>

          {/* ✅ Replaced with local image import */}
          <img src={featuresImage} alt="Features Visual" className="features-image" />
        </section>

        <section className="services-section">
          <h3 className="services-heading">Our Services</h3>
          <h4 className="services-subheading">Fostering a playful & engaging learning environment</h4>
          <div className="services-grid">
            {services.map((service, idx) => (
              <div className="service-card" key={idx}>
                <h5>{service.title}</h5>
                <p>{service.description}</p>
              </div>
            ))}
          </div>
        </section>
      </main>

      <footer className="footer">
        <div>
          <p>About Us</p>
          <p>Contact Us</p>
          <p>Careers</p>
          <p>Blog</p>
        </div>
        <div>
          <p>Udemy Business</p>
          <p>Teach On Udemy</p>
          <p>Get The App</p>
        </div>
        <div>
          <p>Help And Support</p>
          <p>Privacy Policy</p>
        </div>
      </footer>
    </div>
  );
};

export default AboutUsPage;
