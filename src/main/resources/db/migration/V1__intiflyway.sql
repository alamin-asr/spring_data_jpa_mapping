-- Table: student
CREATE TABLE student (
                         id SERIAL PRIMARY KEY,
                         student_name VARCHAR(255) NOT NULL
);

-- Table: laptop
CREATE TABLE laptop (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255),
                        brand VARCHAR(255),
                        student_id INT UNIQUE,
                        CONSTRAINT fk_laptop_student FOREIGN KEY (student_id) REFERENCES student(id)
);

-- Table: address
CREATE TABLE address (
                         id SERIAL PRIMARY KEY,
                         street VARCHAR(255),
                         city VARCHAR(255),
                         state VARCHAR(255),
                         country VARCHAR(255),
                         student_id INT,
                         CONSTRAINT fk_address_student FOREIGN KEY (student_id) REFERENCES student(id)
);
