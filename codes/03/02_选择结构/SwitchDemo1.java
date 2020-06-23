// Switch选择结构
public class SwitchDemo1 {
    public static void main(String[] args) {
        int weekday = 2;
        switch(weekday) {
            case 1 : System.out.println("周一"); break;
            case 2 : System.out.println("周二"); break;
            case 3 : System.out.println("周三"); break;
            case 4 : System.out.println("周四"); break;
            case 5 : System.out.println("周五"); break;
            case 6 : System.out.println("周六"); break;
            case 7 : System.out.println("周日"); break;
            default:System.out.println("没有这一天！");
        }
    }
}