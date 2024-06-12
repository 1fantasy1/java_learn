package 成绩管理系统.一改;

import java.util.List;

public class Undergraduate extends Student {
    public Undergraduate(String id, String name, List<CourseGrade> grades) {
        super(id, name, grades.toArray(new CourseGrade[0]), "本科生");
    }

    public Undergraduate(String id, String name, List<CourseGrade> grades, float thesisGrade, String thesisTitle) {
        super(id, name, grades.toArray(new CourseGrade[0]), "本科生", thesisGrade, thesisTitle);
    }
}