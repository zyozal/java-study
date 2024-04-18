package day08.static_.practice1;

public class Department {
    private String departmentName;
    private int studentCount;
    private static int totalStudents;


    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void addStudent(int num) {
        studentCount += num;
        totalStudents += num;
    }

}
