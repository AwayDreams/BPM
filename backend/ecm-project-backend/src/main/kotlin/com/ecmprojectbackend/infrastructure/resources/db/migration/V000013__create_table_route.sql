create table if not exists route (
    id              VARCHAR(250)        NOT NULL     primary key,
    name            TEXT                NULL,
    name_key        TEXT                NULL,
    content         TEXT                NULL,
    activity        VARCHAR(250)        NOT NULL,
    next_activity   VARCHAR(250)        NOT NULL,
    FOREIGN KEY (activity) REFERENCES activityType(id) ON DELETE CASCADE,
    FOREIGN KEY (next_activity) REFERENCES activityType(id) ON DELETE CASCADE
);