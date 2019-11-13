--CAIXA INSERCÕES
INSERT INTO caixa(nome, saldo, observacoes) values ('Caixa da mocidade', 300, 'Esse caixa é dedicado para o conjunto de jovens')
INSERT INTO caixa(nome, saldo, observacoes) values ('Caixa da banda', 200, 'Esse caixa é dedicado ao departamento musical Geração SETE')

-- ENTRADAS
INSERT INTO entrada(descricao, data, valor, contribuidor, caixa_id) values ('Venda da banda', now(), 50, '', 2)
INSERT INTO entrada(descricao, data, valor, contribuidor, caixa_id) values ('Venda da banda', now(), 150, '', 2)
INSERT INTO entrada(descricao, data, valor, contribuidor, caixa_id) values ('Venda da movidade', now(), 100, '', 1)
INSERT INTO entrada(descricao, data, valor, contribuidor, caixa_id) values ('Contribuição em éspecie', now(), 200, 'Osaila Oliveira', 1)

-- PENDENCIAS
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Pedro Pereira', 5, 'ATIVA', 1)
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Liduina Feitosa', 10, 'ATIVA', 1)
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Josilene Freitas', 10, 'QUITADA', 1)
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Eliabe Amorim', 10, 'ATIVA', 2)