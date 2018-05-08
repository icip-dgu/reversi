import java.util.Scanner;
import java.util.Stack;

public class Reversi {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(reversi(input));
		

		/* Testcase Input
		 * "   the sky is blue   "
		 * "   the sky     is blue"
		 * "the sky is blue"
		 * " the sky is   blue "
		 * 
		 * Testcase Output
		 * "blue is sky the"
		*/

		String[] testInput = new String[5];
		String testOutput = "blue is sky the";
		testInput[0] = "   the sky is blue   ";
		testInput[1] = "the sky     is blue   ";
		testInput[2] = "   the sky   is blue";
		testInput[3] = "the sky is blue";
		testInput[4] = "   the      sky     is      blue   ";
		
		//Unit test
		for(int i=0; i<testInput.length; i++){
			if(!reversi(testInput[i]).equals(testOutput)){
				System.out.println("failed"+i);
				System.out.println(reversi(testInput[i]));
			}
		}
		
	}
	
	public static String reversi(String input){
		Stack stack = new Stack();
		String s = "";

		
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

						s+=stack.pop();
					}
					s+=" ";

						System.out.print(stack.pop());
					}
					System.out.print(" ");
				}
			}
		}
		
		if(!stack.isEmpty()){
			while(!stack.isEmpty()){
				s+=stack.pop();
			}
		}
		
		if(s.charAt(s.length()-1)==' '){
			s = s.substring(0, s.length()-1);
		}
		
		return s;
			}
		}
	}
}
