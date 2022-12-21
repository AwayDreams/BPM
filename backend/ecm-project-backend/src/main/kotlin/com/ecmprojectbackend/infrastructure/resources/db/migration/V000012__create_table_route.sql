create table if not exists route (
    id              INT     NOT NULL    AUTO_INCREMENT     primary key,
    name            TEXT    NULL,
    name_key        TEXT    NULL,
    content         TEXT    NULL,
    activity        INT    NOT NULL,
    next_activity   INT    NOT NULL,
    FOREIGN KEY (activity) REFERENCES activity(id) ON DELETE CASCADE,
    FOREIGN KEY (next_activity) REFERENCES activity(id) ON DELETE CASCADE
);