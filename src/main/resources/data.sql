INSERT INTO FUNCAO_USUARIO_EXTERNO(CO_FUNCAO, NO_FUNCAO) VALUES (1, 'Gestor');
INSERT INTO FUNCAO_USUARIO_EXTERNO(CO_FUNCAO, NO_FUNCAO) VALUES (2, 'Administrador');
INSERT INTO FUNCAO_USUARIO_EXTERNO(CO_FUNCAO, NO_FUNCAO) VALUES (3, 'Frente de Caixa');

INSERT INTO USUARIO_EXTERNO 
	(NU_CPF, NO_USUARIO, DE_EMAIL, IC_SITUACAO, NU_TELEFONE, IC_PERFIL_ACESSO, CO_FUNCAO) 
VALUES 
	('53585690904', 'TESTE USUARIO 1', 'teste1@teste.com', 'A', '71999769045', 1, 1);