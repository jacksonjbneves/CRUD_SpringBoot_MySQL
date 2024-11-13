siga estas instruções para criar o banco de dados e a tabela e usar os END-POINTS:

User o Postman, baixe por este link: https://www.postman.com/downloads/

POST -> http://localhost:8080/data/user — Cria um novo usuário.
Exemplo, va em Body e selecione raw, e cole isso:
{
    "name": "Jackson Neves",
    "email": "jackson.neves@example.com",
    "password": "senha123",
    "profile_image": null
}

GET -> http://localhost:8080/data/users — Lista todos os usuários.
GET -> http://localhost:8080/data/user/{id} — Busca um usuário específico pelo id.
PUT -> http://localhost:8080/data/user/{id} — Atualiza um usuário específico pelo id.
Exemplo, va em Body e selecione raw, e cole isso:
{
    "name": "Jackson Java das Neves",
    "email": "jackson.neves@example.com",
    "password": "senha123",
    "profile_image": null
}

DELETE -> http://localhost:8080/data/user/{id} — Exclui um usuário específico pelo id.


       _     _
      | |   (_)
  ___ | |__  _ ___  ___ _ ____   ____ _  ___ __ _  ___
 / _ \| '_ \| / __|/ _ \ '__\ \ / / _` |/ __/ _` |/ _ \
| (_) | |_) | \__ \  __/ |   \ V / (_| | (_| (_| | (_) |
\___/|_.__/| |___/\___|_|    \_/ \__,_|\___\__,_|\___/
           _/ |
          |__/

#OBSERVAÇÃO: CRIE UM BANCO DE DADOS CHAMADO: usuarios e depois Crie a tabela: users, veja os codigos SQLs a seguir:

CREATE DATABASE usuarios;

CREATE TABLE users (
    id VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100),
    profile_image MEDIUMBLOB,
    PRIMARY KEY(id)
);

-- DADOS DE 20 USUARIOS FICTICIOS
INSERT INTO users (id, name, email, password, profile_image) VALUES
('550e8400-e29b-41d4-a716-446655440000', 'Alice Silva', 'alice.silva@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440001', 'Bruno Costa', 'bruno.costa@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440002', 'Carlos Souza', 'carlos.souza@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440003', 'Daniela Lima', 'daniela.lima@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440004', 'Eduardo Melo', 'eduardo.melo@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440005', 'Fernanda Almeida', 'fernanda.almeida@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440006', 'Gabriel Barbosa', 'gabriel.barbosa@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440007', 'Helena Pereira', 'helena.pereira@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440008', 'Igor Oliveira', 'igor.oliveira@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440009', 'Juliana Carvalho', 'juliana.carvalho@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440010', 'Lucas Fernandes', 'lucas.fernandes@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440011', 'Mariana Gonçalves', 'mariana.goncalves@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440012', 'Nathalia Rocha', 'nathalia.rocha@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440013', 'Otavio Ribeiro', 'otavio.ribeiro@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440014', 'Patricia Andrade', 'patricia.andrade@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440015', 'Ricardo Duarte', 'ricardo.duarte@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440016', 'Sofia Martins', 'sofia.martins@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440017', 'Tiago Araujo', 'tiago.araujo@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440018', 'Ursula Farias', 'ursula.farias@example.com', 'senha123', NULL),
('550e8400-e29b-41d4-a716-446655440019', 'Vitor Camargo', 'vitor.camargo@example.com', 'senha123', NULL);
