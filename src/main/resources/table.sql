CREATE TABLE BOOK
(
  id  NUMBER NOT NULL,
  title VARCHAR(100) NOT NULL,
  CONSTRAINT pk_book_id PRIMARY KEY (id),
  CONSTRAINT fk_id FOREIGN KEY (id) REFERENCES BOOK_AUTHOR(id_book)
);

CREATE TABLE AUTHOR
(
  id NUMBER NOT NULL,
  name VARCHAR(100) NOT NULL,
  CONSTRAINT pk_author_id PRIMARY KEY (id),
  CONSTRAINT fk_id FOREIGN KEY (id) REFERENCES BOOK_AUTHOR(id_author)
);

CREATE TABLE BOOK_EXAMPLE
(
  id NUMBER NOT NULL,
  title VARCHAR(100) NOT NULL,
  yearOfPublishment NUMBER(4) NOT NULL,
  pages NUMBER(4) NOT NULL,
  publisher VARCHAR(100) NOT NULL,
  id_book NUMBER NOT NULL,
  CONSTRAINT pk_book_example_id PRIMARY KEY (id),
  CONSTRAINT fk_id_book FOREIGN KEY (id_book) REFERENCES BOOK(id)
);

CREATE TABLE BOOK_AUTHOR
(
  id_book NUMBER NOT NULL,
  id_author NUMBER NOT NULL,
  CONSTRAINT pk_book_author PRIMARY KEY (id_book,id_author)
);