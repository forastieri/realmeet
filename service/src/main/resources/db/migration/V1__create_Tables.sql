CREATE TABLE realmeet.tb_room (
  id_room BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255) NOT NULL,
   nr_seats INT NOT NULL,
   bl_active BIT(1) NULL,
   CONSTRAINT pk_tb_room PRIMARY KEY (id_room)
);