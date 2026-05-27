/*
Table: Products

Column Name	Type
product_id	int
low_fats	enum
recyclable	enum

product_id is the primary key for this table.
low_fats is an ENUM of type ('Y', 'N') where 'Y' means this product is low fat and 'N' means it is not.
recyclable is an ENUM of types ('Y', 'N') where 'Y' means this product is recyclable and 'N' means it is not.

Write an SQL query to find the ids of products that are both low fat and recyclable.
Return the result table sorted by product_id in ascending order
The query result format is in the following example. 
*/
Select
    product_id
From
    Products
Where
    low_fats = "Y" And
    recyclable = "Y"
Order By
    product_id;