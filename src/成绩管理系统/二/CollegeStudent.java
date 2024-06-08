package 成绩管理系统.二;

public class CollegeStudent extends Student {
    public CollegeStudent(String id, String name, CourseGrade[] grades) {
        super(id, name, grades, "本科生");
    }

    @Override
    public int sum() {
        int total = 0;
        for (CourseGrade grade : grades) {
            total += grade.getGrade();
        }
        return total;
    }

    @Override
    public int average() {
        return sum() / grades.length;
    }
}