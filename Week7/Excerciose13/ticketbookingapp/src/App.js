import React, { useState } from 'react';
import './App.css';

function GuestPage() {
  return <h3>Welcome, Guest! You can browse flight details.</h3>;
}

function UserPage() {
  return <h3>Welcome, User! You can now book your tickets.</h3>;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  let content;

  if (isLoggedIn) {
    content = <UserPage />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div className="App">
      <h2>Ticket Booking App</h2>
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}
      {content}
    </div>
  );
}

export default App;
