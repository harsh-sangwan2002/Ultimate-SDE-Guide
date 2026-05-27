/*
Write a query to calculate the sub_total for each order line and return the columns orderNumber, productCode, and sub_total.

Table: orderdetails

Note:
To get the sub_total for each orderNumber, it is calculated by multiply the quantityOrdered column by the PriceEach column.
Round off the sub_total up to two decimal places.
Order the results by orderNumber in ascending order and sub_total in descending order.
*/
Select
    orderNumber,
    productCode,
    Round(priceEach*quantityOrdered,2) sub_total
From
    orderdetails
Order By
    orderNumber,
    sub_total desc;