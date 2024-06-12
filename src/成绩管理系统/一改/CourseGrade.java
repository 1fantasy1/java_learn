package 成绩管理系统.一改;

public class CourseGrade {
    private int id;          // 课程ID
    private float grade;     // 课程成绩

    // 构造方法
    public CourseGrade(int id, float grade) {
        this.id = id;
        this.grade = grade;
    }

    // get/set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}