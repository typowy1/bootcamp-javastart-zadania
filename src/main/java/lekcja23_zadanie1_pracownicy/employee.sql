-- 1. Tworzy tabelę pracownik(imie, nazwisko, wyplata, data urodzenia, stanowisko).
-- W tabeli mogą być dodatkowe kolumny, które uznasz za niezbędne.
CREATE TABLE employees.employee(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
salary INT NOT NULL,
birth_date DATE NOT NULL,
position VARCHAR(50) NOT NULL
);

-- 2. Wstawia do tabeli co najmniej 6 pracowników
INSERT INTO employees.employee(first_name, last_name, salary, birth_date, position)
VALUES
('Piotr', 'Kowalski', 10500, '1989-02-15', 'Senior Test Enginner'),
('Adam', 'Oszczędny', 9600, '1996-03-10', 'Java Enginner'),
('Anna', 'Lech', 16000, '1983-02-15', 'Senior Java Enginner'),
('Iza', 'Kowalska', 6500, '2000-08-15', 'Staff'),
('Dominik', 'Szynka', 15000, '1994-02-15', 'Senior PHP Enginner'),
('Jan', 'Ptasznik', 8000, '1987-03-15', 'Senior Staff');

-- 3. Pobiera wszystkich pracowników i wyświetla ich w kolejności alfabetycznej po nazwisku
SELECT * FROM employees.employee
ORDER BY last_name;

-- 4. Pobiera pracowników na wybranym stanowisku
SELECT * FROM employees.employee
WHERE position = 'Senior Staff';

-- 5. Pobiera pracowników, którzy mają co najmniej 30 lat
SELECT * FROM employees.employee
WHERE birth_date <= now() - INTERVAL 30 YEAR;

-- 6. Zwiększa wypłatę pracowników na wybranym stanowisku o 10%
UPDATE employees.employee
SET salary = salary * 1.1
WHERE position = 'Senior PHP Enginner';

-- 7. Usuwa najmłodszego pracownika
DELETE FROM employees.employee
ORDER BY birth_date DESC LIMIT 1;

-- 8. Usuwa tabelę pracownik
DROP TABLE employees.employee;

-- 9. Tworzy tabelę stanowisko (nazwa stanowiska, opis, wypłata na danym stanowisku)
CREATE TABLE employees.employee_title(
title_id INT NOT NULL PRIMARY KEY,
title VARCHAR(50) NOT NULL,
description VARCHAR(200) NOT NULL,
salary INT NOT NULL
);

-- 10 Tworzy tabelę adres (ulica+numer domu/mieszkania, kod pocztowy, miejscowość)
CREATE TABLE employees.address(
address_id INT NOT NULL PRIMARY KEY,
full_street_address VARCHAR(50) NOT NULL,
zip_code INT NOT NULL,
city VARCHAR(35) NOT NULL
);

-- 11. Tworzy tabelę pracownik (imię, nazwisko) + relacje do tabeli stanowisko i adres
CREATE TABLE employees.employee(
employee_id INT PRIMARY KEY AUTO_INCREMENT,
address_id INT NOT NULL,
title_id INT NOT NULL,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
FOREIGN KEY (address_id) REFERENCES address(address_id),
FOREIGN KEY (title_id) REFERENCES employee_title(title_id)
);

-- 12. Dodaje dane testowe (w taki sposób, aby powstały pomiędzy nimi sensowne powiązania)
INSERT INTO employees.employee_title(title_id, title, description, salary)
VALUES
(1, 'Programista', 'Programuje i nie tylko', 15000),
(2, 'Manager', 'Zarządza zespołem', 10000),
(3, 'HR', 'Rekrutacja i kadry', 7000),
(4, 'Tester', 'Testuje aplikacje', 12000);

INSERT INTO employees.address(address_id, full_street_address, zip_code, city)
VALUES
(1, 'Pełczyńskiego 30/5', 35300, 'Warszawa'),
(2, 'Helenowska 35/79', 71900, 'Grodzisk Mazowiecki'),
(3, 'Broniewskiego 100/33', 95400, 'Warszawa'),
(4, 'Calineczki 309/55', 35300, 'Milanówek');

INSERT INTO employees.employee(address_id, title_id, first_name, last_name)
VALUES
(1, 1, 'Rafał', 'Lech'),
(3, 4, 'Piotr', 'Wojna'),
(2, 3, 'Anna', 'Kowalska'),
(4, 2, 'Adam', 'Koza');

-- 13. Pobiera pełne informacje o pracowniku (imię, nazwisko, adres, stanowisko)
SELECT first_name, last_name, full_street_address, zip_code, city, title
FROM employees.employee e
JOIN employees.address a ON e.employee_id = a.address_id
JOIN employees.employee_title t ON t.title_id = a.address_id;

-- 14. Oblicza sumę wypłat dla wszystkich pracowników w firmie
SELECT SUM(salary) AS suma_wypłat_wszystkich_pracowników FROM employee_title;

-- 15. Pobiera pracowników mieszkających w lokalizacji z kodem pocztowym 55300
SELECT first_name, last_name, full_street_address, zip_code, city, title, salary
FROM employees.employee e
JOIN employees.address a ON e.employee_id = a.address_id
JOIN employees.employee_title t ON t.title_id = a.address_id
WHERE zip_code = 55300;