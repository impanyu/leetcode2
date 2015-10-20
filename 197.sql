#197. Rising Temperature
# Write your MySQL query statement below
Select A.Id from Weather A left join Weather B on datediff(A.Date,B.date)=1 where A.temperature>B.temperature