package Objects;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static int avarageGradeStudent(Student student){
        int avg = 0;
        int counter = 0;
        for (Grade grade : student.getGradeList()) {
            avg += grade.getScore();
            counter++;
        }
        avg /= counter;
        return avg;
    }

    public static void avarageOfClass(School school){
        int avg = 0;
        for (ClassRoom classRoom : school.getClassRoomList()) {
            avg = avarageOfClassRoom(classRoom);
            System.out.printf("The avarage grade for %s is: %d\n",classRoom.getName(),avg);
        }
    }

    public static void avarageSchoolGrad(School school){
        int avg = 0;
        int counter = 0;
        for (ClassRoom classRoom : school.getClassRoomList()) {
            avg += avarageOfClassRoom(classRoom);
            counter++;
        }
        avg /= counter;
        System.out.printf("The avarage of the school is: %d\n",avg);
    }

    public static void avarageForEachProffession(School school){
        int avg =0;
        List<Profestion> profestionList = new ArrayList<>();
        profestionList.add(Profestion.LITERATURE);
        profestionList.add(Profestion.CHEMESTRY);
        profestionList.add(Profestion.GEOGRAPHY);
        profestionList.add(Profestion.MATH);
        profestionList.add(Profestion.PHYSICS);
        profestionList.add(Profestion.SPORTS);
        for (Profestion type : profestionList){
            avg = avarageOfProfession(school,type);
            System.out.printf("The avarage of %s in the school is:%d\n",type,avg);
        }
    }

    public static int avarageOfClassRoom(ClassRoom classRoom){
        int avg = 0;
        int counter = 0;
        for (Student student : classRoom.getStudentList()) {
            avg += avarageGradeStudent(student);
            counter++;
        }
        avg /= counter;
        return avg;
    }

    public static int avarageOfStudentProfession(Student student, Profestion type){
        int avg = 0;
        int counter = 0;
        for (Grade grade : student.getGradeList()) {
            if (grade.getProfestion() == type){
                avg += grade.getScore();
                counter++;
            }
        }
        avg /= counter;
        return avg;
    }
    public static int avarageOfProfession(School school, Profestion type){
        int avg = 0;
        int counter = 0;
        for (ClassRoom classRoom : school.getClassRoomList()) {
            for (Student student : classRoom.getStudentList()) {
                avg += avarageOfStudentProfession(student,type);
                counter++;
            }
        }
        avg /= counter;
        return avg;
    }
    public static void avarageOfStudents2030(School school){
        int avg = 0;
        int counter= 0;
        for (ClassRoom classRoom : school.getClassRoomList()) {
            for (Student student: classRoom.getStudentList()){
                if (student.getAge() >= 20 && student.getAge() <= 30){
                    avg += avarageGradeStudent(student);
                    counter++;
                }
            }
        }
        avg /= counter;
        System.out.printf("The number of students between the ages of 20-30 is: %d and there avarage is: %d\n",
                counter,avg);
    }
}
