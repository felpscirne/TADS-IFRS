CREATE DATABASE garagem_coletiva;

\c garagem_coletiva;

CREATE TABLE Cliente (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    rua VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    complemento VARCHAR(50),
    numero INT NOT NULL
);

CREATE TABLE Modelo (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,
    ano_lancamento INT NOT NULL
);

CREATE TABLE Veiculo (
    chassi VARCHAR(17) PRIMARY KEY,
    placa VARCHAR(7) NOT NULL UNIQUE,
    cor VARCHAR(20) NOT NULL,
    ano INT NOT NULL,
    cpf_cliente VARCHAR(11) NOT NULL,
    modelo_id INT NOT NULL,
    FOREIGN KEY (cpf_cliente) REFERENCES Cliente(cpf),
    FOREIGN KEY (modelo_id) REFERENCES Modelo(id)
);

CREATE TABLE Andar (
    id SERIAL PRIMARY KEY,
    numero INT NOT NULL
);

CREATE TABLE Vaga (
    id SERIAL PRIMARY KEY,
    numero INT NOT NULL,
    andar_id INT NOT NULL,
    FOREIGN KEY (andar_id) REFERENCES Andar(id)
);

CREATE TABLE Estacionamento (
    id SERIAL PRIMARY KEY,
    vaga_id INT NOT NULL,
    chassi_veiculo VARCHAR(17) NOT NULL,
    data_hora_entrada TIMESTAMP NOT NULL,
    data_hora_saida TIMESTAMP,
    valor_pago DECIMAL(10, 2),
    FOREIGN KEY (vaga_id) REFERENCES Vaga(id),
    FOREIGN KEY (chassi_veiculo) REFERENCES Veiculo(chassi)
);
