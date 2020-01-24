package pretest3;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class GreeterTask implements  Runnable{
    private Set<Greeter> greeters;

    public GreeterTask(Set<Greeter> greeters) {
        this.greeters = greeters;
    }

    public Set<Greeter> getGreeters() {
        return greeters;
    }

    public void setGreeters(Set<Greeter> greeters) {
        this.greeters = greeters;
    }

    @Override
    public void run() {
        while(true){
            for (Greeter greeter : greeters) {
                if(deservesBirthdayGreet(greeter)){
                    System.out.println(greeter.getMessage());
                    greeter.setSeen(true);
                }
            }
        }
    }
    private boolean deservesBirthdayGreet(Greeter greeter){
        return (greeter.getBirthdate().getMonth().equals(LocalDateTime.now().getMonth()) && !greeter.isSeen());
    }
}
