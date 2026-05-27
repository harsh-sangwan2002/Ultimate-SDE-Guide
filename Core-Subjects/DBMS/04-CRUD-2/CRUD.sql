use sakila;

-- I want to bring all the movies between the year 2007 and 2009
Select * from film Where release_year >= 2007 and release_year <= 2009;

/*
Between a and b
[a,b] => including a and b
*/
Select * from film Where release_year Between 2007 and 2009;

-- I want to fetch all films having "love" as a substring in the title of the film
Select film_id, title from film Where title like "%love%";

-- null cannot be compared with =, != opeartors, we have to use Is Null or Is Not Null keywords
Select * from film Where description = null;

Select * from film Where description Is null;

Select * from film Where description Is Not null;

/* Order By clause is used to sort the data based on certain columns
asc - ascending order
desc - descending order
*/
Select * from film order by description;
Select * from film order by release_year desc;

/*
Order By with distinct keyword - If you have order by in a statement having distinct
then we can only sort by columns that are present in the select statement
*/
Select distinct title from film Order By title;

Select * from film
limit 25 offset 10;

Select * from film
limit 25;

-- Offset can only be used with limit
-- Select * from film offset 10;

/*
Update table_name
Set col1, col2, ...
Where cond1 and/or cond2
*/
Update film set title = "Skylags", release_year = 2019
Where film_id = 1;

Select * from film;

-- Delete will remove the rows from the table
Delete from film;

/*
1) Delete
	- Remove the specified rows one by one based on the condition
    - Slower than truncate
    - Can be rolled back
    - Doesn't reset the key

delete from table_name where cond1 and/or cond2

2) Truncate
	- Removes the complete table and re-creates it
    - Faster than delete
    - Reset the primary key
    - Cannot be rolled back
    
truncate table table_name
    
3) Drop
	- Removes the complete table along with schema
    - Cannot be rolled back

drop table table_name;
drop database db_name
*/