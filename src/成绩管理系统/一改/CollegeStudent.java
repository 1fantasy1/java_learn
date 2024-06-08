package 成绩管理系统.一改;

import java.util.List;

public class CollegeStudent extends Student {

    public CollegeStudent(String id, String name, List<CourseGrade> grades) {
        super(id, name, grades);
    }

    @Override
    public float sum() {
        return (float) getGrades().stream().mapToDouble(CourseGrade::getGrade).sum();
    }

    @Override
    public float average() {
        return sum() / getGrades().size();
    }
}