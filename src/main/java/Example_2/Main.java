package Example_2;
import java.util.*;

public class Main {
    public static void main(String[] args){

        TelephoneBook telephone = new TelephoneBook();
        telephone .add("Ivanov", "+78007006655");
        telephone .add("Smirnov", "+77006005544");
        telephone .add("Bogdanov", "+76005004433");
        System.out.println(telephone .get("Ivanov"));
        System.out.println(telephone .get("Smirnov"));
        System.out.println(telephone .get("Bogdanov"));

    }

}

