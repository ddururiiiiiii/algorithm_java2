package chap01;

public class practice14 {

    //왼쪽 아래가 직각인 이등변삼각형을 출력
    static void triangleLB(int n){

        for (int i = 1; i <= n;i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangleLB(5);
    }
}
