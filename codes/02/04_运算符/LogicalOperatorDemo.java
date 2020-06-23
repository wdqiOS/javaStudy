// 逻辑运算符
public class LogicalOperatorDemo {
    public static void main(String[] args) {
        /*
            
            与：
            boolean ret = boolean表达式 与 boolean表达式
                当两个boolean表达式都为true，结果才是true，其他情况ret为false
            &：位与
            &&：短路与

            & 和 && 的区别：
            &：如果A表达式为false，也会判断B表达式，再返回false
            &&：如果A表达式false，则不再判断B表达式，直接返回false

            效率：短路与效率高；


            或：
            boolean ret = boolean表达式 与 boolean表达式
            当两个boolean表达式都为false，结果才是false，
            只要A表达式为true，或者B表达式为true，ret都是true
            |:
                即使A表达式为true，也会执行B表达式，无论B表达式结果为什么，都返回true
            ||:短路或
                只要A表达式为true，立刻返回true，不再执行B表达式
            效率：短路或效率高；

            异或：
            ^: 判断A和B是否不同，不同则为true，相同则为false

            取反：
            !: !true结果是false，!false结果为true。

         */
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & true); // false
        System.out.println(false & false); // false
        System.out.println("----------------- && ------------------");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println("-----------------------------------");
        // System.out.println(false & (1 / 0 == 1)); // ArithmeticException: / by zero，有错误，证明(1 / 0 == 1) 有执行
        System.out.println(false && (1 / 0 == 1)); // 没有错误，证明(1 / 0 == 1) 没有执行
        System.out.println("--------------- | --------------------");
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | true); // true
        System.out.println(false | false); // false
        System.out.println("---------------- || -------------------");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
        System.out.println("-----------------------------------");
        System.out.println(true || (1 / 0 == 1)); // 没有错误，证明(1 / 0 == 1) 没有执行
        System.out.println("---------------- ^ -------------------");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false
        System.out.println("--------------------- ! --------------");
        System.out.println(!true); //  false
        System.out.println(!false); // true
        System.out.println(!!false); // false

    }
}