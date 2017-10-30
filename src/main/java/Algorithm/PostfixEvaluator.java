package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {
	Stack<Integer> stack;
	private final static char  	ADD='+'; 
	private final static char 	SUBTRACT='-';
	private final static char	MULTIPLY='*';
	private final static char	DIVIDE='/';
	public PostfixEvaluator(){
		stack = new Stack<Integer>();
	}
	public  int evaluator(String expr) {
		Scanner exp = new Scanner(expr);
		String token;
		int op1,op2,result=0;
		while(exp.hasNext()){
			token=exp.next();
			if(isoperator(token)){
				op1 = (stack.pop()).intValue();
				op2 = (stack.pop()).intValue();
				result=evaluateSingleOperator(token.charAt(0), op1, op2);
				stack.push(new Integer(result));
			}else {
				stack.push(new Integer(Integer.parseInt(token)));
			}
		}
		return result;
		
	}
	public int evaluateSingleOperator(char operation, int op1,int op2) {
		int result=0;
		switch (operation) {
			case ADD:
				result=op1+op2;
				break;
			case SUBTRACT:
				result=op1-op2;
				break;
			case MULTIPLY:
				result=op1*op2;
				break;
			case DIVIDE:
				result=op1 / op2;
		}
		return result;
	}
	public  boolean isoperator(String token) {
		
		return (token.equals("+")||token.equals("-")||token.equals("*")
				||token.equals("/"));
	}
	
	
	public static void main(String[] args) {
		PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
		int tmp=postfixEvaluator.evaluator("2 5 * 6 + 100 *");
		System.out.println(tmp);
	}
}
