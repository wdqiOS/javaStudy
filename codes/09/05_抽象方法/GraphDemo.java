
// 图形类
abstract class Graph {
    // 求面积的行为
    abstract public Double getArea();
}

// 圆
class Circle extends Graph{
    private Integer r;
    Circle(Integer r) {
        this.r = r;
    }
    // 覆盖父类求面积行为
    public Double getArea() {
        return Math.PI * r * r;
    }
}
// 矩形
class Rectangle extends Graph {
    private Integer width; // 长
    private Integer height; // 高

    Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }
    public Double getArea() {
        return width.doubleValue() * height.doubleValue();
    }
}

// 三角形
class Triangle extends Graph {
    private Integer a;
    private Integer b;
    private Integer c;

    Triangle(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getArea() {
        Double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


// 圆（Circle）、矩形（Rectangle）、三角形（Triangle）的面积
class GraphDemo {
    public static void main(String[] args) {
        // 圆
        System.out.println(new Circle(10).getArea());
        // 矩形
        System.out.println(new Rectangle(10, 5).getArea());
        System.out.println(new Triangle(3, 4, 5).getArea());
    }
}