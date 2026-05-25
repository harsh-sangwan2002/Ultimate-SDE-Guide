use testdb;

Create table Batches(
id INT Primary Key,
batch_name VARCHAR(60)
);

Insert Into Batches Values
(1,'A'),
(2,'B'),
(3,'C'),
(4,'D');

Create table Students(
id INT Primary Key,
name VARCHAR(60),
batch_id INT,
Foreign Key (batch_id) References Batches(id) On Delete Cascade On Update Cascade
);

Insert Into Students Values
(1,'Harsh',1),
(2,'Arvind',1),
(3,'Saurabh',2),
(4,'Rahul',3);
