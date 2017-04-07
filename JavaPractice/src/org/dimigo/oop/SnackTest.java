/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum_price = 0;
		Snack[] snack = null;
		snack = new Snack[3];
		snack[0] = new Snack("새우깡", "농심", 1100, 2);
		snack[1] = new Snack("콘칲", "크라운", 1200, 1);
		snack[2] = new Snack("허니버터칩", "해태", 1500, 4);
		for(int i = 0; i < 3; i++)
		{
			System.out.println(snack[i]);
		}
		for(int i = 0; i < 3; i++)
		{
			sum_price += snack[i].calcPrice();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d",sum_price) + "원");
	}

}
