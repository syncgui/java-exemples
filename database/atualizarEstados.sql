UPDATE estados
set nome = 'Maranhão'
where sigla = 'MA'

SELECT est.nome
FROM estados est
WHERE sigla = 'MA'

UPDATE estados
set nome = 'Paraná',
    populacao = 11.32
where sigla = 'PR'

SELECT est.nome,
    est.sigla,
    est.populacao
FROM estados est
WHERE sigla = 'PR'