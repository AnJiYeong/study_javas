import java.util.Scanner;

/*
 1. 문제 파악
    발견한 흰색 피스의 개수가 주어졌을 때,
    몇 개를 더하거나 빼야 올바른 세트 개수가 되는지를 출력.
    첫째 줄에 발견한 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
    입력값은 (0 <= A <= 10)을 따른다.

 2. 유추 파악
    입력된 값에서 얼마를 더하거나 빼야 1 1 2 2 2 8 이 되는 지를 출력한다.

 3. 주요 단어 영어 선정
    입력 input
    출력 output
    조절 adjust
 */
public class Chess {
    public static void main(String[] args) {
        /*
         - 테스트 케이스
            0 1 2 2 2 7 -> 1 0 0 0 0 1
            2 1 2 1 2 1 -> -1 0 0 1 0 7
         */
        // 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_king = scanner.nextInt();
        int input_queen = scanner.nextInt();
        int input_rook = scanner.nextInt();
        int input_bishop = scanner.nextInt();
        int input_knight = scanner.nextInt();
        int input_pwun = scanner.nextInt();

        // 처리
         int output_king = 1 - input_king;
         int output_queen = 1 - input_queen;
         int output_rook = 2 - input_rook;
         int output_bishop = 2 - input_bishop;
         int output_knight = 2 - input_knight;
         int output_pwun = 8 - input_pwun;

        // 출력
        System.out.println(output_king);
        System.out.println(output_queen);
        System.out.println(output_rook);
        System.out.println(output_bishop);
        System.out.println(output_knight);
        System.out.println(output_pwun);
        
        scanner.close();
    }
}
