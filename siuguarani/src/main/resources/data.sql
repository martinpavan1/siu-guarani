INSERT INTO alumnos (id, student_id, nombre, apellido, email, password, fecha_nacimiento, carrera)
VALUES (1, 11, 'Juan', 'Perez', 'juan.perez1@guarani.edu', 'hola', '2001-01-15', 'AUS'),
(2, 12, 'Ana', 'Gomez', 'ana.gomez2@guarani.edu', 'hola', '2000-02-20', 'AUS'),
(3, 43767911, 'Martin Oscar', 'Pavan', 'pavanmartinoscar@gmail.com', 'hola', '2002-05-03', 'AUS');
        


INSERT INTO materias (id, codigo, nombre, descripcion, carrera, anio) VALUES
(1, 'A1601', 'ANALISIS_MATEMATICO_I', 'Analisis Matematico I', 'AUS', 1),
(2, 'A1602', 'LOGICA_SIMBOLICA', 'Logica Simbolica', 'AUS', 1),
(3, 'A1603', 'TEORIA_DE_GRAFOS_Y_ALGORITMIA', 'Teoria de Grafos y Algoritmia', 'AUS', 1),
(4, 'A1604', 'TALLER_DE_PROGRAMACION_I', 'Taller de Programacion I', 'AUS', 1),
(5, 'A1605', 'INGLES_TECNICO_I', 'Ingles Tecnico I', 'AUS', 1),

(6, 'A1606', 'ANALISIS_MATEMATICO_II', 'Analisis Matematico II', 'AUS', 1),
(7, 'A1607', 'ALGORITMOS_Y_ESTRUCTURAS_DE_DATOS_I', 'Algoritmos y Estructuras de Datos I', 'AUS', 1),
(8, 'A1608', 'ARQUITECTURA_DE_LAS_COMPUTADORAS_I', 'Arquitectura de las Computadoras I', 'AUS', 1),
(9, 'A1609', 'TALLER_DE_PROGRAMACION_II', 'Taller de Programacion II', 'AUS', 1),
(10, 'A1610', 'INGLES_TECNICO_II', 'Ingles Tecnico II', 'AUS', 1),

(11, 'A1611', 'ALGORITMOS_Y_ESTRUCTURAS_DE_DATOS_II', 'Algoritmos y Estructuras de Datos II', 'AUS', 2),
(12, 'A1612', 'DISENO_ORIENTADO_A_OBJETOS', 'Diseno Orientado a Objetos', 'AUS', 2),
(13, 'A1613', 'BASES_DE_DATOS', 'Bases de Datos', 'AUS', 2),
(14, 'A1614', 'PROBABILIDAD_Y_ESTADISTICA', 'Probabilidad y Estadistica', 'AUS', 2),
(15, 'A1615', 'ARQUITECTURA_DE_LAS_COMPUTADORAS_II', 'Arquitectura de las Computadoras II', 'AUS', 2),

(16, 'A1616', 'SISTEMAS_OPERATIVOS', 'Sistemas Operativos', 'AUS', 2),
(17, 'A1617', 'REDES_DE_COMPUTADORAS_I', 'Redes de Computadoras I', 'AUS', 2),
(18, 'A1618', 'TALLER_DE_PROGRAMACION_III', 'Taller de Programacion III', 'AUS', 2),
(19, 'A1619', 'TEORIA_DE_LENGUAJES', 'Teoria de Lenguajes', 'AUS', 2),

(20, 'A1630', 'PASANTIA_EXTERNA', 'Pasantia Externa', 'AUS', 3),
(21, 'A1620', 'SEGURIDAD_INFORMATICA', 'Seguridad Informatica', 'AUS', 3),
(22, 'A1621', 'REDES_DE_COMPUTADORAS_II', 'Redes de Computadoras II', 'AUS', 3),
(23, 'A1622', 'INGENIERIA_DE_SOFTWARE_I', 'Ingenieria de Software I', 'AUS', 3),
(24, 'A1623', 'TALLER_DE_PROGRAMACION_IV', 'Taller de Programacion IV', 'AUS', 3),

(25, 'A1624', 'INGENIERIA_DE_SOFTWARE_II', 'Ingenieria de Software II', 'AUS', 3),
(26, 'A1625', 'GESTION_DE_LAS_ORGANIZACIONES', 'Gestion de las Organizaciones', 'AUS', 3),
(27, 'A1626', 'PROGRAMACION_PROFESIONAL', 'Programacion Profesional', 'AUS', 3),
(28, 'A1627', 'SEMINARIO_I', 'Seminario I', 'AUS', 3),
(29, 'A1628', 'SEMINARIO_II', 'Seminario II', 'AUS', 3),
(30, 'A1629', 'SEMINARIO_III', 'Seminario III', 'AUS', 3);

-- Juan (id=1) y Ana (id=2): primer año aprobado (materias 1 a 10)
INSERT INTO inscripciones_materias (id, alumno_id, materia_id, nota, estado) VALUES
(1, 1, 1, 7.0, 'APROBADO'),
(2, 1, 2, 7.5, 'APROBADO'),
(3, 1, 3, 8.0, 'APROBADO'),
(4, 1, 4, 7.0, 'APROBADO'),
(5, 1, 5, 7.5, 'APROBADO'),
(6, 1, 6, 8.0, 'APROBADO'),
(7, 1, 7, 7.0, 'APROBADO'),
(8, 1, 8, 7.5, 'APROBADO'),
(9, 1, 9, 7.0, 'APROBADO'),
(10, 1, 10, 7.5, 'APROBADO'),

(11, 2, 1, 7.0, 'APROBADO'),
(12, 2, 2, 7.5, 'APROBADO'),
(13, 2, 3, 8.0, 'APROBADO'),
(14, 2, 4, 7.0, 'APROBADO'),
(15, 2, 5, 7.5, 'APROBADO'),
(16, 2, 6, 8.0, 'APROBADO'),
(17, 2, 7, 7.0, 'APROBADO'),
(18, 2, 8, 7.5, 'APROBADO'),
(19, 2, 9, 7.0, 'APROBADO'),
(20, 2, 10, 7.5, 'APROBADO');

-- Martin Oscar (id=3) aprobado hasta materia 25 y cursando las siguientes (26-30)
INSERT INTO inscripciones_materias (id, alumno_id, materia_id, nota, estado) VALUES
(21, 3, 1, 7.5, 'APROBADO'),
(22, 3, 2, 7.0, 'APROBADO'),
(23, 3, 3, 8.0, 'APROBADO'),
(24, 3, 4, 7.5, 'APROBADO'),
(25, 3, 5, 7.0, 'APROBADO'),
(26, 3, 6, 7.5, 'APROBADO'),
(27, 3, 7, 7.0, 'APROBADO'),
(28, 3, 8, 7.5, 'APROBADO'),
(29, 3, 9, 7.0, 'APROBADO'),
(30, 3, 10, 7.5, 'APROBADO'),
(31, 3, 11, 7.0, 'APROBADO'),
(32, 3, 12, 7.5, 'APROBADO'),
(33, 3, 13, 7.0, 'APROBADO'),
(34, 3, 14, 7.5, 'APROBADO'),
(35, 3, 15, 7.0, 'APROBADO'),
(36, 3, 16, 7.5, 'APROBADO'),
(37, 3, 17, 7.0, 'APROBADO'),
(38, 3, 18, 7.5, 'APROBADO'),
(39, 3, 19, 7.0, 'APROBADO'),
(40, 3, 20, 7.5, 'APROBADO'),
(41, 3, 21, 7.0, 'APROBADO'),
(42, 3, 22, 7.5, 'APROBADO'),
(43, 3, 23, 7.0, 'APROBADO'),
(44, 3, 24, 0, 'EN_CURSO'),
(45, 3, 25, 7.0, 'APROBADO');