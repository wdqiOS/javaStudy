// 三元运算符在分页业务逻辑中的使用
public class PageDemo {
    public static void main(String[] args) {
        /*
            需求：给出一共有46条数据，要求每一页最多10条数据，计算：一共多少页？
         */
        int totalCount = 51;
        int pageSize = 10; // 每一页最多10条数据

        // 总页数
        int page = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        System.out.println(page);

        int currentPage = 1;
        // 上一页
        int prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
        System.out.println(prevPage);
    }
}