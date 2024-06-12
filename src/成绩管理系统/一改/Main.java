package 成绩管理系统.一改;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CourseGrade cg1 = new CourseGrade(1, 90);
        CourseGrade cg2 = new CourseGrade(2, 85);
        CourseGrade cg3 = new CourseGrade(3, 95);
        CourseGrade cg4 = new CourseGrade(4, 88);
        CourseGrade cg5 = new CourseGrade(5, 83);

        // 创建本科生
        Student student1 = new CollegeStudent("C001", "张三", Arrays.asList(cg1, cg2, cg3));
        System.out.println(student1);
        System.out.printf("总成绩: %.1f\n", student1.sum());
        System.out.printf("平均成绩: %.1f\n", student1.average());

        Student student2 = new CollegeStudent("C002", "赵六", Arrays.asList(cg1, cg4, cg5));
        System.out.println(student2);
        System.out.printf("总成绩: %.1f\n", student2.sum());
        System.out.printf("平均成绩: %.1f\n", student2.average());

        // 创建本科生（含论文成绩）
        Student student3 = new Undergraduate("U001", "李四", Arrays.asList(cg1, cg2, cg3), 88.0f);
        System.out.println(student3);
        System.out.printf("总成绩: %.1f\n", student3.sum());
        System.out.printf("平均成绩: %.1f\n", student3.average());

        Student student4 = new Undergraduate("U002", "田七", Arrays.asList(cg1, cg4, cg5), 90.0f);
        System.out.println(student4);
        System.out.printf("总成绩: %.1f\n", student4.sum());
        System.out.printf("平均成绩: %.1f\n", student4.average());

        // 创建研究生（含论文成绩）
        Student student5 = new Postgraduate("P001", "王五", Arrays.asList(cg1, cg2, cg3, cg4), 92.0f);
        System.out.println(student5);
        System.out.printf("总成绩: %.1f\n", student5.sum());
        System.out.printf("平均成绩: %.1f\n", student5.average());

        Student student6 = new Postgraduate("P002", "孙八", Arrays.asList(cg1, cg4, cg5, cg2), 95.0f);
        System.out.println(student6);
        System.out.printf("总成绩: %.1f\n", student6.sum());
        System.out.printf("平均成绩: %.1f\n", student6.average());
    }
}