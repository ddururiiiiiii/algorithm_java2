package chap01;

public class practice08 {

    //정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하시오.
    static int sumOf(int a, int b){
        int min;
        int max;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        int sum = 0;
        for (int i = min; i <= max; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
    public static void main(String[] args) {
        sumOf(1,5);
    }
}
