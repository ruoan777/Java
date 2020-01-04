import java.util.HashMap;
import java.util.Scanner;
import java.math.*;
public class TestData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("第一题#############################");
        System.out.println("请输入圆的半径");
        double R = scanner.nextDouble();
        System.out.println("该圆的半径为：R=" + R);
        System.out.println("圆形的周长为：C=2*3.14*" + R + "=" + 3.14*2*R);
        System.out.println("圆形的面积为: S=3.14*" + R + "*" + R + "=" + 3.14*R*R);


        System.out.println("第二题#############################");
        System.out.println("本金：10000");
        double Money1 = 10000*(1+0.0035);
        System.out.println("活期一年本金总计：" + Math.round(Money1) );

        double Money2 = 10000*(1+0.0035*2);
        System.out.println("活期两年本金总计：" + Math.round(Money2) );

        double Money3 = 10000*(1+0.0150);
        System.out.println("定期一年本金总计：" + Math.round(Money3) );

        double Money4 = 10000*(1+0.0210*2);
        System.out.println("定期两年本金总计：" + Math.round(Money4) );

        System.out.println("第三题#############################");
        System.out.println("请输入一个四位的整数");
        int num = scanner.nextInt();
        int res = (num/1000+5)%10 + (num/100+5)%10*10 + (num/10+5)%10*100 + (num+5)%10*1000;
        System.out.println(res);
        //Map<String, String> map = new HashMap<String, String>();
    }
}
