package chap01;

public class practice14_2 {

    //왼쪽 위가 직각인 이등변삼각형
    static void triangleLU(int n){

        for (int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangleLU(5);
    }
}
