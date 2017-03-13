/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long salary = 1700000L;
		int staff = 3;
		int chain = 1500;
		long sum = salary * staff * chain * 12;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여:" + String.format("%,d원", salary));
		System.out.println("점포 내 직원 수:" + String.format("%,d",staff) + "명");
		System.out.println("점포 수:" + String.format("%,d", chain) + "개\n\n");
		System.out.println("연간 인건비:" + String.format("%,d", sum) + "원");
		
		
		

	}

}
