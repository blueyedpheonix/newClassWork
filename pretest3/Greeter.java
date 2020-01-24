package pretest3;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Greeter implements Comparable<Greeter>{
    private LocalDateTime birthdate;
    private String message;
    private boolean seen;

    public Greeter(LocalDateTime birthdate, String message) {
        this.birthdate = birthdate;
        this.message = message;
        this.seen = false;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public int compareTo(Greeter other) {
        return this.birthdate.compareTo(other.birthdate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeter greeter = (Greeter) o;
        return seen == greeter.seen &&
                Objects.equals(birthdate, greeter.birthdate) &&
                Objects.equals(message, greeter.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthdate, message, seen);
    }

    @Override
    public String toString() {
        return "Greeter{" +
                "birthdate=" + birthdate +
                ", message='" + message + '\'' +
                ", seen=" + seen +
                "}\n";
    }
}
