create table if not exists usergroup (
    user          INT    NOT NULL,
    grouppermission         INT    NOT NULL,
    FOREIGN KEY (user) REFERENCES user(id) ON DELETE CASCADE,
    FOREIGN KEY (grouppermission) REFERENCES grouppermission(id) ON DELETE CASCADE
);