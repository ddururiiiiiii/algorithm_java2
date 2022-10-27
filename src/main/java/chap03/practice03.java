package chap03;// 연습3-1
// 선형검색(보초법 : for문을 사용하여 구현)

import java.util.Scanner;

class practice03 {

	static int seqSearchSen(int[] a, int n, int key) {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//요솟수 받음
		System.out.print("요솟수 : ");
		int yosoNum = scan.nextInt();

		//요솟수 크기의 배열을 만듦.
		int[] arr = new int[yosoNum];

		//배열에 하나씩 입력함.
		for(int i  = 0; i < arr.length; i++){
			System.out.println("arr[" + i + "] : ");
			arr[i] = scan.nextInt();
		}

		System.out.print("key : ");
		int key = scan.nextInt();

	}
}
