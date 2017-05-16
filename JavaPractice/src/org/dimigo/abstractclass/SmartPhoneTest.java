/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		for(SmartPhone a : phones){
			System.out.println(a);
			a.turnOn();
			a.pay();
			a.useSpecialFunction();
			a.turnOff();
			
		}

	}

}
