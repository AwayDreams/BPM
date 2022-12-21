create table if not exists activity (
    id              INT    NOT NULL AUTO_INCREMENT     primary key,
    user            INT    NULL,
    activitytype    INT    NULL,
    FOREIGN KEY (user) REFERENCES user(id) ON DELETE CASCADE,
    FOREIGN KEY (activitytype) REFERENCES activityType(id) ON DELETE CASCADE
);