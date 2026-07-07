SELECT d.country_id,
       d.date,
       d.total_deaths,
       v.total_vaccinations
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id
AND d.date = v.date;