class SwitchDemo3 {
    public static void main(String[] args) {
        int weekday = 6;
        switch(weekday) {
            case 1 : 
            case 2 : 
            case 3 : 
            case 4 : 
            case 5 : System.out.println("工作日"); break;
            case 6 : 
            case 7 : System.out.println("休息日"); break;
            default:System.out.println("没有这一天！");
        }
    }
}