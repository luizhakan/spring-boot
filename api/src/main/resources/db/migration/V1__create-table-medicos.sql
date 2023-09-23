create table medicos (
    id bigint not null auto_increment,
    nome VARCHAR(100) not null,
    email VARCHAR(100) not null unique,
    crm VARCHAR(6) not null unique,
    especialidade VARCHAR(100) not null,
    logradouro VARCHAR(100) not null,
    bairro VARCHAR(100) not null,
    cep VARCHAR(9) not null,
    complemento VARCHAR(100) not null,
    numero VARCHAR(10) not null,
    uf VARCHAR(2) not null,
    cidade VARCHAR(100) not null,

    PRIMARY KEY (id)
);