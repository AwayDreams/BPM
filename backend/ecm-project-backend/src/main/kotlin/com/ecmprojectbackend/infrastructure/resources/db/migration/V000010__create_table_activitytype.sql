create table if not exists activitytype (
    id          INT     NOT NULL    AUTO_INCREMENT     primary key,
    name        TEXT    NULL,
    type        TEXT    NULL,
    page        INT     NULL,
    process     INT     NULL,
    FOREIGN KEY (page) REFERENCES page(id) ON DELETE CASCADE,
    FOREIGN KEY (process) REFERENCES process(id) ON DELETE CASCADE
);