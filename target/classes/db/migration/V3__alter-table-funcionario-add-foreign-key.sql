alter table funcionario
    add column FK_id_proposta bigint,
    add column FK_id_comissao bigint;

alter table funcionario
    add foreign key (FK_id_proposta) references proposta (id),
    add foreign key (FK_id_comissao) references comissao (id);