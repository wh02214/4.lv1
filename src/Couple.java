import java.util.Scanner;

class Couple implements Calculate {
    private String name = "cp";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.println("Hello I am " + name);
        System.out.println("Function list:");
        System.out.println("1:计数累加。");
        System.out.println("2:计算阶层。");
        System.out.println("3:计算斐波那契数列第n项。");

        System.out.println("please tell me what do you want to do?");
    }

    @Override
    public void count() {
        System.out.println("开始累加计数：(结束请输入0)");                  //累加计数
        System.out.println("请输入一个数：");
        int sum = 0;
        int a;

        do {
            Scanner se1 = new Scanner(System.in);
            a = se1.nextInt();
            sum += a;
            System.out.println("sum=" + sum);
            System.out.println("请继续");
        } while (a != 0);
        System.out.println("sum=" + sum);

    }

    @Override
    public void str() {                                             //计算阶层
        System.out.println("开始计算阶层：");
        System.out.println("请输入你想计算的阶层：");
        Scanner se2 = new Scanner(System.in);
        int b = se2.nextInt();
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= i;
        }
        System.out.println(b + "的阶层为 " + result);
    }

    @Override
    public int fb(int n) {                                        //斐波那契数列
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fb(n - 1) + fb(n - 2);
        }
    }
}
