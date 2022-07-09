package do_it_prac.chap_01;
import java.util.Scanner;

/*
1부터 n까지의 정수 합을 가우스의 덧셈이라는 방법을 이용하여 구하라.
(이는 반복문을 이용한 방법과는 차이가 있다)
*/

public class SumGauss_01_08 {

    static int gauseSum(int num) {
        return (num+1)*(num/2)+(num%2==0?0:(num+1)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 n을 입력: ");
        int n = sc.nextInt();

        System.out.println("1부터 n까지의 합: "+gauseSum(n));
    }
}
