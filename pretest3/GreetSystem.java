package pretest3;

import java.time.LocalDateTime;
import java.util.*;

public class GreetSystem {
    private Set<Greeter> greeterSet;
    private GreeterTask greeterTask;
    private Thread greeterThread;
    private static GreetSystem greetSystem;

    private GreetSystem() {
        greeterSet = new HashSet<>();
        greeterSet.add(new Greeter(LocalDateTime.of(1995,3,12,12,00,00),"hello"));
        greeterSet.add(new Greeter(LocalDateTime.of(1987,1,12,12,00,00),"is birthday"));
        greeterSet.add(new Greeter(LocalDateTime.of(2001,1,12,12,00,00),"lamalo"));
        greeterSet.add(new Greeter(LocalDateTime.of(1989,12,12,12,00,00),"hello"));
        greeterSet.add(new Greeter(LocalDateTime.of(1996,3,12,12,00,00),"hello"));
        this.greeterTask = new GreeterTask(greeterSet);
        greeterThread = new Thread(greeterTask);
        greeterThread.setDaemon(true);
    }
    public List<Greeter> getGreeterList(){
        List<Greeter> greeterList = new ArrayList<>();
        greeterList.addAll(greeterSet);
        Collections.sort(greeterList);
        return greeterList;
    }

    public boolean addGreeter (Greeter greeter){
        Set<Greeter> newset = new HashSet<>(greeterSet);
        boolean isAdded = newset.add(greeter);
        setTheSet(newset);
        greeterTask.setGreeters(greeterSet);
        return isAdded;
    }

    public void setTheSet(Set<Greeter> set){
        this.greeterSet = set;
    }

    public Thread getGreeterThread() {
        return greeterThread;
    }

    public static GreetSystem getinstance(){
        if(greetSystem == null){
            greetSystem = new GreetSystem();
        }
        return  greetSystem;
    }
}
