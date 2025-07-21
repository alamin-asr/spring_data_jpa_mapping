-- Create product table
CREATE TABLE product (
                         id SERIAL PRIMARY KEY,
                         product_name VARCHAR(255) NOT NULL
);

-- Create category table
CREATE TABLE category (
                          id SERIAL PRIMARY KEY,
                          title VARCHAR(255) NOT NULL
);

-- Create join table for many-to-many relationship
CREATE TABLE product_category (
                                  product_id INTEGER NOT NULL,
                                  category_id INTEGER NOT NULL,
                                  PRIMARY KEY (product_id, category_id),
                                  CONSTRAINT fk_product FOREIGN KEY (product_id) REFERENCES product (id) ON DELETE CASCADE,
                                  CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES category (id) ON DELETE CASCADE
);
