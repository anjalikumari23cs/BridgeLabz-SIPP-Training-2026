SELECT date,
       AVG(new_deaths) AS average_new_deaths
FROM covid_deaths
GROUP BY date
ORDER BY date;