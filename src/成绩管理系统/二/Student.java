package 成绩管理系统.二;

import java.util.Objects;

public abstract class Student implements Comparable<Student>, ComputeGrade {
    protected String id;                    // 学号
    protected String name;                  // 姓名
    protected CourseGrade[] grades;         // 多门课程的成绩
    protected String degree;                // 学历

    // 构造方法
    public Student(String id, String name, CourseGrade[] grades, String degree) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.degree = degree;
    }

    // get/set方法
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

    public CourseGrade[] getGrades() {
        return grades;
    }

    public void setGrades(CourseGrade[] grades) {
        this.grades = grades;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "学生：{学号='" + id + "', 姓名='" + name + "', 学历='" + degree + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id) && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}