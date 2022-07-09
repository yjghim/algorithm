package do_it_prac.chap_01;
import java.util.Scanner;

/*
직각 이등변 삼각형을 출력하는 메서드를 각각 작성하라.
(왼쪽 아래가 직각, 왼쪽 위가 직각, 오른쪽 아래가 직각, 오른쪽 위가 직각)
*/

public class Triangle_15 {

    static void triangleLB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print("@");
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i=n; i>0; i--) {
            for(int j=1; j<=i; j++)
                System.out.print("@");
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<(n-i); j++)
                System.out.print(" ");
            for(int j=0; j<i; j++)
                System.out.print("@");
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++)
                System.out.print(" ");
            for(int j=0; j<(n-i); j++)
                System.out.print("@");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단 삼각형을 원하세요? ");
            n = sc.nextInt();
        } while(n<=0);

        System.out.println("어느 쪽을 직각으로 만들까요?");
        System.out.println("---------------------------------");
        System.out.println("1번: 왼쪽 아래, 2번: 왼쪽 위");
        System.out.println("3번: 오른쪽 아래, 4번: 오른쪽 위");
        System.out.println("---------------------------------");
        System.out.print("해당하는 숫자를 입력하세요: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                triangleLB(n);
                break;
            case 2:
                triangleLU(n);
                break;
            case 3:
                triangleRB(n);
                break;
            case 4:
                triangleRU(n);
                break;
        }
    }
}
