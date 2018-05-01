import java.util.Scanner;
import java.util.Stack;

public class Reversi {
	public static void main(String[] args){
		/* Testcase Input
		 * "   the sky is blue   "
		 * "   the sky     is blue"
		 * "the sky is blue"
		 * " the sky is   blue "
		 * 
		 * Testcase Output
		 * "blue is sky the"
		*/
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Stack stack = new Stack();
		
		for(int i=input.length()-1; i>=0; i--){
			char c = input.charAt(i);
			if(c!=' '){
				stack.push(c);
			}
			else{
				if(!stack.isEmpty()){
					while(!stack.isEmpty()){
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				}
			}
		}
		
		if(!stack.isEmpty()){
			while(!stack.isEmpty()){
				System.out.print(stack.pop());
			}
		}
	}
}
