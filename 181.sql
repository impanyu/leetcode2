#181. Employees Earning More Than Their Managers
# Write your MySQL query statement below
Select A.Name from Employee A left join Employee B on A.ManagerId=B.Id where A.salary>B.Salary