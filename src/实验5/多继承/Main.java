package 实验5.多继承;

// 定义接口 Flyable，包含 fly 方法
interface Flyable {
    void fly();
}

// 定义接口 Speakable，包含 speak 方法
interface Speakable {
    void speak();
}

// 乌鸦类 Crow 实现 Flyable 接口
class Crow implements Flyable {
    // 实现 fly 方法
    @Override
    public void fly() {
        System.out.println("乌鸦在飞");
    }
}

// 大猩猩类 Gorilla 实现 Speakable 接口
class Gorilla implements Speakable {
    // 实现 speak 方法
    @Override
    public void speak() {
        System.out.println("大猩猩在说话");
    }
}

// 鹦鹉类 Parrot 实现 Flyable 和 Speakable 接口
class Parrot implements Flyable, Speakable {
    // 实现 fly 方法
    @Override
    public void fly() {
        System.out.println("鹦鹉在飞");
    }

    // 实现 speak 方法
    @Override
    public void speak() {
        System.out.println("鹦鹉在说话");
    }
}

// 主类，包含 main 方法
public class Main {
    public static void main(String[] args) {
        // 创建乌鸦的实例
        Flyable crow = new Crow();
        // 创建大猩猩的实例
        Speakable gorilla = new Gorilla();
        // 创建鹦鹉的实例
        Parrot parrot = new Parrot();

        // 调用方法
        crow.fly();
        gorilla.speak();
        parrot.fly();
        parrot.speak();
    }
}