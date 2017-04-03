/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"mc the max", "이케다 에라이자", "한국사"};
		for(int i = 0; i < 3; i++)
		{
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i]))
			{
				System.out.println("맞았습니다!");
			}
			else System.out.println("틀렸습니다!");
		}
		System.out.println("<< 결과출력 >>");
		StringBuilder asdf = new StringBuilder();
		for(int i = 0; i < 3; i++)
		{
			asdf.append(questions[i]).append(answers[i]).append("입니다.\n");
		}
		System.out.println(asdf);
	}

	
}
