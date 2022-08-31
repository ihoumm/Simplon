/*---------------------------------------------------------------*/
       /*-----------------SELECT--TABLE-----------------*/
/*---------------------------------------------------------------*/

                        select * from users
                        select * from administrateur
                        select * from responsable
                        select * from participant
                        select * from exercice
                        select * from activite
                        select * from participants_activites

/*---------------------------------------------------------------*/
      /*-----------------SEEDERS-FOR-TEST-----------------*/
/*---------------------------------------------------------------*/

insert into users values
    ('Admin', '1', 'mustapha@ihoum.com', 'root', 'Mustapha', 'root', 'Ihoum', '0600000000'),
    ('Responsable', '2', 'khalil@farouqui.com', 'root', 'Khalil', 'root', 'Farouqui', '0600000000'),
    ('Participant', '3', 'fatiha@elhabti.com', 'root', 'Fatiha', 'root', 'EL Habti', '0600000000'),
    
    ('Admin', '4', 'karim@laf.com', 'karim', 'karim', 'root', 'laf', '0600000000'),
    ('Responsable', '5', 'abdo@el.com', 'elabdo', 'abdo', 'root', 'el', '0600000000'),
    ('Participant', '6', 'kadi@same.com', 'khadi', 'khadija', 'root', 'same', '0600000000'),
    
    ('Responsable', '7', 'ibrahim@ihoum.com', 'root', 'ibrahim', 'root', 'Ihoum', '0600000000'),
    ('Responsable', '8', 'med@amahli.com', 'root', 'med', 'root', 'amahli', '0600000000'),
    ('Participant', '9', 'fatiha@haouse.com', 'fatih', 'Fatiha', 'root', 'house', '0600000000'),
    ('Participant', '10', 'racha@rach.com', 'racha', 'racha', 'root', 'rach', '0600000000');
    
insert into administrateur values
    ('Admin', 1),
    ('Admin', 4);

insert into responsable values
    ('DEV WEB and MOBILE APP', 'Active', 'Formateur', 2),
    ('Administfarif', 'Active', 'Adminstratif', 5),
    ('Responsable Recources Humais', 'Active', 'RH', 7),
    ('Responsable Comptable', 'Active', 'Comtable', 8);

insert into participant values
    ('DEV WEB and MOBILE APP', 'Learner', 3),
    ('SEO', 'Visitor', 6),
    ('DESIGN', 'Student', 9),
    ('MOTION GRAPHICS', 'Learner', 10);

insert into exercice values
    (1, '2022', '2022-05-16', '2022-09-30', 'Processing'),
    (2, '2022', '2022-05-16', '2022-09-30', 'Ended'),
    (3, '2022', '2022-05-16', '2022-09-30', 'Comig Soon'),
    (4, '2022', '2022-05-16', '2022-09-30', 'Processing'),
    (5, '2022', '2022-05-16', '2022-09-30', 'Ended'),
    (6, '2022', '2022-05-16', '2022-09-30', 'Comig Soon'),
    (7, '2022', '2022-05-16', '2022-09-30', 'Processing'),
    (8, '2022', '2022-05-16', '2022-09-30', 'Ended'),
    (9, '2022', '2022-05-16', '2022-09-30', 'Comig Soon');

insert into activite values
    (1, '2022-05-16', '2022-09-30', 'Teaching Students DEV WEB', 'Processing', 'DEV WEB and MOBILE APP', 'Formation', 1, 2),
    (2, '2022-05-16', '2022-09-30', 'Teaching Students SEO technics', 'Ended', 'SEO', 'Formation', 2, 2),
    (3, '2022-05-16', '2022-09-30', 'Teaching Students DESIGN technics', 'Comig Soon', 'DESIGN', 'Formation', 3, 2);

insert into participants_activites values
    (1,3),
    (2,6),
    (3,9),
    (2,10)

/*---------------------------------------------------------------*/
       /*-----------------DROP--TABLE-----------------*/
/*---------------------------------------------------------------*/

                        drop table users
                        drop table administrateur
                        drop table responsable
                        drop table participant
                        drop table exercice
                        drop table activite
                        drop table participants_activites
                        
    
/*---------------------------------------------------------------*/
       /*-----------------UPDATE--DATA-----------------*/
/*---------------------------------------------------------------*/