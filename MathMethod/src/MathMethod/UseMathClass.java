package MathMethod;

import java.util.Scanner;

public class UseMathClass {

	public static void main(String[] args) {
		// 使用Math类计算次方 Math.pow(a, b) a表示基数 b表示指数
		int a;
		a = (int) Math.pow(8, 2);
		System.out.println(a);

		// 使用Math类计算平方根 Math.sqrt(a)
		double b;
		b = Math.sqrt(88);
		System.out.println(b);

		// 使用Math类对小数进行四舍五入并且保留一位小数 Math.round(a)
		double c;
		c = Math.round(b);
		System.out.println(c);
	}

}
