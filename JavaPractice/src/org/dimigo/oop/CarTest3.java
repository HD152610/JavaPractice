/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class CarTest3 {

	public static void main(String[] args) {
		
		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명:" + car1.getCompany());
		System.out.println("모델명:" + car1.getModel());
		System.out.println("색상:" + car1.getColor());
		System.out.println("최대속도:" + car1.getMaxspeed() + "km");
		System.out.println("가격:" + String.format("%,d원", car1.getPrice()));
		System.out.printf("\n");
		
		
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		
		System.out.println("제조사명:" + car2.getCompany());
		System.out.println("모델명:" + car2.getModel());
		System.out.println("색상:" + car2.getColor());
		System.out.println("최대속도:" + car2.getMaxspeed() + "km");
		System.out.println("가격:" + String.format("%,d원", car2.getPrice()));
		System.out.printf("\n");
		
		
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("제조사명:" + car3.getCompany());
		System.out.println("모델명:" + car3.getModel());
		System.out.println("색상:" + car3.getColor());
		System.out.println("최대속도:" + car3.getMaxspeed() + "km");
		System.out.println("가격:" + String.format("%,d원", car3.getPrice()));
		
		

	}

}
