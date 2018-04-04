CREATE TABLE users (
    user_id        BIGINT,
    first_name       VARCHAR,
    last_name         VARCHAR,
    date_of_birth   DATE,
    employee        BOOLEAN,
	CONSTRAINT pk_users PRIMARY KEY(user_id)
);

CREATE TABLE employees (
    employee_id        BIGINT,
    employee_type       VARCHAR,
	CONSTRAINT pk_employees PRIMARY KEY(employee_id)
);