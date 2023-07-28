-- SELECT * FROM usuario;
-- DROP DATABASE prevencion;
USE prevencion;
INSERT INTO `usuario` VALUES 
-- pass: cliente: 1010
-- pass: administrativo: 2020
-- pass: profesional: 3030
(1,'cliente','cliente1','$2a$12$ReiiyJ9a7kvjHF3HjqLPl.eqlnv2EGC2e1OeLgOJr3EWd1e2eZjRi'),
(2,'cliente','cliente2','$2a$12$ReiiyJ9a7kvjHF3HjqLPl.eqlnv2EGC2e1OeLgOJr3EWd1e2eZjRi'),
(3,'cliente','cliente3','$2a$12$ReiiyJ9a7kvjHF3HjqLPl.eqlnv2EGC2e1OeLgOJr3EWd1e2eZjRi'),
(4,'administrativo','usuario4','$2a$12$265cZYjRd6oy0Zdvkvghn.Iz1MGKdNrXR0tR/O97CVpDXZwZqeRTm'),
(5,'administrativo','usuario5','$2a$12$265cZYjRd6oy0Zdvkvghn.Iz1MGKdNrXR0tR/O97CVpDXZwZqeRTm'),
(6,'profesional','prof1','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm'),
(7,'administrativo','admin3','$2a$12$265cZYjRd6oy0Zdvkvghn.Iz1MGKdNrXR0tR/O97CVpDXZwZqeRTm'),
(8,'administrativo','admin1','$2a$12$265cZYjRd6oy0Zdvkvghn.Iz1MGKdNrXR0tR/O97CVpDXZwZqeRTm'),
(9,'cliente','cliente4','$2a$12$ReiiyJ9a7kvjHF3HjqLPl.eqlnv2EGC2e1OeLgOJr3EWd1e2eZjRi'),
(10,'profesional','profesional2','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm'),
(11,'profesional','profesional3','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm'),
(12,'profesional','profesional4','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm');

INSERT INTO profesional (run, nombre, apellido, correo, telefono, cargo, usuario_id)
VALUES
  ('12345678-9', 'Ana', 'García', 'ana.garcia@example.com', '+56 9 1111 1111', 'Gerente de Ventas', 6),
  ('98765432-1', 'Carlos', 'López', 'carlos.lopez@example.com', '+56 9 2222 2222', 'Ingeniero de Software', 10),
  ('45678912-3', 'Laura', 'Martínez', 'laura.martinez@example.com', '+56 9 3333 3333', 'Analista Financiero', 11),
  ('32198765-4', 'Martín', 'Rodríguez', 'martin.rodriguez@example.com', '+56 9 4444 4444', 'Arquitecto', 12);

INSERT INTO administrativo (run, nombre, apellido, correo, area, usuario_id)
VALUES
    ('12345678-9', 'Ana', 'Rodríguez', 'ana.rodriguez@example.com', 'Recursos Humanos', 4),
    ('98765432-1', 'Carlos', 'Gómez', 'carlos.gomez@example.com', 'Finanzas', 5),
    ('45678912-3', 'Laura', 'Fernández', 'laura.fernandez@example.com', 'Marketing', 7),
    ('32198765-4', 'Martín', 'Pérez', 'martin.perez@example.com', 'Ventas', 8);

INSERT INTO cliente (rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id)
VALUES
  ('12345678-9', 'Juan', 'Pérez', 'juan.perez@example.com', '+56 9 1111 1111', 'AFP Provida', 'isapre', 'Calle 1', 'Santiago', 35, 1),
  ('98765432-1', 'María', 'López', 'maria.lopez@example.com', '+56 9 2222 2222', 'AFP Habitat', 'fonasa', 'Avenida 2', 'Valparaíso', 40, 2),
  ('45678912-3', 'Carlos', 'González', 'carlos.gonzalez@example.com', '+56 9 3333 3333', 'AFP Cuprum', 'isapre', 'Calle 3', 'Concepción', 28, 3),
  ('32198765-4', 'Laura', 'Rodríguez', 'laura.rodriguez@example.com', '+56 9 4444 4444', 'AFP Capital', 'isapre', 'Avenida 4', 'Antofagasta', 45, 9);
  
INSERT INTO capacitacion (nombre, detalle, fecha, hora, lugar, duracion, cantidad, cliente_id)
VALUES
  ('Introducción a la Prevención de Riesgos', 'Capacitación introductoria sobre los conceptos básicos de Prevención de Riesgos en el lugar de trabajo.', '2023-08-01', '09:00:00', 'Sala de Conferencias A', 2.5, 30, 1),
  ('Manejo Seguro de Sustancias Peligrosas', 'Capacitación enfocada en el correcto manejo y almacenamiento seguro de sustancias peligrosas.', '2023-08-05', '14:30:00', 'Salón de Eventos B', 1.5, 25, 2),
  ('Prevención de Accidentes Laborales', 'Capacitación para prevenir accidentes en el entorno laboral y promover una cultura de seguridad.', '2023-08-10', '10:00:00', 'Sala de Reuniones C', 3.0, 40, 3),
  ('Ergonomía y Postura Laboral', 'Capacitación sobre la importancia de una buena postura laboral para prevenir lesiones musculoesqueléticas.', '2023-08-15', '15:30:00', 'Salón de Conferencias D', 2.0, 20, 4);

INSERT INTO pago (cliente_id, monto, fecha_pago)
VALUES
  (1, 1500.000, '2023-08-01'),
  (2, 1200.500, '2023-08-05'),
  (3, 1800.750, '2023-08-10'),
  (4, 900.000, '2023-08-15');

INSERT INTO visita (cliente_id, fecha, hora, lugar, realizado, detalle, profesional_id)
VALUES
  (1, '2023-08-01', '09:00:00', 'Oficina del cliente A', true, 'Visita para revisión de instalaciones', 1),
  (2, '2023-08-05', '14:30:00', 'Planta de producción cliente B', true, 'Visita de seguimiento de seguridad', 2),
  (3, '2023-08-10', '10:00:00', 'Sede cliente C', false, 'Visita programada para la próxima semana', 3),
  (4, '2023-08-15', '15:30:00', 'Oficina del cliente D', true, 'Visita de capacitación en seguridad laboral', 4);
  
INSERT INTO chequeo (visita_id, detalle, estado)
VALUES
  (1, 'Revisar estado de extintores', 'Completado'),
  (2, 'Verificar señalización de salidas de emergencia', 'Completado'),
  (3, 'Inspeccionar equipos de protección personal', 'Completado'),
  (4, 'Revisar condiciones de seguridad en áreas de trabajo', 'Pendiente');
  