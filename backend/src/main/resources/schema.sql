CREATE TABLE journal (
    id              serial PRIMARY KEY,
    date_of_work    date,
    number_of_hours integer,
    description     text
);