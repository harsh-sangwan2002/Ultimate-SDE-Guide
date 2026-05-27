Use sakila;

Select * From film;

-- I want to insert some rows into the film table
Insert Into Film (film_id,title,description,release_year,language_id,rental_duration,
rental_rate,length,replacement_cost,rating)
Values(1003,'The Dark Knight','Batman Fights The Joker',2007,1,4,3.79,130,18.97,'PG');

/*
1. You have to give values in the same order as mentioned in the column names
2. You have to follow the same data type as mentioned in the Schema
3. You we don't define a column value - 
	a) If column as nullable, the value will be null
    b) If the column has a default value defined, it will take the default value
    c) If column is not nullable and doesn't have a default value, it will throw an error
*/

-- * denotes all the rows and columns
Select * from film;

Select title, description from film;

-- SQL is case-insesitive
SelECt TiTLe, description from film;

-- Using as keyword for aliasing
Select film_id as id, title from film;
Select title film_title, description from film;

/*
Distinct keyword is used to remove the duplicates
Distinct gets applied on the set of columns not just to the single column if multiple columns are there in the select statement
*/
Select distinct rating from film;

Select distinct release_year, rating from film;

Select 1;

Select "Hello World";

/*
ans = []
for each row in film:
	ans.add(row)

for each row in ans:
	print(row["title"],"Hello World")
*/
Select title, "Hello World" from film;

-- length column is in minutes, print length in hours
Select title, floor(length/60) duration_in_hours from film;

Create table city_copy(
city VARCHAR(60)
);

Insert Into city_copy
Select city from city;

Select * from city_copy;

/*
-> I want to apply filtering on the rows based on some condition
-> We can use conditional or logical opeators to combine multiple conditions
*/
Select * from film Where rating = "PG-13";

Select * from film Where rating = "PG-13" || rating = "PG";

-- <>, !=
Select rating from film Where rating <> "PG-13";
Select rating from film Where rating != "PG-13";

Select rating from film Where release_year >= 2007 and release_year <= 2009;

-- In operator
Select title, rating from film Where rating = "PG-13" or rating = "PG" or rating = "G";

/*
ans = []
for each row in film:
	if(row["rating"]="PG" or "PG" or "G"):
		ans.add(row)

for each row in ans:
	print(row["rating"],row["title"])
*/
Select title, rating from film Where rating In ("PG-13","PG","G");