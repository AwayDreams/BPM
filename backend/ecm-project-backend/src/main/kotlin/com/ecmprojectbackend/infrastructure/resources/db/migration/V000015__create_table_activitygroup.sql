create table if not exists activitygroup (
    grouppermission             INT              NULL,
    activityType                VARCHAR(250)     NULL,
    FOREIGN KEY (grouppermission) REFERENCES grouppermission(id) ON DELETE CASCADE,
    FOREIGN KEY (activityType)  REFERENCES activitytype(id) ON DELETE CASCADE
);