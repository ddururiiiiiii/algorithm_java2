package chap03;

import java.util.Scanner;

public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {


        int i = 0;

        a[n] = key; //보초를 추가

        while(true) {
            if (a[i] == key) //검색 성공.
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scan.nextInt();
        int[] x = new int[num + 1]; //요솟수가 num + 1 인 배열

        for(int i = 0; i < num; i++){
            System.out.println("x[" + i + "] : ");
            x[i] = scan.nextInt();
        }

        System.out.println("검색할 값 : "); //키 값을 입력 받음.
        int ky = scan.nextInt();

        int idx = seqSearchSen(x, num, ky); //배열 x에서 값이 Ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");



    }




}
