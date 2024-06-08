package 成绩管理系统.二;

public class Main {
    public static void main(String[] args) {
        // 创建课程
        Course english = new Course(1, "英语");
        Course math = new Course(2, "数学");
        Course computer = new Course(3, "计算机");
        Course physics = new Course(4, "物理");

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
            new CourseGrade(3, 85),
            new CourseGrade(4, 90)
        };

        // 创建学生
        CollegeStudent collegeStudent1 = new CollegeStudent("C001", "张三", collegeGrades);
        CollegeStudent collegeStudent2 = new CollegeStudent("C002", "赵六", new CourseGrade[]{
            new CourseGrade(1, 88),
            new CourseGrade(2, 78),
            new CourseGrade(3, 92)
        });

        Undergraduate undergraduate = new Undergraduate("U001", "李四", undergraduateGrades, 88, "人工智能论文");
        Undergraduate undergraduate2 = new Undergraduate("U002", "田七", new CourseGrade[]{
            new CourseGrade(1, 75),
            new CourseGrade(2, 82),
            new CourseGrade(3, 88)
        }, 90, "数据科学论文");

        Postgraduate postgraduate = new Postgraduate("P001", "王五", postgraduateGrades, 92, "机器学习论文");
        Postgraduate postgraduate2 = new Postgraduate("P002", "孙八", new CourseGrade[]{
            new CourseGrade(1, 85),
            new CourseGrade(2, 89),
            new CourseGrade(3, 94),
            new CourseGrade(4, 88)
        }, 95, "深度学习论文");

        // 打印学生信息及其总成绩和平均成绩
        printStudentInfo(collegeStudent1);
        printStudentInfo(collegeStudent2);
        printStudentInfo(undergraduate);
        printStudentInfo(undergraduate2);
        printStudentInfo(postgraduate);
        printStudentInfo(postgraduate2);
    }

    private static void printStudentInfo(Student student) {
        System.out.println(student);
        System.out.println("总成绩: " + student.sum());
        System.out.println("平均成绩: " + student.average());
        if (student instanceof Undergraduate || student instanceof Postgraduate) {
            System.out.println("论文成绩已加入总成绩中。");
        }
        System.out.println();
    }
}