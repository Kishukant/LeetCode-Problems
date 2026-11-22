# Write your MySQL query statement below
SELECT p.product_name, year, price FROM Sales 
LEFT JOIN Product p ON Sales.product_id = p.product_id;