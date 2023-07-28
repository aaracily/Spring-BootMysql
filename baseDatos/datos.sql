SELECT * FROM usuario;
-- DROP DATABASE prevencion;
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
(8,'administrativo','admin3','$2a$12$265cZYjRd6oy0Zdvkvghn.Iz1MGKdNrXR0tR/O97CVpDXZwZqeRTm'),
(9,'cliente','cliente4','$2a$12$ReiiyJ9a7kvjHF3HjqLPl.eqlnv2EGC2e1OeLgOJr3EWd1e2eZjRi'),
(10,'profesional','profesional2','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm'),
(11,'profesional','profesional3','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm'),
(12,'profesional','profesional4','$2a$12$HUYBGuafi5/UB6ic/FWc7OEeooPdGhm7sIV6efsAAgnZO5p4kygdm');
INSERT INTO `administrativo` VALUES (1,'1-1','admin1','Lopez','lpp@correo.com','Finanzas',4),
(2,'2-2','admin2','Martinez','marti@correo.com','RRHH',5),
(3,'3-3','admin3','Zarate','zzarate@correo.com','RRHH',7),
(4,'4-4','admin4','Oses','odeoses@correo.com','RRHH',8);
INSERT INTO `cliente` VALUES (1,'1-1','cliente1','Contreras','Contreras@micorreo.cl','56989767689','vital','isapre','avenida pardo 1000','olmue',45,1),
(2,'2-2','cliente2','Blanco','blanco@mimail.com','56970709090','ProHabitad','isapre','calle los pinos 300','olmue',37,2),
(5,'3-3','cliente3','Blanco','blacno@micorreo.co','569 90908787','Vital','fonasa','av. laurel 80','la ligua',50,3),
(6,'4-4','cliente4','Luppont','clinte4@micorreo.com','56970708090','Habitad','isapre','calle martuendo 789','la cruz',35,9);
INSERT INTO `profesional` VALUES (1,'9-9','profesional1','Muñoz','mumu@micorreo.com','56912123434','director',6),
(2,'10-10','profesional2','Delgado','mumu@micorreo.com','56912123434','director',10),
(3,'11-111','profesional3','Murguia','murguia@micorreo.com','56912123434','redactor',11),
(4,'12-12','profesional4','Arguelles','arguelles@micorreo.com','56912123434','coordinador',12);

INSERT INTO `capacitacion` VALUES (1,'primero auxilios','otorga conocimientos necesarios para endrentar una emergencia','2023-10-23','14:00:00','Hall center',20,30,2),
(2,'Control de peligros y riesgos en oficinas','otorga conocimientos necesarios para enfrentar una emergencia','2023-09-23','10:30:00','Hall center',10,30,1),
(3,'Prevención de incendios en lugar de trabajo','otorga conocimientos necesarios para enfrentar una emergencia','2023-06-13','08:10:00','Hall center',15,20,2),
(4,'Uso y manejo de extintores portátiles ','otorga conocimientos necesarios para enfrentar una emergencia','2023-12-13','20:10:00','Hall center',15,20,1),
(5,'Formación de brigadas de emergencia ','otorga conocimientos necesarios para enfrentar una emergencia','2023-09-10','11:10:00','Hall center',20,30,1),
(7,'Ergonomía y pausas activas','Técnicas que buscan potenciar salud física y mental durante jornada laboral','2023-10-12','09:10:00','Auditorio central',20,0,1),
(8,'Prevención de riesgo psicosocial','Fometar una cultura de no discriminación y de igualdad de oportunidades en el ámbito laboraligualdad de oportunidad','2023-11-11','08:00:00','Auditorio central',12,0,2),
(9,'Capacitacion Json','Creacion desde ApiRest','2023-10-07','20:00:00','Sala 1',120,30,NULL),(10,'Capacitacion Optional','creada por vista',NULL,NULL,'sala 20',120,12,NULL),(11,'Capacitacion para sprint','creada por vista',NULL,NULL,'sala 20',120,45,NULL),
(12,'Capacitacion para sprint','creada por vista','2023-05-11','14:00:00','sala 20',120,67,NULL),(13,'capacitacion','detalle','2023-07-25','14:00:00','sala a',120,1,NULL),(14,'usuario4',NULL,NULL,NULL,NULL,0,0,NULL);

