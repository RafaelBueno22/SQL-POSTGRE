SELECT * FROM produto

SELECT * FROM categoria


SELECT
produto.id, produto.nome, produto.preco,
categoria.nome AS categoria
FROM produto INNER JOIN categoria
ON produto.categoria_id = categoria.id


UPDATE categoria
SET nome = 'Brinquedo'
WHERE id = 4

SELECT 
p.id, p.nome, p.preco,
c.nome AS categoria
FROM produto p
INNER JOIN categoria c
ON p.categoria_id = c.id

SELECT
p.nome AS produto,
c.nome AS categoria
FROM produto p
LEFT JOIN categoria c
ON p.categoria_id = c.id



CREATE TABLE pedido(
	id SERIAL PRIMARY KEY,
	cliente_id INTEGER NOT NULL,
	data_pedido DATE DEFAULT CURRENT_DATE,
	status VARCHAR(30) DEFAULT 'ABERTO',
	CONSTRAINT fk_pedido_cliente
	FOREIGN KEY (cliente_id)
	REFERENCES cliente(id)
);

CREATE TABLE item_pedido (
	id SERIAL PRIMARY KEY,
	pedido_id INTEGER NOT NULL,
	produto_id INTEGER NOT NULL,
	quantidade INTEGER NOT NULL,
	valor_unitario NUMERIC(10,2) NOT NULL,
		CONSTRAINT fk_item_pedido
		FOREIGN KEY (pedido_id)
		REFERENCES pedido(id),
		CONSTRAINT fk_item_produto
		FOREIGN KEY (produto_id)
		REFERENCES produto(id)
);

SELECT * FROM pedido

INSERT INTO pedido
(cliente_id, status)
VALUES
(1, 'FINALIZADO'),
(4, 'FINALIZADO'),
(1, 'ABERTO');

INSERT INTO item_pedido
(pedido_id, produto_id, quantidade, valor_unitario)
VALUES
(7, 1, 2, 45.90),
(7, 2, 1, 89.90),
(8, 3, 1, 899.90),
(9, 1, 1, 45.90);

SELECT
	p.id AS pedido,
	c.nome AS cliente,
	p.data_pedido,
	p.status
	FROM pedido p
	INNER JOIN cliente c
	ON p.cliente_id = c.id;
	
	
SELECT
    ped.id AS pedido,
    cli.nome AS cliente,
    pro.nome AS produto,
    item.quantidade,
    item.valor_unitario
FROM item_pedido item
INNER JOIN pedido ped
ON item.pedido_id = ped.id
INNER JOIN cliente cli
ON ped.cliente_id = cli.id
INNER JOIN produto pro
ON item.produto_id = pro.id;



SELECT pro.nome,
       item.quantidade,
	   item.valor_unitario,
	   item.quantidade * item.valor_unitario AS subtotal
FROM item_pedido item 
INNER JOIN produto pro
ON item.produto_id = pro.id
	   

SELECT COUNT(*)
FROM cliente;

SELECT SUM(estoque)
FROM produto;

SELECT AVG(preco) AS preco_medio
FROM produto;

