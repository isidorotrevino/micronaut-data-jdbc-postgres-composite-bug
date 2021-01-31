CREATE TABLE zone_type (
	id INT GENERATED ALWAYS AS IDENTITY,
	zone_type VARCHAR,
	is_enabled BOOLEAN,
	PRIMARY KEY(id)
);

CREATE TABLE settlement_type(
	id INT GENERATED ALWAYS AS IDENTITY,
	set_type VARCHAR,
	is_enabled BOOLEAN,
	PRIMARY KEY(id)
);

CREATE TABLE mx_state(
	id INT GENERATED ALWAYS AS IDENTITY,
	state_name VARCHAR,
	is_enabled BOOLEAN,
	PRIMARY KEY(id)
);

CREATE TABLE county(
	id INT,
	state_id INT NOT NULL,
	county_name VARCHAR,
	is_enabled BOOLEAN,
	PRIMARY KEY(id,state_id),
	FOREIGN KEY(state_id) REFERENCES mx_state(id)
);


CREATE TABLE settlement(
	code VARCHAR NOT NULL,
	code_id INT NOT NULL,
	county_id INT NOT NULL,
	state_id INT NOT NULL,
	zone_id INT NOT NULL,
	set_type_id INT NOT NULL,
	description VARCHAR,
	is_enabled BOOLEAN,
	PRIMARY KEY (code,code_id,county_id,state_id),
	FOREIGN KEY(county_id,state_id) REFERENCES county(id,state_id),
	FOREIGN KEY(zone_id) REFERENCES zone_type(id),
	FOREIGN KEY(set_type_id) REFERENCES settlement_type(id)
);

INSERT INTO zone_type(zone_type,is_enabled) VALUES
 ('Urbano',true),
 ('Semiurbano',true),
 ('Rural',true);



INSERT INTO settlement_type (set_type,is_enabled) VALUES
	 ('Aeropuerto',true),
	 ('Barrio',true),
	 ('Campamento',true),
	 ('Colonia',true),
	 ('Condominio',true),
	 ('Congregación',true),
	 ('Conjunto habitacional',true),
	 ('Ejido',true),
	 ('Estación',true),
	 ('Equipamiento',true);
INSERT INTO settlement_type (set_type,is_enabled) VALUES
	 ('Exhacienda',true),
	 ('Finca',true),
	 ('Fraccionamiento',true),
	 ('Gran usuario',true),
	 ('Granja',true),
	 ('Hacienda',true),
	 ('Parque industrial',true),
	 ('Poblado comunal',true),
	 ('Pueblo',true),
	 ('Ranchería',true);
INSERT INTO settlement_type (set_type,is_enabled) VALUES
	 ('Residencial',true),
	 ('Unidad habitacional',true),
	 ('Villa',true),
	 ('Zona comercial',true),
	 ('Zona federal',true),
	 ('Zona industrial',true),
	 ('Ampliación',true),
	 ('Puerto',true),
	 ('Paraje',true),
	 ('Zona naval',true);
INSERT INTO settlement_type (set_type,is_enabled) VALUES
	 ('Zona militar',true),
	 ('Rancho',true);

INSERT INTO mx_state (state_name,is_enabled) VALUES
	 ('Aguascalientes',true),
	 ('Baja California',true),
	 ('Baja California Sur',true),
	 ('Campeche',true),
	 ('Coahuila de Zaragoza',true);
	 
INSERT INTO county (id,state_id,county_name,is_enabled) VALUES
	 (1,1,'Aguascalientes',true),
	 (1,2,'Ensenada',true),
	 (1,3,'Comondú',true),
	 (1,4,'Calkiní',true),
	 (1,5,'Abasolo',true),
	 (2,1,'Asientos',true),
	 (2,2,'Mexicali',true),
	 (2,3,'Mulegé',true),
	 (2,4,'Campeche',true),
	 (2,5,'Acuña',true),
	 (3,1,'Calvillo',true),
	 (3,2,'Tecate',true),
	 (3,3,'La Paz',true),
	 (3,4,'Carmen',true),
	 (3,5,'Allende',true),
	 (4,1,'Cosío',true),
	 (4,2,'Tijuana',true),
	 (4,4,'Champotón',true),
	 (4,5,'Arteaga',true),
	 (5,1,'Jesús María',true),
	 (5,2,'Playas de Rosarito',true),
	 (5,4,'Hecelchakán',true),
	 (5,5,'Candela',true);
	 
INSERT INTO settlement (code,code_id,county_id,state_id,zone_id,set_type_id,description,is_enabled) VALUES
	 ('20000',1,1,1,1,9,'Zona Centro',true),
	 ('20010',5,1,1,1,21,'Colinas del Rio',true),
	 ('20010',6,1,1,1,9,'Olivares Santana',true),
	 ('20010',7,1,1,1,21,'Las Brisas',true),
	 ('20010',8,1,1,1,21,'Ramon Romo Franco',true);	 
	 
	 