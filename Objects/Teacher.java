package Objects;

public class Teacher extends Person {
    private Profestion profestion;
    public Teacher(String name, int age,Profestion profestion) {
        super(name, age);
        this.profestion = profestion;
    }

    public Profestion getProfestion() {
        return profestion;
    }

    public void setProfestion(Profestion profestion) {
        this.profestion = profestion;
    }
}
