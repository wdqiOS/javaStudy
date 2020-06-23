// 枚举是从java5开始提供的一种新的数据类型，是一个特殊的类，就是固定的多个常量对象的集合。
/* 定义格式：
【修饰符】enum 类名 {
    常量A，常量B，常量C
}

*/
enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
}
/*
// 定义一个星期几的常量类
class Weekday {
    private Weekday(){};
    public static final Weekday MONDAY = new Weekday();
    public static final Weekday TUESDAY = new Weekday();
    public static final Weekday WEDNESDAY = new Weekday();
    public static final Weekday THURSDAY = new Weekday();
    public static final Weekday FRIDAY = new Weekday();
    public static final Weekday SATURDAY = new Weekday();
    public static final Weekday SUNDAY = new Weekday();
}

class Employee {
    private Weekday restday; // 一周的哪一天休息

    public Weekday getRestday(){
        return restday;
    }
    public void setRestday(Weekday restday) {
        this.restday = restday;
    }
}
*/

/*
    枚举单例
 */
enum ArrayUtil {
    INSTANCE;
    // 排序操作
    public void sort() {
        System.out.println("排序操作");
    }
}

// 枚举
class EnumDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        /*
        // 设置周三休息
        e.setRestday(13);

        int restday = e.getRestday();
        if (restday == 6 || restday == 7) {
            System.out.println("周六或周日休息");
        } else {
            System.out.println("周一到周五休息");
        }
        */
       e.setRestday(Weekday.SATURDAY);
       Weekday restday = e.getRestday();
       if (restday == Weekday.SATURDAY || restday == Weekday.SUNDAY) {
            System.out.println("周六或周日休息");
       } else {
            System.out.println("周一到周五休息");
       }

       System.out.println(Weekday.WEDNESDAY.ordinal());
       System.out.println(Weekday.WEDNESDAY.name());
       Weekday[] ws = Weekday.values();
       for (Weekday wk : ws) {
           System.out.println(wk.name());
       }

       System.out.println("------------------------");
       Weekday day = Weekday.valueOf("MONDAY");
       System.out.println(day.name());

       switch(Weekday.SUNDAY) {
        case MONDAY: break;
        case TUESDAY: break;
        default:
            break;
       }

        // 枚举单例
        System.out.println(ArrayUtil.INSTANCE == ArrayUtil.INSTANCE);
        ArrayUtil.INSTANCE.sort();
        ArrayUtil.INSTANCE.sort();
    }
}