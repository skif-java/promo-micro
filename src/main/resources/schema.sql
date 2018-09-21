
# list tables

\dt

SELECT * FROM pg_catalog.pg_tables;

# ------------------------

CREATE TABLE account(
 id int PRIMARY KEY,
 name text NOT NULL,
 created_on TIMESTAMP,
 balance REAL 
);

-----------------

insert into account (id, name, created_on, balance) values (10, 'Chase', '2017-02-05', 2345.67);
insert into account (id, name, created_on, balance) values (11, 'PNC Bank', '2018-04-06', 78900.25);
insert into account (id, name, created_on, balance) values (12, 'Barclays', '2017-12-28', 104);

select * from account;

delete from account where id=12;

-------------




--------------


