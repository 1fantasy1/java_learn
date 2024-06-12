package 实验5.计算几何体体积;

// 定义接口 Shape，包含计算体积的方法
interface Shape {
    double calculateVolume();
}

// 实现球体类 Sphere，实现 Shape 接口
class Sphere implements Shape {
    private double radius; // 球的半径

    // 构造方法
    public Sphere(double radius) {
        this.radius = radius;
    }

    // 实现 calculateVolume 方法，计算球体积
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// 实现立方体类 Cube，实现 Shape 接口
class Cube implements Shape {
    private double side; // 立方体的边长

    // 构造方法
    public Cube(double side) {
        this.side = side;
    }

    // 实现 calculateVolume 方法，计算立方体体积
    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}

// 实现圆柱体类 Cylinder，实现 Shape 接口
class Cylinder implements Shape {
    private double radius; // 圆柱体的半径
    private double height; // 圆柱体的高度

    // 构造方法
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // 实现 calculateVolume 方法，计算圆柱体体积
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

// 主类，包含 main 方法
public class Main {
    public static void main(String[] args) {
        // 创建球的实例并计算体积
        Shape sphere = new Sphere(5);
        // 创建立方体的实例并计算体积
        Shape cube = new Cube(3);
        // 创建圆柱体的实例并计算体积
        Shape cylinder = new Cylinder(4, 6);

        // 输出结果
        System.out.println("球体积: " + sphere.calculateVolume());
        System.out.println("立方体体积: " + cube.calculateVolume());
        System.out.println("圆柱体体积: " + cylinder.calculateVolume());
    }
}