create table if not exists field (
    id              INT     NOT NULL    AUTO_INCREMENT     primary key,
    fieldtype       INT     NULL,
    activity        INT     NULL,
    value           TEXT    NULL,
    FOREIGN KEY (fieldtype) REFERENCES fieldType(id) ON DELETE CASCADE,
    FOREIGN KEY (activity)  REFERENCES activity(id) ON DELETE CASCADE
);