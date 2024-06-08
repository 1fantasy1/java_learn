package 成绩管理系统.一;
//大专生
public class CollegeStudent extends Student {
    public CollegeStudent(String id, String name, CourseGrade[] grades) {
        super(id, name, grades);
    }

    @Override
    public float sum() {
        float total = 0;
        for (CourseGrade grade : grades) {
            total += grade.getGrade();
        }
        return total;
    }

    @Override
    public float average() {
        return sum() / grades.length;
    }
}