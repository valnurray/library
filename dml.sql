INSERT INTO book (title, price, visibility, amount)
VALUES
    ('War and the peace', 32.22, 'TRUE', 3),
    ('Alien VS Predator', 75, 'TRUE', 0),
    ('Bible', 50.20, 'FALSE', 20),
    ('The old man and the sea', 27.3, 'TRUE', 15),
    ('Hobbit', 77, 'TRUE', 2);

INSERT INTO role (userType)
VALUES
    (60),
    (10),
    (20),
    (10),
    (10);

INSERT INTO usr (username, password, e_mail, genderType, role_id)
VALUES
    ('John Dou', '1234', 'john@john.ua', 1, 2),
    ('Anjela Device', 'qwerty', '221@ukr.net', 0, 2),
    ('Barak Obama', 'red_buttom', 'pee@ssh.ua', 1, 1),
    ('Makar', '22113213', 'makar@gmail.com', 1,3),
    ('Milana', '22113', 'mal@gmail.com', 0, 2);

INSERT INTO  basket (count_orders, total_orders_price)
VALUES
    (1,50),
    (3,40),
    (4,120);

INSERT INTO orderfield (time_order, total_price, user_id, book_id,  basket_id)
VALUES
    ('2021-02-19 9:58:59', 20,  1, 1, 1),
    ('2020-12-31 12:00:01', 30,  1, 2, 1),
    ('2018-01-19 05:58:59', 25,  3, 3, 3);
