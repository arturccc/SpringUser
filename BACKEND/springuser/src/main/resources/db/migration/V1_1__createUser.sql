CREATE TABLE usuarios (
    id INT IDENTITY(1,1) PRIMARY KEY,
    usuario VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    link_url VARCHAR(255),
    enum_tipo INT NOT NULL
);
