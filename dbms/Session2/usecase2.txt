CREATE TABLE countries (
    Country_ID INT PRIMARY KEY,
    Country_Name VARCHAR(100) UNIQUE NOT NULL
);
CREATE TABLE covid_cases (
    Country_ID INT,
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,

    PRIMARY KEY (Country_ID, Date),

    FOREIGN KEY (Country_ID)
    REFERENCES countries(Country_ID)
);
ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (Country_ID)
REFERENCES countries(Country_ID);