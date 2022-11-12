create table if not exists permissiongroup (
    grouppermission          INT    NOT NULL,
    permission     INT    NOT NULL,
    FOREIGN KEY (grouppermission) REFERENCES grouppermission(id) ON DELETE CASCADE,
    FOREIGN KEY (permission) REFERENCES permission(id) ON DELETE CASCADE
);