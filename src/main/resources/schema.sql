CREATE TABLE Patients (
  p_id integer NOT NULL AUTO_INCREMENT, 
  p_name varchar(45), 
  p_age Integer NOT NULL, 
  p_sex varchar(1) NOT NULL,
  p_dob date NOT NULL,
  p_address varchar(50), 
  PRIMARY KEY (p_id)
);

CREATE TABLE Doctors (
  d_id INTEGER AUTO_INCREMENT, 
  d_name varchar(45) NOT NULL,
  d_quali varchar(15) NOT NULL,
  d_dob date NOT NULL, 
  p_id INTEGER NOT NULL,
  PRIMARY KEY (d_id)
);

