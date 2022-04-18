import java.util.Scanner;

class WelcomeToAtCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int a = sc.nextInt();
        // スペース区切り整数の入力
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 文字列の入力
        String s = sc.next();
        // 出力
        System.out.println((a + b + c) + " " + s);
    }
}