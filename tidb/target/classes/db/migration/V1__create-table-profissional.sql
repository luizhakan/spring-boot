create table profissional (
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    telefone varchar(20) not null unique,
    registro varchar(9) not null unique,
    especialidade varchar(40) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(10) not null,
    complemento varchar(100) not null,
    numero varchar(5) not null,
    cidade varchar(100) not null,
    uf varchar(2) not null,
    ativo tinyint not null,

    primary key (id)
);