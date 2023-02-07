ALTER TABLE processtype
ADD COLUMN  first_activity  VARCHAR(250)  NULL,
ADD FOREIGN KEY (first_activity) REFERENCES activitytype(id) ON DELETE CASCADE;