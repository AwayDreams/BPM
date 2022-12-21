create table if not exists activitygroup (
    grouppermission         INT     NULL,
    activity                INT     NULL,
    FOREIGN KEY (grouppermission) REFERENCES grouppermission(id) ON DELETE CASCADE,
    FOREIGN KEY (activity)  REFERENCES activity(id) ON DELETE CASCADE
);