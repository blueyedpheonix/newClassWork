package pretest3;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        GreetSystem greetSystem = GreetSystem.getinstance();
        Thread thread = greetSystem.getGreeterThread();
        thread.start();
        Scanner input = new Scanner(System.in);
        String action = "";
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(!action.equals("exit")){
            System.out.println("enter an action");
            action = input.nextLine();

          if(action.equals("add")){
              System.out.println("enter year");
              int year = input.nextInt();
              System.out.println("enter month");
              int month = input.nextInt();
              System.out.println("enter day");
              int day = input.nextInt();
              System.out.println("enter hour");
              int hour = input.nextInt();
              System.out.println("enter minutes");
              int minuts = input.nextInt();
              System.out.println("enter message");
              input.next();
              String message = input.nextLine();
              greetSystem.addGreeter(new Greeter(LocalDateTime.of(year,month,day,hour,minuts),message));
              System.out.println("added");
          }
            if(action.equals("get")){
                System.out.println(greetSystem.getGreeterList());
            }


        }
        thread.interrupt();
    }
}
