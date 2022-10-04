package chap01;

public class practice14_4 {

    //오른쪽 아래가 직각인 이등변삼각형
    static void triangleLU(int n){

        for (int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangleLU(5);
    }
}
