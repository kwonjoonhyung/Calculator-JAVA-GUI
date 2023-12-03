package util;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculate {

	public static String calculate(String expression) {
		try {

			// 중위 -> 후위

			Stack<String> postfix = new Stack<String>(); // 후위 표기를 담을 스택
			Stack<String> operator = new Stack<String>();

			String num = "0";

			for (int i = 0; i < expression.length(); i++) {
				char check = expression.charAt(i);

				if (check == 'x' || check == '/') {
					postfix.push(num);
					num = "";

					while (!operator.isEmpty() && (operator.peek().equals("x") || operator.peek().equals("/"))) {
						postfix.add(operator.pop());
					}

					operator.push(Character.toString(check));

				} else if (check == '+' || check == '-') {
					postfix.push(num);
					num = "";

					while (!operator.empty()) {
						postfix.push(operator.pop());
					}
					operator.push(Character.toString(check));

				} else {
					num += check;
				}
			}

			postfix.push(num);

			while (!operator.empty()) {
				postfix.push(operator.pop());
			}

			// 후위 -> 계산

			// Double 연산의 문제 > 정밀도 문제로 인한 무한 소수

			try {
				Stack<BigDecimal> result = new Stack<BigDecimal>(); // 최종 연산 결과가 담길 스택
				for (int i = 0; i < postfix.size(); i++) {
					if (postfix.elementAt(i).equals("x")) {
						BigDecimal num1 = result.pop();
						BigDecimal num2 = result.pop();
						result.push(num1.multiply(num2));

					} else if (postfix.elementAt(i).equals("-")) {
						BigDecimal num1 = result.pop();
						BigDecimal num2 = result.pop();
						result.push(num2.subtract(num1));

					} else if (postfix.elementAt(i).equals("/")) {
						BigDecimal num1 = result.pop();
						BigDecimal num2 = result.pop();
						result.push(num2.divide(num1));

					} else if (postfix.elementAt(i).equals("+")) {
						BigDecimal num1 = result.pop();
						BigDecimal num2 = result.pop();
						result.push(num1.add(num2));

					} else {
						result.push(new BigDecimal(postfix.elementAt(i)));
					}

				}
				return result.pop().toString();
			}

			// BigDecimal에서 무한 소수가 나오는 경우 예외가 발생하므로 Double로 연산

			catch (ArithmeticException e) {
				Stack<Double> result = new Stack<Double>(); // 최종 연산 결과가 담길 스택
				for (int i = 0; i < postfix.size(); i++) {
					if (postfix.elementAt(i).equals("x")) {
						Double num1 = result.pop();
						Double num2 = result.pop();
						result.push(num1 * num2);

					} else if (postfix.elementAt(i).equals("-")) {
						Double num1 = result.pop();
						Double num2 = result.pop();
						result.push(num2 - num1);

					} else if (postfix.elementAt(i).equals("/")) {
						Double num1 = result.pop();
						Double num2 = result.pop();
						result.push(num2 / num1);

					} else if (postfix.elementAt(i).equals("+")) {
						Double num1 = result.pop();
						Double num2 = result.pop();
						result.push(num1 + num2);

					} else {
						result.push(Double.parseDouble(postfix.elementAt(i)));
					}

				}
				return result.pop().toString();
			}

//			double intDoubleCheck = result.pop();
//			
//			if(intDoubleCheck==(int)intDoubleCheck) {
//				Integer integerResult = (int)intDoubleCheck;
//				return integerResult.toString();
//			}
//			else {
//				Double doubleResult = intDoubleCheck;
//				return doubleResult.toString();
//			}

		} catch (Exception e) {
			return "Error"; // 수식이 올바르지 않은 경우
		}
	}
}
