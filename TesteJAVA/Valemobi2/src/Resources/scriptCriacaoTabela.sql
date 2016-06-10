
/***************************************************************************
Inicio do Script de Criacao das Tabelas 

Tabela Customer
***************************************************************************/
create table Customer (
    id_customer int,
    cpf_cnpj varchar(15),
    nome varchar(50),
    is_active boolean,
    vl_total double
)  ENGINE=innodb;

/***************************************************************************
Alter Table para adicionar as constraints
***************************************************************************/

-- Table Customer
ALTER TABLE Customer ADD CONSTRAINT Pk_customer 
PRIMARY KEY (id_customer);


/***************************************************************************
Fim das Constraints

Fim do Script 
***************************************************************************/