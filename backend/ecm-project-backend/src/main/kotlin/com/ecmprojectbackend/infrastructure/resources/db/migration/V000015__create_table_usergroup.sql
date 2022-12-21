create table if not exists usergroup (
    grouppermission         INT     NULL,
    user                    INT     NULL,
    FOREIGN KEY (grouppermission) REFERENCES grouppermission(id) ON DELETE CASCADE,
    FOREIGN KEY (user)  REFERENCES user(id) ON DELETE CASCADE
);