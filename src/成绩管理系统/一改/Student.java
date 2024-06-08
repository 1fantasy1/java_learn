package 成绩管理系统.一改;

import java.util.List;

public abstract class Student {
    private String id;
    private String name;
    private List<CourseGrade> grades;

    public Student(String id, String name, List<CourseGrade> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseGrade> getGrades() {
        return grades;
    }

    public void setGrades(List<CourseGrade> grades) {
        this.grades = grades;
    }

    public abstract float sum();
    public abstract float average();

    @Override
    public String toString() {
        return String.format("学生：{学号='%s', 姓名='%s', 学历='%s'}", id, name, getClass().getSimpleName());
    }
}