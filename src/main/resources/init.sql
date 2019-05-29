create table fruits(
    id integer primary key auto_increment,
    name varchar(50),
    description_f varchar(50));

create table city (
    id integer primary key auto_increment,
    name varchar(50),
    latitude float,
    longitude float
);

create table person (
    id integer primary key auto_increment,
    name varchar(50),
    city_id integer,
    foreign key (city_id) references city(id)
);

insert into city (name, latitude, longitude)
values ('Tallinn', 59.428238, 24.749001);

insert into city (name, latitude, longitude)
values ('London', 59.428238, 24.749001);

insert into person(name, city_id)
values ('Vitya', 1);

insert fruits(name, description_f)
values ('apple', 'big very');

insert fruits(name, description_f)
values ('pineapple', 'bad');

insert fruits(name, description_f)
values ('cucumber', 'green');

insert fruits(name, description_f)
values ('watermelon', 'expensive');