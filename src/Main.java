import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Couple couple = new Couple();
        couple.introduce();
        int start = 0;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        //功能实现
        switch (start) {
            case 1:
                couple.count();            //计数累加
                break;
            case 2:
                couple.str();             //计算阶层
                break;
            case 3: {
                System.out.println("请输入斐波那契数列的项数");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                System.out.println("第" + n + "项为：" + couple.fb(n));
                break;
            }
            default:
                System.out.println("wrong input!");
        }

    }
}
