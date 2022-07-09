package do_it_prac.chap_01;
import java.util.Scanner;

/*
정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하라.
(단, a와 b의 대소 관계에 상관없이 합을 구하라)
*/

public class SumOf_09 {

    static int sumOf(int a, int b) {
        int sum = 0;
        int min, max;

        if(a>=b) {
            min = b;
            max = a;
        }
        else {
            min = a;
            max = b;
        }

        for(int i=min; i<=max; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a을 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 b을 입력: ");
        int b = sc.nextInt();

        System.out.println(a+"부터 "+b+"까지의 합: "+sumOf(a, b));
    }
}
