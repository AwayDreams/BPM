create table if not exists activity (
    id          INT    NOT NULL     primary key,
    user        INT    NULL,
    activity    INT    NULL,
    FOREIGN KEY (user) REFERENCES user(id) ON DELETE CASCADE,
    FOREIGN KEY (activity) REFERENCES activity(id) ON DELETE CASCADE
);