create table book(
    id int auto_increment primary key,
    title varchar(255),
    pages int not null,
    author varchar(255) not null
);

--insert into book(title, pages, author) values ('Spring boot', 200, 'Mario Rossi');