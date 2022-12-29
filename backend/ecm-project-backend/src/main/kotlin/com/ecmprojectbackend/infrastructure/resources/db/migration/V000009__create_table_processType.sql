create table if not exists processType (
    id              INT     NOT NULL    AUTO_INCREMENT     primary key,
    datatype        INT     NOT NULL,
    name            TEXT    NULL,
    content         TEXT    NULL,
    FOREIGN KEY (datatype) REFERENCES datatype(id) ON DELETE CASCADE
);