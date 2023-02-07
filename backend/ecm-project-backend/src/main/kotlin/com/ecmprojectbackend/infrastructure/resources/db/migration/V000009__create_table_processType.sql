create table if not exists processtype (
    id              INT     NOT NULL    AUTO_INCREMENT     primary key,
    version         INT     NOT NULL,
    datatype        INT     NOT NULL,
    name            TEXT    NULL,
    content         TEXT    NULL,
    FOREIGN KEY (datatype) REFERENCES datatype(id) ON DELETE CASCADE
);