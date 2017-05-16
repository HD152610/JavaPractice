/**
 * 
 */
package org.dimigo.inheritance;

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
		for(int i = 0; i < 2; i++){
			System.out.println(phones[i]);
			phones[i].turnOn();
			phones[i].pay();
			phones[i].useSpecialFunction(phones[i]);
			phones[i].turnOff();
			
		}

	}

}
