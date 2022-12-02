import java.util.Scanner;

// baekjoon_8393_analysis.txt
public class For_n_function {
    // - 테스트 케이스
    // 3 --> 6
    // 5 --> 15
    // 1 --> 1
    public int sum(int input) {
        int sum = 0;
        for(int i=1; i<=input; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // 반복값 입력
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        // 합 구함
        For_n_function main = new For_n_function();
        int output = main.sum(input);

        // 합한 값 출력
        System.out.println(output);
    }
}
