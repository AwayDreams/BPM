ALTER TABLE processType
ADD COLUMN  first_activity  VARCHAR(250)  NULL,
ADD FOREIGN KEY (first_activity) REFERENCES activityType(id) ON DELETE CASCADE;