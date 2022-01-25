package br.com.sw2you.realmeet;

import br.com.sw2you.realmeet.domain.entity.Room;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println("Class room tst: 001");
        Room v1 = Room.newBuilder()
                .id(1L)
                .name("sala hellow world")
                .seats(1)
                .active(true)
                .build();

        System.out.println(v1.toString() + " hash:" + v1.hashCode());

        Room v2 = Room.newBuilder()
                .id(2L)
                .name("Room Diff")
                .seats(2)
                .active(true)
                .build();

        System.out.println("Class room tst: 002");
        System.out.println(v2.toString() + " hash:" + v2.hashCode());

        System.out.println("Class room tst: 003");
        System.out.println(
                "Hash01 = " + v1.hashCode() +
                "\n" +
                "Hash02 = " + v2.hashCode());

        System.out.println(v1.equals(v2));
    }
}
