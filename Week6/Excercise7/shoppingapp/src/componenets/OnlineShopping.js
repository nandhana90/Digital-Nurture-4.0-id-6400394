import React from "react";
import Cart from "./Cart";

class OnlineShopping extends React.Component {
  render() {
    const items = [
      { itemname: "Fish", price: 150 },
      { itemname: "Shrimp", price: 250 },
      { itemname: "Crab", price: 300 },
      { itemname: "Prawns", price: 220 },
      { itemname: "Lobster", price: 500 }
    ];

    return (
      <div>
        <h1>Welcome to Online Shopping</h1>
        {items.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
