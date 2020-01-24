package Objects;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Grade> gradeList;
    public Student(String name, int age) {
        super(name, age);
        gradeList = new ArrayList<>();
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }
}
