package day1;

/**
 * @author Administrator
 */
public class Day1_1 {
    public static void main(String[] args) {

        sxh();
        day();

    }

    public static void arrs(){

    }

    public static void sxh(){
        for (int i = 100; i < 1000; i++) {
            //2.调用自定义方法判断是不是水仙花数
            if(isAim(i)) {
                //3.如果是水仙花数，就打印
                System.out.println(i);
            }
        }
    }

    public static void day(){
        String name = "hello";
        int age = 18;
        char six = '男';
    }
    public static boolean isAim(int a) {
        int x = a/100;
        int y = a/10%10;
        int z = a%10;
        if(a == x*x*x+y*y*y+z*z*z) {
            return true;
        }
        return false;
    }

}
