package do_it_prac.chap_01;
import java.util.Scanner;

/*
양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하라.
*/

public class DigitsNum_11 {

    static int digitNum(int num) {
        int digitNum = 0;

        while(true) {
            num /= 10;
            digitNum++;

            if(num==0)
                break;
        }

        return digitNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("정수 n을 입력: ");
            n = sc.nextInt();
        } while(n<=0);

        System.out.println(n+"은 "+digitNum(n)+"자리 입니다.");
    }
}
