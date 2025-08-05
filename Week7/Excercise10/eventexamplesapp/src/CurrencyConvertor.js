import React, { useState } from "react";

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const converted = parseFloat(rupees) * 0.011; // Rough conversion rate
    setEuro(converted.toFixed(2));
  };

  return (
    <div>
      <h3>Currency Convertor (INR to Euro)</h3>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          required
        />
        <button type="submit">Convert</button>
      </form>
      {euro && (
        <p>
          <strong>{rupees} INR</strong> = <strong>{euro} Euro</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConvertor;
