INSERT INTO estado (id, descripcion) VALUES(1, 'En curso');
INSERT INTO estado (id, descripcion) VALUES(2, 'Finalizado');

INSERT INTO departamento (id, numero) VALUES(1, 101);
INSERT INTO departamento (id, numero) VALUES(2, 102);
INSERT INTO departamento (id, numero) VALUES(3, 201);
INSERT INTO departamento (id, numero) VALUES(4, 202);
INSERT INTO departamento (id, numero) VALUES(5, 301);
INSERT INTO departamento (id, numero) VALUES(6, 302);


INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(1, '2020-01-01 00:00:00', 1, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(2, '2020-01-13 00:00:00', 1, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(3, '2020-02-15 00:00:00', 2, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(4, '2020-02-20 00:00:00', 2, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(5, '2020-03-03 00:00:00', 3, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(6, '2020-03-07 00:00:00', 3, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(7, '2020-04-01 00:00:00', 4, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(8, '2020-05-23 00:00:00', 4, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(9, '2020-04-15 00:00:00', 5, 2);
INSERT INTO arriendo_quincho (id, fecha, departamento_id, estado_id) VALUES(10, '2020-08-11 00:00:00', 5, 1);