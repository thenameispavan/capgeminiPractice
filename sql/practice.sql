create table customers(cid varchar(20) primary key, name varchar(20), phone numeric,city varchar(20), country varchar(20));
insert into customers values(101,'bhagwan',9876543210,'avadi','india');
insert into customers values(102,'shivani',6896543210,'guindy','india');
insert into customers values(103,'karim',9833443210,'ambattur','india');
insert into customers values(104,'christopher',8976543446,'korattur','india');
select * from customers;
create table orders(oid varchar(20), pname varchar(20),cost int,cust_id varchar(20) references customer(cid));