DROP DATABASE IF EXISTS todo_db;
CREATE DATABASE todo_db;
USE todo_db;

CREATE TABLE usuario(
id INT PRIMARY KEY,
nome VARCHAR(25),
email VARCHAR(255),
telefone VARCHAR(14),
senha TEXT
);

CREATE TABLE lista_tarefa(
id INT PRIMARY KEY AUTO_INCREMENT,
lista_id INT,
nome_lista VARCHAR(255),
titulo_tarefa TEXT,
tipo_tarefa VARCHAR(11),
concluido_tarefa VARCHAR(1),
Horario_data VARCHAR(16)
);

-- select * from usuario;
-- select * from lista_tarefa;