ALTER TABLE student ADD CONSTRAINT check_student_age CHECK ( age >= 16 );

ALTER TABLE student ADD CONSTRAINT unique_student_name UNIQUE (name);
ALTER TABLE student ALTER name SET NOT NULL;

ALTER TABLE faculty add CONSTRAINT unique_name_color UNIQUE (name, color);

ALTER TABLE student ALTER COLUMN age SET DEFAULT 20;