package chap01;

public class practice07 {
    //가우스의 덧셈
    // ex. 1~10의 합 : (1 + 10) * 5

    static int sumOf(int a){

        int sum = 0;
        sum = (1 + a) * 5;
        sum = (a + 1) * (a / 2) + (a % 2 == 1 ? (a + 1) / 2 : 0);   // 총합

        System.out.println("1부터" + a + "의 정수의 합은 " + sum + " 입니다.");
        return sum;
    }

    public static void main(String[] args) {
        sumOf(5);
    }
}
