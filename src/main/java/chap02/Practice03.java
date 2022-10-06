package chap02;

public class Practice03 {

    //배열의 모든 요소 합계 구하기
    static int sumOf(int[] a ){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println("배열의 합은 " + sum + " 입니다.");
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        sumOf(a);
    }
}
