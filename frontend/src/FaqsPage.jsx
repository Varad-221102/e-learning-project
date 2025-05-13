import React from 'react';
import './FaqsPage.css';

const faqs = [
  {
    question: 'What is CourseMania?',
    answer: 'CourseMania is an online learning platform that offers expert-led courses across a wide range of topics, including tech, design, business, creativity, and more. Our courses are designed to match real-world skills, helping you upskill, reskill, or explore new passions.',
  },
  {
    question: 'How do I get started with CourseMania?',
    answer: 'Simply sign up, choose a course that matches your interest or career goals, and start learning at your own pace. You can access courses anytime, anywhere, on any device.',
  },
  {
    question: 'Are the courses self-paced?',
    answer: 'Yes, all our courses are self-paced, allowing you to learn whenever it suits you. You can start, pause, and resume your lessons anytime.',
  },
  {
    question: 'Can I interact with instructors and other learners?',
    answer: 'Absolutely! CourseMania provides a global community of learners where you can connect, share insights, and collaborate on projects. Our platform is optimized for mobile, tablet, and desktop devices.',
  },
  {
    question: 'Do I need any prior experience to take these courses?',
    answer: 'Not at all! Our courses are designed for learners at all levels, from beginners to advanced professionals. You’ll find introductory courses as well as in-depth programs to match your skill level.',
  },
  {
    question: 'Is there a refund policy?',
    answer: 'Yes, we have a flexible refund policy to ensure your satisfaction. Check our terms and conditions for more details.',
  },
];

const FaqsPage = () => {
  return (
    <div className="faq-page">
      <header className="header">
        <h1 className="logo">CourseMania</h1>
        <nav className="nav">
          <a href="#">Home</a>
          <a href="#">About</a>
          <a href="#">Courses</a>
          <a href="#">FAQs</a>
          <a href="#">Contact</a>
          <a href="#" className="login">Login</a>
          <button className="register-btn">Register</button>
        </nav>
      </header>

      <main>
        <h2 className="title">FAQs</h2>
        <div className="faq-grid">
          {faqs.map((faq, index) => (
            <div key={index} className="faq-card">
              <div className="faq-image">
                <img src="https://via.placeholder.com/60x60.png" alt="avatar" />
                <span className="pencil-icon">✏️</span>
              </div>
              <h3>{faq.question}</h3>
              <p>{faq.answer}</p>
            </div>
          ))}
        </div>
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

export default FaqsPage;
