create table if not exists activitytype (
    id          VARCHAR(250)    NOT NULL   primary key,
    name        TEXT    NULL,
    type        TEXT    NULL,
    page        INT     NULL,
    processType     INT     NULL,
    FOREIGN KEY (page) REFERENCES page(id) ON DELETE CASCADE,
    FOREIGN KEY (processType) REFERENCES processType(id) ON DELETE CASCADE
);