package MathMethod;

import java.util.Scanner;

public class UseMathClass {

	public static void main(String[] args) {
		// ʹ��Math�����η� Math.pow(a, b) a��ʾ���� b��ʾָ��
		int a;
		a = (int) Math.pow(8, 2);
		System.out.println(a);

		// ʹ��Math�����ƽ���� Math.sqrt(a)
		double b;
		b = Math.sqrt(88);
		System.out.println(b);

		// ʹ��Math���С�������������벢�ұ���һλС�� Math.round(a)
		double c;
		c = Math.round(b);
		System.out.println(c);
	}

}
