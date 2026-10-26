CREATE TABLE servico_zoo (
 	id SERIAL PRIMARY KEY,
	animal_id INTEGER NOT NULL,
	zelador_id INTEGER NOT NULL,
	descricao TEXT NOT NULL,
	data_execucao DATE NOT NULL DEFAULT CURRENT_DATE,
	executado BOOLEAN NOT NULL DEFAULT FALSE,
	
	CONSTRAINT fk_servico_animal FOREIGN KEY (animal_id) REFERENCES animal (id),
	
	CONSTRAINT fk_servico_zelador FOREIGN KEY (zelador_id) REFERENCES zelador (id),
	
	CONSTRAINT chk_descricao_servico CHECK (LENGTH(TRIM(descricao)) >0 )
)

SELECT * FROM servico_zoo