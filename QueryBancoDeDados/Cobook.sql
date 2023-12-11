CREATE DATABASE CoBook;
USE CoBook;
CREATE TABLE Usuarios (
    cod_usuarios INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    CPF VARCHAR(14) UNIQUE NOT NULL,
    idade INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    tipo_livro_preferido1 VARCHAR(100),
    tipo_livro_preferido2 VARCHAR(100),
    senha VARCHAR(100) NOT NULL CHECK (CHAR_LENGTH(senha) > 0),
    administrador BOOLEAN
);

CREATE TABLE Cargos (
    cod_cargos INT AUTO_INCREMENT PRIMARY KEY,
    tipo_cargo VARCHAR(20)
);


CREATE TABLE cargos_usuarios (
    cod_cargos INT,
    cod_usuarios INT,
    PRIMARY KEY (cod_cargos, cod_usuarios),
    CONSTRAINT FK_COD_USUARIOS FOREIGN KEY(cod_usuarios) REFERENCES Usuarios (cod_usuarios),
    CONSTRAINT FK_COD_CARGOS_USUARIOS FOREIGN KEY(cod_cargos) REFERENCES Cargos (cod_cargos)
);


CREATE TABLE livro (
    cod_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
	tipo_livro VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL
);

CREATE TABLE avaliacoes (
cod_livro INT,
cod_usuarios INT,
PRIMARY KEY (cod_livro, cod_usuarios), 
CONSTRAINT fk_cod_livro FOREIGN KEY (cod_livro) REFERENCES livro (cod_livro),
CONSTRAINT fk_cod_usuarios_avaliacoes FOREIGN KEY (cod_usuarios) REFERENCES usuarios (cod_usuarios),
nota DOUBLE

);
/*select l.*, avg(a.nota) as nota from livro l join avaliacoes a where l.cod_livro = a.cod_livro group by a.cod_livro order by avg(a.nota) DESC,count(a.nota) DESC, l.titulo ASC*/
/*SELECT l.titulo, l.autor, AVG(a.nota) AS nota FROM livro l JOIN avaliacoes a ON l.cod_livro = a.cod_livro GROUP BY a.cod_livro ORDER BY AVG(a.nota) DESC, COUNT(a.nota) DESC, l.titulo ASC*/
INSERT INTO Usuarios (nome, email, CPF, idade, sexo, tipo_livro_preferido1, tipo_livro_preferido2, senha, administrador) VAlUES ('Guilherme Caetano da Silva', 'guilherme.caetano@gmail.com', '400.289.222-22' , 22, 'Masculino', 'Percy Jackson e o ladrão de raios', 'Harry Potter e a pedra filosofal', 'admin01', TRUE);

																																					