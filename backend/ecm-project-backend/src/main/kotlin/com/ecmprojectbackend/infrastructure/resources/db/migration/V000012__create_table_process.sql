create table if not exists process (
    id                  INT                 NOT NULL   primary key,
    ProcessType         INT                 NULL,
    ActivityType        VARCHAR(250)        NULL,
    FOREIGN KEY (ProcessType) REFERENCES ProcessType(id) ON DELETE CASCADE,
    FOREIGN KEY (ActivityType) REFERENCES ActivityType(id) ON DELETE CASCADE
);