// 입력한 정수의 부호를 판정
import java.util.Scanner;

public class Test09 {
    //--- n의 부호 판정 ---//
    static  int sign0f(int n) {
        int sign = 0;

        if (n > 0)
            sign = 1;
        else if (n < 0)
            sign = -1;

        return sign;   // sign 값 반환
        }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x:");
        int x = stdIn.nextInt();

        int s = sign0f(x);
        System.out.println("sing0f(x)는 " +s + "입니다.");
    }
}
