import React from "react";


const Footer = () => {
  return (
    <footer className="footer mt-auto py-3 bg-dark">
      <div className="container">
        <p className="text-light">
          App desenvolvido por{" "}
          <a
            href="https://github.com/lukeprog2021"
            target="_blank"
            rel="noreferrer"
          >
            Lucas Silva
          </a>
        </p>
        <p className="text-light">
          <small>
            <strong>Feito com tecnologia React</strong>
            <br />
            Se conecte na minha rede:{" "}
            <a
              href="https://www.linkedin.com/in/lucas-silva-prog2021/"
              target="_blank"
              rel="noreferrer"
            >
              Linkedin
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
};

export default Footer;
