

CREATE TABLE role
(role_id SERIAL PRIMARY KEY,
 userType VARCHAR(55) NOT NULL
);

CREATE TABLE usr
(user_id SERIAL PRIMARY KEY,
 username VARCHAR(20) NOT NULL UNIQUE,
 password VARCHAR(20) NOT NULL,
 e_mail VARCHAR(55) NOT NULL,
 genderType INT NOT NULL,
 birthday DATE,
 role_id INT NOT NULL,
 status VARCHAR(55) NOT NULL
);

CREATE TABLE usr_role
(role_id int REFERENCES role (role_id) ON UPDATE CASCADE ON DELETE CASCADE,
 user_id int REFERENCES usr (user_id) ON UPDATE CASCADE,
 CONSTRAINT role_usr_pkey PRIMARY KEY (role_id, user_id)
);


CREATE TABLE book
(book_id SERIAL PRIMARY KEY,
 title VARCHAR(250) NOT NULL,
 price DECIMAL(7,2) NOT NULL,
 visibility BOOLEAN NOT NULL,
 amount INT NOT NULL
);

CREATE TABLE basket
(basket_id SERIAL PRIMARY KEY,
 count_orders INT NOT NULL,
 total_orders_price DECIMAL(9,2) NOT NULL DEFAULT 0
);

CREATE TABLE orderField
(order_id SERIAL PRIMARY KEY,
 time_order DATE NOT NULL,
 total_price DECIMAL(9,2),
 user_id INT NOT NULL,
 book_id INT NOT NULL,
 FOREIGN KEY (user_id) REFERENCES usr (user_id),
 FOREIGN KEY (book_id) REFERENCES book (book_id),
 basket_id INT NOT NULL,
 FOREIGN KEY (basket_id) REFERENCES basket (basket_id)
);

