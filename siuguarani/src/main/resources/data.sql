INSERT INTO alumnos (student_id, nombre, apellido, email, password, fecha_nacimiento, carrera)
VALUES (11, 'Juan', 'Perez', 'juan.perez1@guarani.edu', 'hola', '2001-01-15', 'AUS'),
(12, 'Ana', 'Gomez', 'ana.gomez2@guarani.edu', 'hola', '2000-02-20', 'AUS'),
(43767911, 'Martin Oscar', 'Pavan', 'pavanmartinoscar@gmail.com', 'hola', '2002-05-03', 'AUS');
        


INSERT INTO materias (codigo, nombre, descripcion, carrera, anio) VALUES
('A1601', 'ANALISIS_MATEMATICO_I', 'Analisis Matematico I', 'AUS', 1),
('A1602', 'LOGICA_SIMBOLICA', 'Logica Simbolica', 'AUS', 1),
('A1603', 'TEORIA_DE_GRAFOS_Y_ALGORITMIA', 'Teoria de Grafos y Algoritmia', 'AUS', 1),
('A1604', 'TALLER_DE_PROGRAMACION_I', 'Taller de Programacion I', 'AUS', 1),
('A1605', 'INGLES_TECNICO_I', 'Ingles Tecnico I', 'AUS', 1),

('A1606', 'ANALISIS_MATEMATICO_II', 'Analisis Matematico II', 'AUS', 1),
('A1607', 'ALGORITMOS_Y_ESTRUCTURAS_DE_DATOS_I', 'Algoritmos y Estructuras de Datos I', 'AUS', 1),
('A1608', 'ARQUITECTURA_DE_LAS_COMPUTADORAS_I', 'Arquitectura de las Computadoras I', 'AUS', 1),
('A1609', 'TALLER_DE_PROGRAMACION_II', 'Taller de Programacion II', 'AUS', 1),
( 'A1610', 'INGLES_TECNICO_II', 'Ingles Tecnico II', 'AUS', 1),

( 'A1611', 'ALGORITMOS_Y_ESTRUCTURAS_DE_DATOS_II', 'Algoritmos y Estructuras de Datos II', 'AUS', 2),
( 'A1612', 'DISENO_ORIENTADO_A_OBJETOS', 'Diseno Orientado a Objetos', 'AUS', 2),
( 'A1613', 'BASES_DE_DATOS', 'Bases de Datos', 'AUS', 2),
( 'A1614', 'PROBABILIDAD_Y_ESTADISTICA', 'Probabilidad y Estadistica', 'AUS', 2),
( 'A1615', 'ARQUITECTURA_DE_LAS_COMPUTADORAS_II', 'Arquitectura de las Computadoras II', 'AUS', 2),

( 'A1616', 'SISTEMAS_OPERATIVOS', 'Sistemas Operativos', 'AUS', 2),
( 'A1617', 'REDES_DE_COMPUTADORAS_I', 'Redes de Computadoras I', 'AUS', 2),
( 'A1618', 'TALLER_DE_PROGRAMACION_III', 'Taller de Programacion III', 'AUS', 2),
( 'A1619', 'TEORIA_DE_LENGUAJES', 'Teoria de Lenguajes', 'AUS', 2),

( 'A1630', 'PASANTIA_EXTERNA', 'Pasantia Externa', 'AUS', 3),
( 'A1620', 'SEGURIDAD_INFORMATICA', 'Seguridad Informatica', 'AUS', 3),
( 'A1621', 'REDES_DE_COMPUTADORAS_II', 'Redes de Computadoras II', 'AUS', 3),
( 'A1622', 'INGENIERIA_DE_SOFTWARE_I', 'Ingenieria de Software I', 'AUS', 3),
( 'A1623', 'TALLER_DE_PROGRAMACION_IV', 'Taller de Programacion IV', 'AUS', 3),

( 'A1624', 'INGENIERIA_DE_SOFTWARE_II', 'Ingenieria de Software II', 'AUS', 3),
( 'A1625', 'GESTION_DE_LAS_ORGANIZACIONES', 'Gestion de las Organizaciones', 'AUS', 3),
( 'A1626', 'PROGRAMACION_PROFESIONAL', 'Programacion Profesional', 'AUS', 3),
( 'A1627', 'SEMINARIO_I', 'Seminario I', 'AUS', 3),
( 'A1628', 'SEMINARIO_II', 'Seminario II', 'AUS', 3),
( 'A1629', 'SEMINARIO_III', 'Seminario III', 'AUS', 3);

-- Juan  y Ana 
INSERT INTO inscripciones_materias (alumno_id, materia_id, nota, estado) VALUES
(1, 1, 7, 'APROBADO'),
(1, 2, 7, 'APROBADO'),
(1, 3, 8, 'APROBADO'),
(1, 4, 7, 'APROBADO'),
(1, 5, 7, 'APROBADO'),
(1, 6, 8, 'APROBADO'),
(1, 7, 7, 'APROBADO'),
(1, 8, 7, 'APROBADO'),
(1, 9, 7, 'APROBADO'),
( 1, 10, 7, 'APROBADO'),

( 2, 1, 7, 'APROBADO'),
( 2, 2, 7, 'APROBADO'),
( 2, 3, 8, 'APROBADO'),
( 2, 4, 7, 'APROBADO'),
( 2, 5, 7, 'APROBADO'),
( 2, 6, 8, 'APROBADO'),
( 2, 7, 7, 'APROBADO'),
( 2, 8, 7, 'APROBADO'),
( 2, 9, 7, 'APROBADO'),
( 2, 10, 7, 'APROBADO');

-- Martin Oscar
INSERT INTO inscripciones_materias (alumno_id, materia_id, nota, estado) VALUES
(3, 1, 7, 'APROBADO'),
(3, 2, 7, 'APROBADO'),
(3, 3, 8, 'APROBADO'),
(3, 4, 7, 'APROBADO'),
(3, 5, 7, 'APROBADO'),
(3, 6, 7, 'APROBADO'),
(3, 7, 7, 'APROBADO'),
(3, 8, 7, 'APROBADO'),
(3, 9, 7, 'APROBADO'),
(3, 10, 7, 'APROBADO'),
(3, 11, 7, 'APROBADO'),
(3, 12, 7, 'APROBADO'),
(3, 13, 7, 'APROBADO'),
(3, 14, 7, 'APROBADO'),
(3, 15, 7, 'APROBADO'),
(3, 16, 7, 'APROBADO'),
(3, 17, 7, 'APROBADO'),
(3, 18, 7, 'APROBADO'),
(3, 19, 7, 'APROBADO'),
(3, 20, 7, 'APROBADO'),
(3, 21, 7, 'APROBADO'),
(3, 22, 7, 'APROBADO'),
(3, 23, 7, 'APROBADO'),
(3, 24, 0, 'EN_CURSO'),
(3, 25, 7, 'APROBADO');

-- 1º AÑO - Segundo Cuatrimestre
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (6, 1);     -- Analisis Matematico II ← Analisis Matematico I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (7, 3);     -- Alg. y Estr. Datos I ← Teoría de Grafos
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (7, 4);     -- Alg. y Estr. Datos I ← Taller de Programación I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (9, 3);     -- Taller de Programación II ← Teoría de Grafos
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (9, 4);     -- Taller de Programación II ← Taller de Programación I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (10, 5);    -- Inglés Técnico II ← Inglés Técnico I

-- 2º AÑO - Primer Cuatrimestre
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (11, 7);    -- Alg. y Estr. Datos II ← Alg. y Estr. Datos I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (11, 9);    -- Alg. y Estr. Datos II ← Taller de Programación II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (12, 7);    -- Diseño Orientado a Objetos ← Alg. y Estr. Datos I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (12, 9);    -- Diseño Orientado a Objetos ← Taller de Programación II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (13, 7);    -- Bases de Datos ← Alg. y Estr. Datos I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (13, 9);    -- Bases de Datos ← Taller de Programación II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (14, 6);    -- Probabilidad y Estadística ← Análisis Matemático II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (15, 8);    -- Arquitectura de las Computadoras II ← Arquitectura de las Computadoras I

-- 2º AÑO - Segundo Cuatrimestre
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (16, 15);   -- Sistemas Operativos ← Arquitectura de las Computadoras II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (17, 15);   -- Redes de Computadoras I ← Arquitectura de las Computadoras II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (18, 11);   -- Taller de Programación III ← Alg. y Estr. Datos II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (18, 13);   -- Taller de Programación III ← Bases de Datos
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (19, 14);   -- Teoría de Lenguajes ← Probabilidad y Estadística

-- 3º AÑO - Primer Cuatrimestre
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (21, 16);   -- Pasantía Externa ← Sistemas Operativos
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (21, 17);   -- Pasantía Externa ← Redes de Computadoras I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (21, 18);   -- Pasantía Externa ← Taller de Programación III
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (21, 19);   -- Pasantía Externa ← Teoría de Lenguajes
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (22, 17);   -- Seguridad Informática ← Redes de Computadoras I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (22, 18);   -- Seguridad Informática ← Taller de Programación III
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (23, 17);   -- Redes de Computadoras II ← Redes de Computadoras I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (24, 11);   -- Ingeniería de Software I ← Alg. y Estr. Datos II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (24, 19);   -- Ingeniería de Software I ← Teoría de Lenguajes
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (25, 23);   -- Taller de Programación IV ← Redes de Computadoras II

-- 3º AÑO - Segundo Cuatrimestre
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (26, 24);   -- Ingeniería de Software II ← Ingeniería de Software I
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (26, 25);   -- Ingeniería de Software II ← Taller de Programación IV
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (27, 22);   -- Gestión de las Organizaciones ← Seguridad Informática
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (28, 25);   -- Programación Profesional ← Taller de Programación IV

-- Seminarios
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (30, 28);   -- Seminario III ← Programación Profesional
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (30, 26);   -- Seminario III ← Ingeniería de Software II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (30, 25);   -- Seminario III ← Taller de Programación IV
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (29, 26);   -- Seminario II ← Ingeniería de Software II
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (29, 28);   -- Seminario II ← Programación Profesional
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (29, 25);   -- Seminario II ← Taller de Programación IV

INSERT INTO correlativas (materia_id, correlativa_id) VALUES (20,16);
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (20,17);
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (20,18);
INSERT INTO correlativas (materia_id, correlativa_id) VALUES (20,19);