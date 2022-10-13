package chap02;
// 입력 받은 10진수를 2진수~36진수로 기수 변환하여 출력.
public class CardConv {

    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d){
        int digits = 0; //반환후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); //r을 나눈 나머지를 저장
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++){ //배열 d의 숫자 문자열을 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i -1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        char[] charArray = new char[36];
        cardConv(86, 2, charArray);
    }
}
