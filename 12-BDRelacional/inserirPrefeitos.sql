select * from cidades;

INSERT INTO prefeitos
    (nome, cidade_id)
VALUES
    ('Rodrigo Neves', 3),
    ('Raquel Lyra', 4),
    ('Zenaldo Coutinho', null);

select * from prefeitos;

INSERT INTO prefeitos
    (nome, cidade_id)
VALUES
    ('Rafael Greca', null);

-- ERRO: violação de restrição de chave estrangeira
INSERT INTO prefeitos
    (nome, cidade_id)
VALUES
    ('Rodrigo Pinheiro', 3);