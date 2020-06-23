
// 指定规范
interface IUSB {
    void swapData();
}

// 鼠标
class Mouse implements IUSB {
    public void swapData() {
        System.out.println("鼠标在移动");
    }
}

// 打印机
class Print implements IUSB {
    public void swapData() {
        System.out.println("打印，嘟嘟嘟……");
    }
}

// 主板
class MotherBord {
    private static IUSB[] usbs = new IUSB[6];
    private static int index = 0;
    public static void pluginIn(IUSB usb) {
        if (index == usbs.length) {
            System.out.println("插槽已经插满了！");
            return;
        }
        System.out.println("安装USB设备！");
        usbs[index] = usb;
        index++;
    }
    // 取出主板中每一个USB设备
    public static void doWork() {
        for (IUSB usb : usbs) {
            if (usb != null) {
                usb.swapData();
            }
            
        }
    }
}

// 键盘
class KeyBoard implements IUSB {
    public void swapData() {
        System.out.println("键盘在输入");
    }
}

// 匿名内部类
class AnonymousDemo {
    public static void main(String[] args) {
        // 安装鼠标
        MotherBord.pluginIn(new Mouse());
        // 安装打印机
        MotherBord.pluginIn(new Print());
        // 安装键盘
        // 创建一个IUSB的匿名实现类对象
        MotherBord.pluginIn(new IUSB() {
            // 匿名内部类
            public void swapData() {
                System.out.println("键盘在哪里");
            }
        });
        MotherBord.doWork();
    }
}