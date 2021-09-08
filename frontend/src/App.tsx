import Footer from "components/Footer";
import NavBar from "components/NavBar";
import React from "react";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Hello world</h1>
        <h2>Olá mundo</h2>
      </div>
      <Footer/>
    </>
  );
}

export default App;
