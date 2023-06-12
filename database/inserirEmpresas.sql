INSERT INTO empresas 
    ( nome, cnpj ) 
VALUES('Bradesco', 29819521000157),
    ('Vale', 22618808000170), 
    ('Cielo', 10994767000137);

ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

DESC empresas
DESC cidades

SELECT
    *
FROM empresas

SELECT
    *
FROM
    cidades

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES(1, 1, 1),
    (1, 2, 0),
    (5, 1, 0),
    (5, 2, 1);