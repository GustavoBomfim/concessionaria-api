create table funcionario
(
    id               bigint NOT NULL AUTO_INCREMENT,
    cpf_cnpj         varchar(12),
    nome             varchar(100),
    telefone         varchar(13),
    email            varchar(50),
    compras          varchar(70),
    salario_base double,
    percentual_comissao double,
    cargo            varchar(30),
    data_contratacao date,
    uf               varchar(2),
    cidade           varchar(30),
    cep              varchar(10),
    numero           varchar(6),
    complemento      varchar(50),
    primary key (id)
);