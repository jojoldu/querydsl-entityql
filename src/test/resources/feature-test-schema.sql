create table IF NOT EXISTS JBOOKS (BOOK_ID bigint not null, DESC CLOB, NAME varchar(255), PRICE decimal(19,2), primary key (BOOK_ID));