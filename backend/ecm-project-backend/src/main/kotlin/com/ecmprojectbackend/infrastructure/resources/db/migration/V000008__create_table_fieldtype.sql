create table if not exists fieldtype (
    id          INT     NOT NULL     primary key,
    datatype    INT     NOT NULL,
    name        TEXT    NULL,
    type        TEXT    NULL,
    FOREIGN KEY (datatype) REFERENCES datatype(id) ON DELETE CASCADE
);