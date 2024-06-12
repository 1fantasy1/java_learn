package 实验5.平面二维点;

import java.util.Random;

// 抽象类 Point，定义显示方法
abstract class Point {
    abstract void display();
}

// 浮点数二维点类 FloatPoint，继承 Point 抽象类
class FloatPoint extends Point {
    private float x, y; // 浮点数二维点的坐标

    // 构造方法
    public FloatPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // 实现 display 方法，显示浮点数二维点的坐标
    @Override
    void display() {
        System.out.println("浮点二维点: (" + x + ", " + y + ")");
    }
}

// 双精度数二维点类 DoublePoint，继承 Point 抽象类
class DoublePoint extends Point {
    private double x, y; // 双精度数二维点的坐标

    // 构造方法
    public DoublePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 实现 display 方法，显示双精度数二维点的坐标
    @Override
    void display() {
        System.out.println("双精度二维点: (" + x + ", " + y + ")");
    }
}

// 主类，包含 main 方法

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        // 随机创建浮点数二维点实例
        FloatPoint floatPoint = new FloatPoint(rand.nextFloat(), rand.nextFloat());
        // 随机创建双精度数二维点实例
        DoublePoint doublePoint = new DoublePoint(rand.nextDouble(), rand.nextDouble());

        // 显示点的坐标
        floatPoint.display();
        doublePoint.display();
    }
}