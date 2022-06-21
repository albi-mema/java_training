package ENTITIES;

import java.sql.Timestamp;


class test {
    public static void main(String[] args) {
        USER user = new USER(
                1,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                "user_1",
                "surname_1",
                "username_1"
                );
        SPID spid_1 = new SPID(
                1,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                1,
                user,
                ENTITIES.status.PENDING,
                "A description"
        );
        System.out.println(spid_1);
        System.out.println(user);
    }
}
