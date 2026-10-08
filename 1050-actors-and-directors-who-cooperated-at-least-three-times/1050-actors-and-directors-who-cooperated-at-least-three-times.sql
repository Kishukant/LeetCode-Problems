# Write your MySQL query statement below
SELECT actor_id, director_id FROM ActorDirector a
GROUP BY actor_id,director_id
HAVING COUNT(a.actor_id)>=3;