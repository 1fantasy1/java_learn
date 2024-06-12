package 成绩管理系统.一改;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id;                    // 学号
    private String name;                  // 姓名
    private CourseGrade[] grades;         // 多门课程的成绩
    private String degree;                // 学历
    private Float thesisGrade;            // 论文成绩（可选）
    private String thesisTitle;           // 论文题目（可选）

    // 构造方法（无论文成绩）
    public Student(String id, String name, CourseGrade[] grades, String degree) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.degree = degree;
    }

    // 构造方法（有论文成绩）
    public Student(String id, String name, CourseGrade[] grades, String degree, float thesisGrade, String thesisTitle) {
        this(id, name, grades, degree);
        this.thesisGrade = thesisGrade;
        this.thesisTitle = thesisTitle;
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

    public Float getThesisGrade() {
        return thesisGrade;
    }

    public void setThesisGrade(Float thesisGrade) {
        this.thesisGrade = thesisGrade;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public int sum() {
        int total = 0;
        for (CourseGrade grade : grades) {
            total += grade.getGrade();
        }
        if (thesisGrade != null) {
            total += thesisGrade;
        }
        return total;
    }

    public int average() {
        int divisor = grades.length;
        if (thesisGrade != null) {
            divisor++;
        }
        return sum() / divisor;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', degree='" + degree + "'"
                + (thesisGrade != null ? ", Thesis{title='" + thesisTitle + "', grade=" + thesisGrade + "}" : "") + "}";
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