package chap01;

public class practice15 {

    //n단의 피라미드를 출력하는 메서드를 작성하세요.
    static void triangleLU(int n){

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (i-1)*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangleLU(5);
    }
}
