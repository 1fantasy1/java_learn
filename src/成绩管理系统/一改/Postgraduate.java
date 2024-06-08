package 成绩管理系统.一改;

import java.util.List;

public class Postgraduate extends Student {
    private float thesisGrade;

    public Postgraduate(String id, String name, List<CourseGrade> grades, float thesisGrade) {
        super(id, name, grades);
        this.thesisGrade = thesisGrade;
    }

    public float getThesisGrade() {
        return thesisGrade;
    }

    public void setThesisGrade(float thesisGrade) {
        this.thesisGrade = thesisGrade;
    }

    @Override
    public float sum() {
        return (float) getGrades().stream().mapToDouble(CourseGrade::getGrade).sum() + thesisGrade;
    }

    @Override
    public float average() {
        return sum() / (getGrades().size() + 1);  // 论文成绩也算一个科目
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", 论文：{成绩=%.1f}\n论文成绩已加入总成绩中。", thesisGrade);
    }
}