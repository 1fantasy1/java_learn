package 成绩管理系统.一改;

public class CollegeStudent extends Student {
    public CollegeStudent(String id, String name, CourseGrade[] grades) {
        super(id, name, grades, "本科生");  // 调用父类的构造方法
    }
}