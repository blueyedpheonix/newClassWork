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
        while(!action.equals("exit")){
            if(action == "get"){
                greetSystem.getGreeterList();
            }
            
          action = input.nextLine();
        }
        thread.interrupt();
    }
}
