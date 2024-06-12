package 实验5.继承和接口;

// 定义接口 Moveable，包含 move 方法
interface Moveable {
    void move();
}

// 抽象类 Animal，定义 makeSound 方法
abstract class Animal {
    abstract void makeSound();
}

// 抽象类 Mammal 继承 Animal 并实现 Moveable 接口
abstract class Mammal extends Animal implements Moveable {
}

// 具体类 Horse 继承 Mammal
class Horse extends Mammal {
    // 实现 move 方法
    @Override
    public void move() {
        System.out.println("马在跑");
    }

    // 实现 makeSound 方法
    @Override
    void makeSound() {
        System.out.println("马在叫");
    }
}

// 具体类 Dog 继承 Mammal
class Dog extends Mammal {
    // 实现 move 方法
    @Override
    public void move() {
        System.out.println("狗在跑");
    }

    // 实现 makeSound 方法
    @Override
    void makeSound() {
        System.out.println("狗在叫");
    }
}

// 具体类 Cat 继承 Mammal
class Cat extends Mammal {
    // 实现 move 方法
    @Override
    public void move() {
        System.out.println("猫在跳");
    }

    // 实现 makeSound 方法
    @Override
    void makeSound() {
        System.out.println("猫在叫");
    }
}

// 主类，包含 main 方法
public class Main {
    public static void main(String[] args) {
        // 创建马的实例
        Mammal horse = new Horse();
        // 创建狗的实例
        Mammal dog = new Dog();
        // 创建猫的实例
        Mammal cat = new Cat();

        // 调用方法
        horse.move();
        horse.makeSound();

        dog.move();
        dog.makeSound();

        cat.move();
        cat.makeSound();
    }
}