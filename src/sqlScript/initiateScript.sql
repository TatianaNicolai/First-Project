CREATE TABLE TABLES(
id int not null AUTO_Increment,
manufacturer VARCHAR (45) not null,
model VARCHAR (45) not null,
size_L_H VARCHAR (20) not null,
color VARCHAR (10) not null,
PRIMARY KEY (id));

CREATE TABLE CHAIRS(
id int not null AUTO_Increment,
manufacturer VARCHAR (45) not null,
model VARCHAR (45) not null,
color VARCHAR (10) not null,
PRIMARY KEY (id));

CREATE TABLE CABINETS(
id int not null AUTO_Increment,
manufacturer VARCHAR (45) not null,
model VARCHAR (45) not null,
size_L_H VARCHAR(20) not null,
color VARCHAR (10) not null,
PRIMARY KEY (id));

CREATE TABLE COUCHES(
id int not null AUTO_Increment,
manufacturer VARCHAR (45) not null,
model VARCHAR (45) not null,
color VARCHAR (10) not null,
PRIMARY KEY (id));

Insert into TABLES (manufacturer,model,size_L_H,color) VALUES ('IKEA','office','70*140','white');
Insert into TABLES (manufacturer,model,size_L_H,color) VALUES ('JYSK','kitchen','70*180','yellow');
Insert into TABLES (manufacturer,model,size_L_H,color) VALUES ('STELA','hi-tech5','78*188','red');
Insert into TABLES (manufacturer,model,size_L_H,color) VALUES ('LORI','kid','50*110','blue');

Insert into CHAIRS (manufacturer,model,color) VALUES ('IKEA','home','white');
Insert into CHAIRS (manufacturer,model,color) VALUES ('JYSK','J125','yellow');
Insert into CHAIRS (manufacturer,model,color) VALUES ('STELA','S456','red');
Insert into CHAIRS (manufacturer,model,color) VALUES ('LORI','L456','blue');

Insert into COUCHES (manufacturer,model,color) VALUES ('IKEA','FD567','white');
Insert into COUCHES (manufacturer,model,color) VALUES ('JYSK','LO565','yellow');
Insert into COUCHES (manufacturer,model,color) VALUES ('STELA','PP555','red');
Insert into COUCHES (manufacturer,model,color) VALUES ('LORI','MN99','blue');

Insert into CABINETS (manufacturer,model,size_L_H,color) VALUES ('IKEA','J456','70*140','white');
Insert into CABINETS (manufacturer,model,size_L_H,color) VALUES ('JYSK','L4558','70*180','yellow');
Insert into CABINETS (manufacturer,model,size_L_H,color) VALUES ('STELA','O9887','78*188','red');
Insert into CABINETS (manufacturer,model,size_L_H,color) VALUES ('LORI','EE099','50*110','blue');

