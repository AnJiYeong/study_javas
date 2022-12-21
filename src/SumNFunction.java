/*
1. 문제 파악
    정수 n개가 주어졌을 때, n개의 합을 구하는 함수 작성
    long sum(int[] a)

2. 유추 파악
    정수 n개의 합을 구하는 함수만! 작성하기

3. 주요 단어 영문 이름 선정
    정수 num
    합 sum
    함수 function
*/
// 4. 프로그래밍
public class SumNFunction {
    public long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
