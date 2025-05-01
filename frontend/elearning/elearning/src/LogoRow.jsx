// src/components/LogoRow.jsx
import React from 'react';
import khan from '../assets/khan.png';
import udemy from '../assets/udemy.png';
import coursera from '../assets/coursera.png';
import cloudacademy from '../assets/cloudacademy.png';

const LogoRow = () => {
  return (
    <div className="logo-row">
      <img src={udemy} alt="Udemy" />
      <img src={khan} alt="Khan Academy" />
      <img src={cloudacademy} alt="Cloud Academy" />
      <img src={coursera} alt="Coursera" />
    </div>
  );
};

export default LogoRow;
