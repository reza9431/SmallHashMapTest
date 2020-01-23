import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StList {
    public static void main(String[] args) {







            Scanner input = new Scanner(System.in);


            System.out.println("Please Enter Student Name: ");

            String name = input.next();

            System.out.println("Please Enter the Point: ");



             int point2 = input.nextInt();






           HashMap<String, Integer> stlist1 = new HashMap<>();
            stlist1.put(name ,point2 );


            for (String stu : stlist1.keySet()
            ) {

                System.out.println(stu + " : " + stlist1.get(stu));


            }



    }
}