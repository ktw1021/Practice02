package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자1: "+num1);
		System.out.println("숫자를 입력해주세요.");
		int num2 = sc.nextInt();
		System.out.println("숫자2: "+num2);
		System.out.println("숫자를 입력해주세요.");
		int num3 = sc.nextInt();
		System.out.println("숫자3: "+num3);
		
		int few;
		
		if (num1<num2 && num1<num3) {
			few = num1;
		}
		else if (num2<num3) {
			few = num2;
		}
		else {
			few = num3;
		}
		System.out.println("가장 작은수는 " + few + " 입니다.");
		sc.close();
		}

}
