package 成绩管理系统.二;

public class Undergraduate extends Student {
    private float thesisGrade;     // 论文成绩
    private String thesisTitle;    // 论文题目

    // 构造方法
    public Undergraduate(String id, String name, CourseGrade[] grades, float thesisGrade, String thesisTitle) {
        super(id, name, grades, "本科生");
        this.thesisGrade = thesisGrade;
        this.thesisTitle = thesisTitle;
    }

    // get/set方法
    public float getThesisGrade() {
        return thesisGrade;
    }

    public void setThesisGrade(float thesisGrade) {
        this.thesisGrade = thesisGrade;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public int sum() {
        int total = (int) thesisGrade;
        for (CourseGrade grade : grades) {
            total += grade.getGrade();
        }
        return total;
    }

    @Override
    public int average() {
        return sum() / (grades.length + 1);
    }

    @Override
    public String toString() {
        return super.toString() + ", 论文：{标题='" + thesisTitle + "', 成绩=" + thesisGrade + "}";
    }
}