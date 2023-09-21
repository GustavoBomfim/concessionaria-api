create table veiculo
(
    chassi     varchar(17) not null,
    placa      varchar(10),
    disponivel boolean,
    preco double,
    primary key (chassi)
);
create table modelo
(
    FK_chassi       varchar(17),
    marca           varchar(30),
    cor             varchar(30),
    ano_fabricacao  int,
    ano_modelo      int,
    combustivel     varchar(15),
    portas          int,
    teso_solar      boolean,
    ar_condicionado boolean,
    foreign key (FK_chassi) references veiculo (chassi)
);
create table cliente
(
    cpf_cnpj    varchar(12),
    nome        varchar(45),
    telefone    varchar(13),
    email       varchar(45),
    compras     varchar(45),
    uf          varchar(2),
    cidade      varchar(30),
    cep         varchar(10),
    numero      varchar(6),
    complemento varchar(50),
    primary key (cpf_cnpj)
);
create table proposta
(
    id                bigint auto_increment,
    FK_cpf_cnpj       varchar(12),
    FK_id_funcionario bigint,
    chassi            varchar(17),
    status_pagamento  varchar(30),
    primary key (id),
    foreign key (FK_cpf_cnpj) references cliente (cpf_cnpj),
    foreign key (FK_id_funcionario) references funcionario (id)
);
create table comissao
(
    id                bigint auto_increment,
    FK_id_funcionario bigint,
    FK_id_proposta    bigint,
    primary key (id),
    foreign key (FK_id_funcionario) references funcionario (id),
    foreign key (FK_id_proposta) references proposta (id)
);