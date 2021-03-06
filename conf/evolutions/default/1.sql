# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table student (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  birth_date                    timestamp,
  stud_id                       bigint,
  picture                       varbinary(255),
  constraint pk_student primary key (id)
);


# --- !Downs

drop table if exists student;

