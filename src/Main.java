import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Couple couple = new Couple();

        couple.introduce();
//        String menu = "累加，阶层，斐波那契数列";
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        int a = 0;
        if (start.contains("加")&&start.contains("累加")) {
            a = 1;
        } else if (start.contains("阶层")) {
            a = 2;
        } else if (start.contains("斐波")) {
            a = 3;
        }
                                                         //功能实现
        switch (a) {
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
