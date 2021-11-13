create table winery.category
(
    categoryID integer      not null,
    category_name varchar(20)  not null,
    category_description varchar(120) not null
);
insert into winery.category (categoryID, category_name, category_description) values (1, 'Wine', 'Wine is a type of alcoholic beverage made from the fermented juice or skins of grapes.');
insert into winery.category (categoryID, category_name, category_description) values (2, 'Beer', 'Beer is a type of alcoholic beverage made from the fermented juice of hops.');
insert into winery.category (categoryID, category_name, category_description) values (3, 'Liquor', 'Liquor is a type of alcoholic beverage made from the fermented juice of fruits or vegetables.');
insert into winery.category (categoryID, category_name, category_description) values (4, 'Cider', 'Cider is a type of alcoholic beverage made from the fermented juice of apples or other fruit.');
insert into winery.category (categoryID, category_name, category_description) values (5, 'Spirit', 'Spirit is a type of alcoholic beverage made from the fermented juice of herbs, spices, nuts, and seeds.');


drop table if exists winery.users;
create table winery.users (
	userID INT,
	typeID INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	username VARCHAR(50),
	email VARCHAR(50),
	password VARCHAR(50),
	loggedin VARCHAR(50)
);
insert into winery.users (userID, typeID, first_name, last_name, username, email, password, loggedin) values (1, 1, 'Sheila', 'Chant', 'schant0', 'schant0@bravesites.com', 'MU0XSyoL0D', true);
insert into winery.users (userID, typeID, first_name, last_name, username, email, password, loggedin) values (2, 2, 'Steven', 'Runnalls', 'srunnalls1', 'srunnalls1@sourceforge.net', 'SFs9PIWI', true);
insert into winery.users (userID, typeID, first_name, last_name, username, email, password, loggedin) values (3, 3, 'Candace', 'Corke', 'ccorke2', 'ccorke2@pen.io', 'hlfIwUV', false);


drop table if exists winery.orders;
drop table if exists winery.order_products;

create table winery.orders
(
    orderID int primary key,
    orders_date date,
    order_item_name varchar(50),
    order_item_amount int
);
create table winery.order_products
(
    orderID int,
    itemID int,
    item_name varchar(50),
    item_amount int
);




DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS contacts;

CREATE TABLE winery.customers(
   customer_id INT GENERATED ALWAYS AS IDENTITY,
   customer_name VARCHAR(255) NOT NULL,
   PRIMARY KEY(customer_id)
);

CREATE TABLE winery.users(
   user_id INT GENERATED ALWAYS AS IDENTITY,
   customer_id INT,
   user_name VARCHAR(255) NOT NULL,
   email VARCHAR(100),
   contact_id int not null,
   PRIMARY KEY(contact_id),
   CONSTRAINT fk_customer
      FOREIGN KEY(customer_id)
	  REFERENCES customers(customer_id)
);

create table winery.users (
	userID INT,
	typeID INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	username VARCHAR(50),
	email VARCHAR(50),
	password VARCHAR(50),
	loggedin VARCHAR(50)
);
insert into winery.users (userID, typeID, first_name, last_name, username, email, password, loggedin) values (1, 1, 'Sheila', 'Chant', 'schant0', 'schant0@bravesites.com', 'MU0XSyoL0D', true);
insert into winery.users (userID, typeID, first_name, last_name, username, email, password, loggedin) values (2, 2, 'Steven', 'Runnalls', 'srunnalls1', 'srunnalls1@sourceforge.net', 'SFs9PIWI', true);
insert into winery.users (userID, typeID, first_name, last_name, username, email, password, loggedin) values (3, 3, 'Candace', 'Corke', 'ccorke2', 'ccorke2@pen.io', 'hlfIwUV', false);


/* contact_id int not null,
   PRIMARY KEY(contact_id),
   CONSTRAINT fk_customer
      FOREIGN KEY(customer_id)
	  REFERENCES customers(customer_id)
*/

drop table if exists winery.users;

drop table if exists winery.type;
create table winery.type (
    type_id serial primary key unique,
    type_name varchar(50)
);
insert into winery.type (type_id, type_name) values (1, 'admin');
insert into winery.type (type_id, type_name) values (2, 'employee');
insert into winery.type (type_id, type_name) values (3, 'customer');

create table winery.users (
    user_id serial primary key unique,
    type_id int not null,
    first_name varchar(50),
    last_name varchar(50),
    username varchar(50),
    email varchar(50),
    password varchar(50),
    loggedin boolean,
    CONSTRAINT type_type_id_users__fk
    FOREIGN KEY (type_id)
    REFERENCES winery.type(type_id)
);
insert into winery.users (user_id, type_id, first_name, last_name, username, email, password, loggedin) values (1, 1, 'Sheila', 'Chant', 'schant0', 'schant0@bravesites.com', 'MU0XSyoL0D', null);
insert into winery.users (user_id, type_id, first_name, last_name, username, email, password, loggedin) values (2, 2, 'Steven', 'Runnalls', 'srunnalls1', 'srunnalls1@sourceforge.net', 'SFs9PIWI', null);
insert into winery.users (user_id, type_id, first_name, last_name, username, email, password, loggedin) values (3, 3, 'Candace', 'Corke', 'ccorke2', 'ccorke2@pen.io', 'hlfIwUV', null);



DROP TABLE IF EXISTS winery.orders;
create table winery.orders (
    order_id serial primary key unique,
    customer_id int not null,
    orders_date date,
    order_item_name varchar (50),
    order_item_amount int,
    CONSTRAINT customers_customer_id_orders__fk
    FOREIGN KEY (customer_id)
    REFERENCES winery.customers(customer_id)
);

alter table winery.orders
	add constraint customers_customer_id_orders___fk
		foreign key (customer_id) references winery.orders (customer_id);

drop table if exists winery.users;
create table winery.users (
	user_id serial primary key unique,
	type_id int not null,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	username VARCHAR(50),
	email VARCHAR(50),
	password VARCHAR(50),
	loggedin VARCHAR(50)
);
insert into winery.users (user_id, type_id, first_name, last_name, username, email, password, loggedin) values (1, 1, 'Sheila', 'Chant', 'schant0', 'schant0@bravesites.com', 'MU0XSyoL0D', true);
insert into winery.users (user_id, type_id, first_name, last_name, username, email, password, loggedin) values (2, 2, 'Steven', 'Runnalls', 'srunnalls1', 'srunnalls1@sourceforge.net', 'SFs9PIWI', true);
insert into winery.users (user_id, type_id, first_name, last_name, username, email, password, loggedin) values (3, 3, 'Candace', 'Corke', 'ccorke2', 'ccorke2@pen.io', 'hlfIwUV', false);

drop table if exists winery.type;
create table winery.type (
    type_id serial primary key unique,
    type_name VARCHAR(50)
);
insert into winery.type (type_id, type_name) values (1, 'manager');
insert into winery.type (type_id, type_name) values (2, 'employee');
insert into winery.type (type_id, type_name) values (3, 'customer');

drop table winery.customers;
create table customers (
	customer_id INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email VARCHAR(50)
);
insert into winery.customers (customer_id, first_name, last_name, email) values (1, 'Jenica', 'Ryall', 'jryall0@blogtalkradio.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (2, 'Alberta', 'Petric', 'apetric1@usatoday.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (3, 'Victor', 'Brislan', 'vbrislan2@opera.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (4, 'Jamesy', 'Hudleston', 'jhudleston3@cargocollective.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (5, 'Farris', 'Ticic', 'fticic4@reverbnation.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (6, 'Lisbeth', 'Baser', 'lbaser5@marketwatch.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (7, 'Arlinda', 'Mil', 'amil6@ucoz.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (8, 'Robbin', 'Sarfas', 'rsarfas7@alibaba.com');
insert into winery.customers (customer_id, first_name, last_name, email) values (9, 'Baldwin', 'Dahlback', 'bdahlback8@nhs.uk');
insert into winery.customers (customer_id, first_name, last_name, email) values (10, 'Allianora', 'Kedwell', 'akedwell9@rakuten.co.jp');
