package 成绩管理系统.一;

public class Main {
    public static void main(String[] args) {
        // 创建课程
        Course english = new Course(1, "英语");
        Course math = new Course(2, "数学");
        Course computer = new Course(3, "计算机");

        // 创建课程成绩
        CourseGrade[] collegeGrades = {
            new CourseGrade(1, 85),
            new CourseGrade(2, 90),
            new CourseGrade(3, 95)
        };

        CourseGrade[] undergraduateGrades = {
            new CourseGrade(1, 80),
            new CourseGrade(2, 85),
            new CourseGrade(3, 90)
        };

        CourseGrade[] postgraduateGrades = {
            new CourseGrade(1, 75),
            new CourseGrade(2, 80),
            new CourseGrade(3, 85)
        };

        // 创建学生
        CollegeStudent collegeStudent = new CollegeStudent("C001", "张三", collegeGrades);
        Undergraduate undergraduate = new Undergraduate("U001", "李四", undergraduateGrades, 88, "人工智能论文");
        Postgraduate postgraduate = new Postgraduate("P001", "王五", postgraduateGrades, 92, "机器学习论文");

        // 打印学生信息及其总成绩和平均成绩
        printStudentInfo(collegeStudent);
        printStudentInfo(undergraduate);
        printStudentInfo(postgraduate);
    }

    private static void printStudentInfo(Student student) {
        System.out.println(student);
        System.out.println("总成绩: " + student.sum());
        System.out.println("平均成绩: " + student.average());
        System.out.println();
    }
}
