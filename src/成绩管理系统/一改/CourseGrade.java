package 成绩管理系统.一改;

public class CourseGrade {
    private int id;
    private float grade;

    public CourseGrade(int id, float grade) {
        this.id = id;
        this.grade = grade;
    }

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