create table if not exists page (
    id          INT     NOT NULL     primary key,
    datatype    INT     NOT NULL,
    name        TEXT    NULL,
    content     TEXT    NULL,
    FOREIGN KEY (datatype) REFERENCES datatype(id) ON DELETE CASCADE
);