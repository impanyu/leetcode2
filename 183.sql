#183 Customers Who Never Order
# Write your MySQL query statement below
Select name from Customers Left Join Orders on Customers.Id=Orders.CustomerId  where Orders.customerId is null