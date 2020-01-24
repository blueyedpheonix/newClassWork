package Objects;

import java.util.List;

public class School {
    private List<ClassRoom> classRoomList;

    public School(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
    }

    public List<ClassRoom> getClassRoomList() {
        return classRoomList;
    }

    public void setClassRoomList(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
    }

    @Override
    public String toString() {
        return "School{" +
                "classRoomList=" + classRoomList +
                '}';
    }
}
