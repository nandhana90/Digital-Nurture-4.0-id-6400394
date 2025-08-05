import React, { useState } from "react";
import "./App.css";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  // Multiple methods for Increment
  const increment = () => {
    setCount(count + 1);
    sayHello();
    sayMessage("Increment button clicked");
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    console.log("Hello!");
  };

  const sayMessage = (msg) => {
    console.log(msg);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handlePress = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h2>React Event Handling Example</h2>
      <h3>Counter: {count}</h3>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>

      <br /><br />
      <button onClick={handlePress}>OnPress (Synthetic Event)</button>

      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
