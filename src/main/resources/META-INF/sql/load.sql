--CAIXA INSERCÕES
INSERT INTO caixa(nome, saldo, observacoes) values ('Caixa da mocidade', 140, 'Esse caixa é dedicado para o conjunto de jovens')
INSERT INTO caixa(nome, saldo, observacoes) values ('Caixa da banda', 135, 'Esse caixa é dedicado ao departamento musical Geração SETE')

-- ENTRADAS
INSERT INTO entrada(descricao, data, valor, tipo_movimentacao, caixa_id) values ('Venda da banda', now(), 50, 'ENTRADA', 2)
INSERT INTO entrada(descricao, data, valor, tipo_movimentacao, caixa_id) values ('Venda da banda', now(), 150, 'ENTRADA', 2)
INSERT INTO entrada(descricao, data, valor, tipo_movimentacao, caixa_id) values ('Venda da moCidade', now(), 100, 'ENTRADA', 1)
INSERT INTO entrada(descricao, data, valor, tipo_movimentacao, caixa_id) values ('Venda da mocidade', now(), 200, 'ENTRADA', 1)

-- PENDENCIAS
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Pedro Pereira', 5, 'ATIVA', 1)
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Liduina Feitosa', 10, 'ATIVA', 1)
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Josilene Freitas', 10, 'QUITADA', 1)
INSERT INTO pendencia(titular, valor, situacao, entrada_id) values ('Eliabe Amorim', 10, 'ATIVA', 2)

-- SAIDAS
INSERT INTO saida(descricao, data, valor, tipo_movimentacao, observacoes, caixa_id) values ('Doação para o departamento musical', now(), 150, 'SAIDA', 'Essa quantia foi destinada a compra da bateria eletrônica', 1)
INSERT INTO saida(descricao, data, valor, tipo_movimentacao, observacoes, caixa_id) values ('Complemento para a venda', now(), 10,'SAIDA', 'Essa quantia foi retirada para compra de um peito de frango para a venda da mocidade', 1)
INSERT INTO saida(descricao, data, valor, tipo_movimentacao, observacoes, caixa_id) values ('Compra de acordoamento do violão', now(), 15, 'SAIDA', '', 2)
INSERT INTO saida(descricao, data, valor, tipo_movimentacao, observacoes, caixa_id) values ('Manutenção de equipamentos', now(), 50, 'SAIDA', 'Essa quantia foi usada para manutenção dos cabos dos instrumentos', 2)