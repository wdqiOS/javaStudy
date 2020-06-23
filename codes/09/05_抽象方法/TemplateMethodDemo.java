
/*
// String连接10000次
class StringOperator {
    public long doWork(){
        long begin = System.currentTimeMillis(); // 开始时间
        String str = "";
        for (int i = 0; i < 10000; i++) {
             str += i;
        }   
        long end = System.currentTimeMillis(); // 结束时间

        long time = end - begin; // 时间差
        return time;
    }
}

// int相加10000次
class IntOperator {
    public long doWork(){
        long begin = System.currentTimeMillis(); // 开始时间
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
             sum += 1;
        }   
        long end = System.currentTimeMillis(); // 结束时间

        long time = end - begin; // 时间差
        return time;
    }
}

*/

// 模板类
abstract class OperateTimeTemplate {
    final public long getTotalTime() { // 模板方法:总体算法的骨架，子类不能修改，可以用
        long begin = System.currentTimeMillis();
        // 具体操作（留给子类去完成）
        doWork();
        long end = System.currentTimeMillis();
        return end - begin;
    }

    // 具体操作，子类必须覆盖。抽象方法
    protected abstract void doWork();

}

class StringOperator extends OperateTimeTemplate {
    public void doWork(){
        String str = "";
        for (int i = 0; i < 10000; i++) {
             str += i;
        }   
    }
}

class IntOperator extends OperateTimeTemplate {
    public void doWork() {
         int sum = 0;
        for (int i = 0; i < 100000000; i++) {
             sum += 1;
        }  
    }
}



// 模板方法设计模式
class TemplateMethodDemo {
    public static void main(String[] args) {

        /*
        // 统计String连接10000次和int相加10000次的时间差
        long time = new StringOperator().doWork();
        System.out.println(time);

        System.out.println(new IntOperator().doWork());
        */
       System.out.println(new StringOperator().getTotalTime());
       System.out.println(new IntOperator().getTotalTime());

    }
}