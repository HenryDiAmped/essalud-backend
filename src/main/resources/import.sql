-- Algunas inserciones:

-- Insercion de Especialidades
INSERT INTO Especialidades (nombre_especialidad, descripcion) VALUES ('Cardiología', 'Especialidad médica enfocada en el corazón y sistema circulatorio.'),('Dermatología', 'Especialidad dedicada al diagnóstico y tratamiento de enfermedades de la piel.'),('Neurología', 'Se encarga del sistema nervioso y sus trastornos.'),('Pediatría', 'Especialidad médica centrada en la salud de los niños.'),('Ginecología', 'Se enfoca en el sistema reproductor femenino.'),('Ortopedia', 'Especialidad que trata las condiciones del sistema musculoesquelético.'),('Oftalmología', 'Diagnóstico y tratamiento de enfermedades oculares.'),('Psiquiatría', 'Se ocupa de los trastornos mentales y emocionales.'),('Oncología', 'Diagnóstico y tratamiento del cáncer.'),('Endocrinología', 'Estudio de las hormonas y las glándulas endocrinas.');

-- Insercion de Medicos
INSERT INTO Medicos (nombre_medico, id_especialidad) VALUES ('Dr. Juan Pérez', 1),('Dra. María Torres', 2),('Dr. Luis Gutiérrez', 3),('Dra. Ana Morales', 4),('Dr. Pedro Rivas', 5),('Dra. Carla Jiménez', 6),('Dr. Esteban Soto', 7),('Dra. Verónica Salas', 8),('Dr. Jorge Mendoza', 9),('Dra. Isabel Chávez', 10),('Dr. Ricardo Paredes', 1),('Dra. Natalia León', 2),('Dr. Hugo Fernández', 3),('Dra. Sofía Campos', 4),('Dr. Fernando Díaz', 5),('Dra. Daniela Rojas', 6),('Dr. Andrés Navarro', 7),('Dra. Teresa Blanco', 8),('Dr. Víctor Quispe', 9),('Dra. Lorena Palacios', 10);

-- Insercion de Jornada de los medicos
-- Médico 1: Cardiología - Lunes a Viernes
-- Médico 2: Dermatología - Martes y Jueves
-- Médico 3: Neurología - Lunes, Miércoles y Viernes
-- Médico 4: Pediatría - Martes a Sábado
-- Médico 5: Ginecología - Lunes a Jueves
-- Médico 6: Ortopedia - Miércoles a Domingo
-- Médico 7: Oftalmología - Lunes a Viernes
-- Médico 8: Psiquiatría - Martes y Viernes
-- Médico 9: Oncología - Lunes, Miércoles y Sábado
-- Médico 10: Endocrinología - Jueves y Domingo
-- Médico 11: Cardiología - Lunes a Viernes
-- Médico 12: Dermatología - Martes y Jueves
-- Médico 13: Neurología - Lunes, Miércoles y Viernes
-- Médico 14: Pediatría - Martes a Sábado
-- Médico 15: Ginecología - Lunes a Jueves
-- Médico 16: Ortopedia - Miércoles a Domingo
-- Médico 17: Oftalmología - Lunes a Viernes
-- Médico 18: Psiquiatría - Martes y Viernes
-- Médico 19: Oncología - Lunes, Miércoles y Sábado
-- Médico 20: Endocrinología - Jueves y Domingo
INSERT INTO Jornada_medicos (id_medico, dia_semana) VALUES (1, 'lunes'),(1, 'martes'),(1, 'miércoles'),(1, 'jueves'),(1, 'viernes'),(2, 'martes'),(2, 'jueves'),(3, 'lunes'),(3, 'miércoles'),(3, 'viernes'),(4, 'martes'),(4, 'miércoles'),(4, 'jueves'),(4, 'viernes'),(4, 'sábado'),(5, 'lunes'),(5, 'martes'),(5, 'miércoles'),(5, 'jueves'),(6, 'miércoles'),(6, 'jueves'),(6, 'viernes'),(6, 'sábado'),(6, 'domingo'),(7, 'lunes'),(7, 'martes'),(7, 'miércoles'),(7, 'jueves'),(7, 'viernes'),(8, 'martes'),(8, 'viernes'),(9, 'lunes'),(9, 'miércoles'),(9, 'sábado'),(10, 'jueves'),(10, 'domingo'),(11, 'lunes'),(11, 'martes'),(11, 'miércoles'),(11, 'jueves'),(11, 'viernes'),(12, 'martes'),(12, 'jueves'),(13, 'lunes'),(13, 'miércoles'),(13, 'viernes'),(14, 'martes'),(14, 'miércoles'),(14, 'jueves'),(14, 'viernes'),(14, 'sábado'),(15, 'lunes'),(15, 'martes'),(15, 'miércoles'),(15, 'jueves'),(16, 'miércoles'),(16, 'jueves'),(16, 'viernes'),(16, 'sábado'),(16, 'domingo'),(17, 'lunes'),(17, 'martes'),(17, 'miércoles'),(17, 'jueves'),(17, 'viernes'),(18, 'martes'),(18, 'viernes'),(19, 'lunes'),(19, 'miércoles'),(19, 'sábado'),(20, 'jueves'),(20, 'domingo');

-- Insercion de Sedes
INSERT INTO Sedes (nombre_distrito, nombre_sede) VALUES ('Ate', 'Hospital II Vitarte'),('Barranco', 'Policlínico Barranco'),('Breña', 'Policlínico Breña'),('Carabayllo', 'Hospital I Marino Molina Scippa'),('Chorrillos', 'Policlínico Juan Jose Rodriguez Lazo'),('Comas', 'Hospital I Marino Molina Scippa'),('El Agustino', 'Policlínico El Agustino'),('Independencia', 'Hospital I Independencia'),('Jesús María', 'Hospital Nacional Edgardo Rebagliati Martins'),('La Molina', 'Hospital I Carlos Alcántara Butterfield'),('La Victoria', 'Hospital Nacional Guillermo Almenara Irigoyen'),('Lince', 'Policlínico Lince'),('Los Olivos', 'Policlínico Los Olivos'),('Lurigancho (Chosica)', 'Policlínico Chosica'),('Lurin', 'Centro de Atención Primaria II Lurín'),('Magdalena del Mar', 'Policlínico Magdalena del Mar'),('Miraflores', 'Hospital III Suárez Angamos'),('Pueblo Libre', 'Policlínico Pueblo Libre'),('Puente Piedra', 'Centro de Atención Primaria III Puente Piedra'),('Rimac', 'Policlínico Francisco Pizarro'),('San Borja', 'Policlínico San Borja'),('San Isidro', 'Centro de Atención Primaria III San Isidro'),('San Juan de Lurigancho', 'Hospital I Marco Aurelio Díaz Ufano'),('San Juan de Miraflores', 'Policlínico San Juan de Miraflores'),('San Luis', 'Policlínico de Complejidad Creciente San Luis'),('San Martín de Porres', 'Policlínico San Martín de Porres'),('San Miguel', 'Hospital I Octavio Mongrut Muñoz'),('Santa Anita', 'Policlínico Santa Anita'),('Santiago de Surco', 'Policlínico Próceres'),('Surquillo', 'Policlínico Surquillo'),('Villa El Salvador', 'Hospital I Uldarico Rocca Fernández'),('Villa María del Triunfo', 'Hospital Guillermo Kaelin de la Fuente');

-- Insercion de Detalle_sede
INSERT INTO Detalle_sede (id_especialidad, id_sedes) VALUES (1, 1),(2, 1),(3, 1),(4, 2),(5, 2),(6, 3),(7, 3),(1, 4),(8, 4),(9, 5),(2, 5),(3, 6),(10, 6),(4, 7),(5, 7),(6, 8),(1, 8),(2, 9),(3, 9),(4, 9),(5, 10),(6, 10),(7, 11),(8, 11),(9, 12),(10, 12),(1, 13),(2, 13),(3, 14),(4, 14),(5, 15),(6, 15),(7, 16),(8, 16),(9, 17),(10, 17),(1, 18),(2, 18),(3, 19),(4, 19),(5, 20),(6, 20),(7, 21),(8, 21),(9, 22),(10, 22),(1, 23),(2, 23), (3, 23),(4, 24),(5, 24),(6, 25),(7, 25),(8, 26),(9, 26),(10, 27),(1, 27),(2, 28),(3, 28),(4, 29),(5, 29),(6, 30),(7, 30),(8, 31),(9, 31),(10, 32),(1, 32);

-- Insercion de 4 admins
INSERT INTO Usuarios (numero_celular, num_documento, apellido, correo_electronico, nombre, contrasena, tipo_documento, tipo_usuario) VALUES ('987654321', '12345678', 'Enciso', 'henry.enciso@correo.com', 'Henry', 'admin123', 'DNI', 'ADMINISTRADOR'),('987654322', '87654321', 'Llontop', 'claudio.llontop@correo.com', 'Claudio', 'admin123', 'DNI', 'ADMINISTRADOR'),('987654323', '11223344', 'Garcia', 'belkin.garcia@correo.com', 'Belkin', 'admin123', 'DNI', 'ADMINISTRADOR'),('987654324', '44332211', 'Ramirez', 'sebastian.ramirez@correo.com', 'Sebastian', 'admin123', 'DNI', 'ADMINISTRADOR');
INSERT INTO Administradores (id_usuario) VALUES (1),(2),(3),(4);