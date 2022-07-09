package do_it_prac.chap_01;
import java.util.Scanner;

/*
n단의 피라미드를 출력하는 메서드를 작성하라.
*/

public class NumPyramid_17 {

    static void drawPyramid(int n) {
        int bottom = (n-1)*2+1;
        int block = 1;
        int space = (bottom-block)/2;

        for(int i=0; i<n; i++) {
            for(int j=0; j<space; j++)
                System.out.print(" ");
            for(int j=0; j<block; j++)
                System.out.print(i+1);
            System.out.println();
            block += 2;
            space--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단의 피라미드를 원하세요? ");
            n = sc.nextInt();
        } while(n<=0);

        drawPyramid(n);
    }
}
