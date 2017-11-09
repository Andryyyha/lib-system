CREATE TABLE "Author" (
	"id" integer NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT Author_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Book" (
	"id" integer NOT NULL,
	"title" varchar NOT NULL,
	CONSTRAINT Book_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Book_Author" (
	"id_book" integer NOT NULL,
	"id_author" integer NOT NULL,
	CONSTRAINT Book_Author_pk PRIMARY KEY ("id_book")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "BookExample" (
	"id" integer NOT NULL,
	"publisher" varchar NOT NULL,
	"id_book" integer NOT NULL,
	CONSTRAINT BookExample_pk PRIMARY KEY ("id","id_book")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "Author" ADD CONSTRAINT "Author_fk0" FOREIGN KEY ("id") REFERENCES "Book_Author"("id_author");

ALTER TABLE "Book" ADD CONSTRAINT "Book_fk0" FOREIGN KEY ("id") REFERENCES "Book_Author"("id_book");


ALTER TABLE "BookExample" ADD CONSTRAINT "BookExample_fk0" FOREIGN KEY ("id_book") REFERENCES "Book"("id");

