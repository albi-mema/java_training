package SERVICE;

import ENTITIES.SPID;
import ENTITIES.USER;

public class App {
    public static void main(String[] args) {
        Manager data = new Manager();

        USER user_1 = data.createUser(1,"albin","mema","albi");
        SPID user_1_spid = data.createSpid(user_1,"A description");
        data.addSpid(user_1_spid);
        System.out.println("");


        USER user_2 = data.createUser(2,"eraldo","abedin","eraldo");
        SPID user_2_spid = data.createSpid(user_2,"A description 2");
        data.addSpid(user_2_spid);
        System.out.println("");

        USER user_3 = data.createUser(3,"emer","mbiemer","emer");
        SPID user_3_spid = data.createSpid(user_3,"A description 3");
        data.addSpid(user_3_spid);
        System.out.println("");

        data.editUserName(user_3,"Username3");
        System.out.println("");

        data.editUserSurname(user_2,"Abedini");
        System.out.println("");

        data.editUserUsername(user_3,"A user");
        System.out.println("");

        data.editSpidDescription(user_1_spid,"A new description");
        System.out.println("");

        data.aproveSpid(user_1_spid);
        System.out.println("");

        data.showAllSpids();
        System.out.println("");



        data.searchUserByName("albin").forEach((v) -> System.out.println(v));
        System.out.println("");

        data.searchUserBySurname("abedin").forEach((v) -> System.out.println(v));
        System.out.println("");

        data.searchUserByUsername("emer").forEach((v) -> System.out.println(v));
        System.out.println("");





    }

}



