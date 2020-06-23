
// 点对象
class Point {
    private int x; // 横坐标
    private int y; // 纵坐标

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}

// 圆对象
class Circle {
    private int r; // 半径

    Circle(int r) {
        this.r = r;
    }

    /*
        判断点和圆的关系
            参数：需要判断的点对象
            返回：
                1：表示在圆外
                0：圆上
               -1：圆内
     */
    int judge(Point p) {
        int xxyy = p.getX() * p.getX() + p.getY() * p.getY();
        int rr = this.r * this.r;
        if (xxyy > rr) {
            return 1;
        } else if(xxyy < rr) {
            return -1;
        } else {
            return 0;
        }
    }

}

// 练习：判断一个点和圆的关系（圆内、圆外、圆上）
class PointDemo {
    public static void main(String[] args) {
        // 创建一个点对象
        Point p = new Point(3, 4);
        // 创建一个半径为5的圆对象
        Circle c = new Circle(5);
        // 判断
        int ret = c.judge(p);
        System.out.println(ret);
    }
}