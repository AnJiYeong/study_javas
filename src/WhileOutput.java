import java.util.Scanner;

public class Main {
    /*
     1. 문제 파악
        두 정수 A와 B를 입력받은 다음, A+B를 출력
        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        각 테스트 케이스는 세로 한 줄로 이루어져 있으며, 
        각 세로 줄에 A와 B가 주어진다. (0 < A, B < 10)

     2. 유추 파악
        주어진 테스트 케이스 개수만큼 두 정수를 입력받고(반복발생) 합을 구하여 출력
    
     3. 주요 단어 영문 이름 선정
        입력 input
        출력 output
        정수 decimal
        합 plus
        테스트 케이스 test Case
     */
    public static void main(String[] args) {
        /*
        4. 테스트 케이스
        5
        1 1 = 2
        2 3 = 5
        3 4 = 7
        9 8 = 17
        5 2 = 7
        */
        
        // 5. 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_testCase = scanner.nextInt();
        while (input_testCase > 0) {
            int input_first = scanner.nextInt();
            int input_second = scanner.nextInt();
            // 처리
            int output_plus = input_first + input_second;
            // 출력
            System.out.println(output_plus);
            input_testCase -= 1;
        }
        scanner.close();
    }
}