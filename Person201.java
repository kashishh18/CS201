public class StudentLocation {

    private String studentName;
    private String buildingName;
    private int floorNumber;

    public StudentLocation(){
        studentName = "no-name";
        buildingName = "no-building";
        floorNumber = -1;
    }

    public StudentLocation(String name, String building, int floor) {
        studentName = name;
        buildingName = building;
        floorNumber = floor;
    }

    public String getStudentName(){
        return studentName;
    }

    public boolean isSameBuilding (StudentLocation other) {
        String buildingA = buildingName.toLowerCase();
        String buildingB = other.buildingName.toLowerCase();
        if (buildingA.equals(buildingB)) {
            return true;
        }
        return false;
    }

    public boolean isSameFloor(StudentLocation other) {
        int floorA = floorNumber;
        int floorB = other.floorNumber;

        if(isSameBuilding(other) && floorA == floorB){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != this.getClass()) {
            return false;
        }
        StudentLocation otherStudent = (StudentLocation) other;
        if (this.studentName.equals(otherStudent.studentName) && this.isSameFloor(otherStudent)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return studentName + ", " + buildingName + ", " + Integer.toString(floorNumber);
    }
}
