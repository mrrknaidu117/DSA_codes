# Write your MySQL query statement below
SELECT tweet_id FROM tweets WHERE length(content)> 15 or content not REGEXP '^[A-Za-z0-9! ]+$';
