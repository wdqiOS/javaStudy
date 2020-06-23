// 成绩例子
class ScoreLevelDemo {
    public static void main(String[] args) {
        int score = 9;
        if (score >= 90) {
            System.out.println("优");
        } else if (score >= 80 && score < 90) {
            System.out.println("良");
        } else if (score >= 70 && score < 80) {
            System.out.println("中");
        } else {
            System.out.println("多多努力！");
        }
    }
}