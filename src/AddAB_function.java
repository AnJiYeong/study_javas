import java.util.Scanner;

// 문제 파악

// 유추 파악

// 주요 단어 영문 이름 선정

// 테스트 케이스

// 프로그래밍 순서

// try-on
// 실패 시 원인 기록

public class AddAB_function {
    // 두 정수 합 구함
    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        /*
        - 테스트 케이스
        3 + 5 = 8
        20 + 50 = 70
        -1 + 5 = error
        */
        // - 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();

        // 처리
        AddAB_function main = new AddAB_function();
        int output_plus = main.plus(input_first, input_second);

        // 출력
        System.out.println(output_plus);
    }
}
