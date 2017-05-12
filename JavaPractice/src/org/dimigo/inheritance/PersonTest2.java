/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigi.inheritance
 *   |_ PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class PersonTest2 {

	
	public static void main(String[] args) {
		Person[] people = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(int i = 0; i < 4; i++)
		{
			greeting(people[i]);
		}
		
		
	}
	
	public static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
	

}
