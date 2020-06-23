class IfElseDemo {
    public static void main(String[] args) {
        /*
                if-else:表示，如果...,就干...,否则....
         */
        boolean isMan = false;
        if (isMan) {
            System.out.println("去男厕所");
        } else {
            System.out.println("去女厕所");
        }

        // 求最大值，最小值
        int x = 200;
        int y = 201;
        if (x >= y) {
            System.out.println("x大于Y");
        } else {
            System.out.println("x小于Y");
        }

        String ret = x >= y ? "x大于y": "x小于y";
        System.out.println(ret);

        // 分页案例
        int totalCount = 51;
        int pageSize = 10;
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        System.out.println(totalPage);

        if (totalCount % pageSize == 0) {
            totalPage = totalCount / pageSize;
        } else {
            totalPage = totalCount / pageSize + 1;
        }
        System.out.println(totalPage);
    }
}