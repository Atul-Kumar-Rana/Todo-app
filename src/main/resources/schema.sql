CREATE TABLE TODO(
  ID INT not null,
  USERNAME varchar(30) not null,
  DESCRIPTION varchar(50),
  TARGETDATE date,
  done varchar(5),
  PRIMARY KEY(ID)
)