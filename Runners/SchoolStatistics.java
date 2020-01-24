package Runners;

import Objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Objects.Helper.*;

public class SchoolStatistics {
    public static void main(String[] args) {
        int counter = 0;
        Random rand = new Random();
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        List<Student> studentList4 = new ArrayList<>();
        List<Student> studentList5 = new ArrayList<>();

        Student student1 = new Student("dylan",rand.nextInt(100)+20);
        studentList1.add(student1);
        Student student2 = new Student("yitsik",rand.nextInt(100)+20);
        studentList1.add(student2);
        Student student3 = new Student("jake",rand.nextInt(100)+20);
        studentList1.add(student3);
        Student student4 = new Student("omer",rand.nextInt(100)+20);
        studentList1.add(student4);
        Student student5 = new Student("gal",rand.nextInt(100)+20);
        studentList1.add(student5);
        Student student6 = new Student("gilad",rand.nextInt(100)+20);
        studentList2.add(student6);
        Student student7 = new Student("rotem",rand.nextInt(100)+20);
        studentList2.add(student7);
        Student student8 = new Student("niv",rand.nextInt(100)+20);
        studentList2.add(student8);
        Student student9 = new Student("itay",rand.nextInt(100)+20);
        studentList2.add(student9);
        Student student10 = new Student("avner",rand.nextInt(100)+20);
        studentList2.add(student10);
        Student student11 = new Student("kjfsdf",rand.nextInt(100)+20);
        studentList3.add(student11);
        Student student12 = new Student("asdf",rand.nextInt(100)+20);
        studentList3.add(student12);
        Student student13 = new Student("sdff",rand.nextInt(100)+20);
        studentList3.add(student13);
        Student student14 = new Student("asdfsdf",rand.nextInt(100)+20);
        studentList3.add(student14);
        Student student15 = new Student("jdhfsjk",rand.nextInt(100)+20);
        studentList3.add(student15);
        Student student16 = new Student("kjsks",rand.nextInt(100)+20);
        studentList4.add(student16);
        Student student17 = new Student("jsdfk",rand.nextInt(100)+20);
        studentList4.add(student17);
        Student student18 = new Student("sdfkkj",rand.nextInt(100)+20);
        studentList4.add(student18);
        Student student19 = new Student("dfalkf",rand.nextInt(100)+20);
        studentList4.add(student19);
        Student student20 = new Student("kasdfh",rand.nextInt(100)+20);
        studentList4.add(student20);
        Student student21 = new Student("weuru",rand.nextInt(100)+20);
        studentList5.add(student21);
        Student student22 = new Student("tewouq",rand.nextInt(100)+20);
        studentList5.add(student22);
        Student student23 = new Student("rijcn",rand.nextInt(100)+20);
        studentList5.add(student23);
        Student student24 = new Student("zmcvn",rand.nextInt(100)+20);
        studentList5.add(student24);
        Student student25 = new Student("zxcvdfj",rand.nextInt(100)+20);
        studentList5.add(student25);



        Teacher teacher1 = new Teacher("enosh",rand.nextInt(100)+20, Profestion.CHEMESTRY);
        Teacher teacher2 = new Teacher("maureen",rand.nextInt(100)+20, Profestion.GEOGRAPHY);
        Teacher teacher3 = new Teacher("oren",rand.nextInt(100)+20, Profestion.LITERATURE);
        Teacher teacher4 = new Teacher("udi",rand.nextInt(100)+20, Profestion.MATH);
        Teacher teacher5 = new Teacher("boaz",rand.nextInt(100)+20, Profestion.PHYSICS);

        List<ClassRoom> classRoomList = new ArrayList<>(5);
        ClassRoom classRoom1 = new ClassRoom("classroom1",teacher1,studentList1);
        classRoomList.add(classRoom1);
        ClassRoom classRoom2 = new ClassRoom("classroom2",teacher2,studentList2);
        classRoomList.add(classRoom2);
        ClassRoom classRoom3 = new ClassRoom("classroom3",teacher3,studentList3);
        classRoomList.add(classRoom3);
        ClassRoom classRoom4 = new ClassRoom("classroom4",teacher4,studentList4);
        classRoomList.add(classRoom4);
        ClassRoom classRoom5 = new ClassRoom("classroom5",teacher5,studentList5);
        classRoomList.add(classRoom5);
        for (ClassRoom classRoom : classRoomList) {
            for (Student student : classRoom.getStudentList()) {
                student.getGradeList().add(new Grade(Profestion.CHEMESTRY, rand.nextInt(60)+40));
                student.getGradeList().add(new Grade(Profestion.PHYSICS, rand.nextInt(60)+40));
                student.getGradeList().add(new Grade(Profestion.MATH, rand.nextInt(60)+40));
                student.getGradeList().add(new Grade(Profestion.LITERATURE, rand.nextInt(60)+40));
                student.getGradeList().add(new Grade(Profestion.GEOGRAPHY, rand.nextInt(60)+40));
                student.getGradeList().add(new Grade(Profestion.SPORTS, rand.nextInt(60)+40));
            }
        }

        School school = new School(classRoomList);
        avarageSchoolGrad(school);
        avarageOfClass(school);
        avarageForEachProffession(school);
        avarageOfStudents2030(school);


    }
//    public static int avarageGradeStudent(Student student){
//        int avg = 0;
//        int counter = 0;
//        for (Grade grade : student.getGradeList()) {
//            avg += grade.getScore();
//            counter++;
//        }
//        avg /= counter;
//        return avg;
//    }
//
//    public static void avarageOfClass(School school){
//        int avg = 0;
//        for (ClassRoom classRoom : school.getClassRoomList()) {
//            avg = avarageOfClassRoom(classRoom);
//            System.out.printf("The avarage grade for %s is: %d\n",classRoom.getName(),avg);
//        }
//    }
//
//    public static void avarageSchoolGrad(School school){
//        int avg = 0;
//        int counter = 0;
//        for (ClassRoom classRoom : school.getClassRoomList()) {
//            avg += avarageOfClassRoom(classRoom);
//            counter++;
//        }
//        avg /= counter;
//        System.out.printf("The avarage of the school is: %d\n",avg);
//    }
//
//    public static void avarageForEachProffession(School school){
//        int avg =0;
//        List<Profestion> profestionList = new ArrayList<>();
//        profestionList.add(Profestion.LITERATURE);
//        profestionList.add(Profestion.CHEMESTRY);
//        profestionList.add(Profestion.GEOGRAPHY);
//        profestionList.add(Profestion.MATH);
//        profestionList.add(Profestion.PHYSICS);
//        profestionList.add(Profestion.SPORTS);
//        for (Profestion type : profestionList){
//            avg = avarageOfProfession(school,type);
//            System.out.printf("The avarage of %s in the school is:%d\n",type,avg);
//        }
//    }
//
//    public static int avarageOfClassRoom(ClassRoom classRoom){
//        int avg = 0;
//        int counter = 0;
//        for (Student student : classRoom.getStudentList()) {
//            avg += avarageGradeStudent(student);
//            counter++;
//        }
//        avg /= counter;
//        return avg;
//    }
//
//    public static int avarageOfStudentProfession(Student student, Profestion type){
//        int avg = 0;
//        int counter = 0;
//        for (Grade grade : student.getGradeList()) {
//            if (grade.getProfestion() == type){
//                avg += grade.getScore();
//                counter++;
//            }
//        }
//        avg /= counter;
//        return avg;
//    }
//    public static int avarageOfProfession(School school, Profestion type){
//        int avg = 0;
//        int counter = 0;
//        for (ClassRoom classRoom : school.getClassRoomList()) {
//            for (Student student : classRoom.getStudentList()) {
//                avg += avarageOfStudentProfession(student,type);
//                counter++;
//            }
//        }
//        avg /= counter;
//        return avg;
//    }
//    public static void avarageOfStudents2030(School school){
//        int avg = 0;
//        int counter= 0;
//        for (ClassRoom classRoom : school.getClassRoomList()) {
//            for (Student student: classRoom.getStudentList()){
//                if (student.getAge() >= 20 && student.getAge() <= 30){
//                    avg += avarageGradeStudent(student);
//                    counter++;
//                }
//            }
//        }
//        avg /= counter;
//        System.out.printf("The number of students between the ages of 20-30 is: %d and there avarage is: %d\n",
//                counter,avg);
//    }
}
