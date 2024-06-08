package 成绩管理系统.一;

public class Course {
    private int id;          // 课程ID
    private String name;     // 课程名，如英语、数学、计算机等

    // 构造方法
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // get/set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}