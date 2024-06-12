package 成绩管理系统.一改;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        // 创建课程
        Course english = new Course(1, "英语");
        Course math = new Course(2, "数学");
        Course computer = new Course(3, "计算机");
        Course physics = new Course(4, "物理");

        // 创建学生
        CollegeStudent collegeStudent1 = new CollegeStudent("C001", "张三", generateRandomGradesArray(3));
        CollegeStudent collegeStudent2 = new CollegeStudent("C002", "赵六", generateRandomGradesArray(3));

        Undergraduate undergraduate = new Undergraduate("U001", "李四", generateRandomGradesList(3), random.nextFloat() * 40 + 60, "人工智能论文");
        Undergraduate undergraduate2 = new Undergraduate("U002", "田七", generateRandomGradesList(3), random.nextFloat() * 40 + 60, "数据科学论文");

        Student postgraduate = new Student("P001", "王五", generateRandomGradesArray(4), "研究生", random.nextFloat() * 40 + 60, "机器学习论文");
        Student postgraduate2 = new Student("P002", "孙八", generateRandomGradesArray(4), "研究生", random.nextFloat() * 40 + 60, "深度学习论文");

        // 打印学生信息及其总成绩和平均成绩
        printStudentInfo(collegeStudent1);
        printStudentInfo(collegeStudent2);
        printStudentInfo(undergraduate);
        printStudentInfo(undergraduate2);
        printStudentInfo(postgraduate);
        printStudentInfo(postgraduate2);
    }

    private static CourseGrade[] generateRandomGradesArray(int numCourses) {
        CourseGrade[] grades = new CourseGrade[numCourses];
        for (int i = 0; i < numCourses; i++) {
            grades[i] = new CourseGrade(i + 1, random.nextFloat() * 40 + 60);  // 随机生成60到100之间的成绩
        }
        return grades;
    }

    private static List<CourseGrade> generateRandomGradesList(int numCourses) {
        List<CourseGrade> grades = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            grades.add(new CourseGrade(i + 1, random.nextFloat() * 40 + 60));  // 随机生成60到100之间的成绩
        }
        return grades;
    }

    private static void printStudentInfo(Student student) {
        System.out.println(student);
        System.out.println("总成绩: " + student.sum());
        System.out.println("平均成绩: " + student.average());
        if (student.getThesisGrade() != null) {
            System.out.println("论文成绩已加入总成绩中。");
        }
        System.out.println();
    }
}