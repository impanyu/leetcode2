#178.Rank Scores 
# Write your MySQL query statement below
#method 1
Select score,(select count(distinct score) from Scores where score>=A.score) from Scores A order by score desc
#method 2
SELECT Scores.Score, COUNT(Ranking.Score) AS RANK
  FROM Scores
     , (
       SELECT DISTINCT Score
         FROM Scores
       ) Ranking
 WHERE Scores.Score <= Ranking.Score
 GROUP BY Scores.Id, Scores.Score
 ORDER BY Scores.Score DESC;