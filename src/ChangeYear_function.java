/*
 1. 문제 파악
    불교 국가인 태국은 불기 연도를, 우리나라는 서기 연도를 사용한다.
    불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하여라.
    입력값은 (1000 ≤ y ≤ 3000)를 따른다.
    서기

 2. 유추 파악
    정수를 입력해 서기 연도로 변환하여 출력
    불기 연도에 -543년을 하면 서기 연도이다.

 3. 주요 단어 영문 이름 선정
    입력 input
    정수 decimal
    출력 output
    연도 year
    변환 change
 */
import java.util.Scanner;
public class ChangeYear_function {
    // 불기 연도를 서기 연도로 변환함. (입력된 정수 -543)
    public int change(int input_year) {
        int output_year = input_year - 543;
        return output_year;
    }
    public static void main(String[] args) {
        /*
         - 테스트 케이스
            2541 => 1998
         */
        // - 프로그래밍 순서
        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_year = scanner.nextInt();
        scanner.close();

        // 처리
        ChangeYear_function main = new ChangeYear_function();
        int output_year = main.change(input_year);

        // 출력 
        System.out.println(output_year);
    }
    
}
