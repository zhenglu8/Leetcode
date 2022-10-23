

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses_20 {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        System.out.println(checkBalance(string));
    }

    public static boolean checkBalance(String string){

        char [] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean result = false;

        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '['){
                stack.push(charArray[i]);
            }
            else{
                if (charArray[i] == ')' && !stack.empty()){
                    if (stack.peek() != '('){
                        result = false;
                        break;
                    }
                    else{
                        stack.pop();
                        result = true;
                    }
                }

                else if (charArray[i] == '}' && !stack.empty()){
                    if (stack.peek() != '{'){
                        result = false;
                        break;
                    }
                    else{
                        stack.pop();
                        result = true;
                    }
                }

                else if (charArray[i] == ']' && !stack.empty()){
                    if (stack.peek() != '['){
                        result = false;
                        break;
                    }
                    else{
                        stack.pop();
                        result = true;
                    }
                }

                else {
                    result = false;
                    break;
                }
            }

        }

        if(!stack.empty()){
            result = false;
        }

        return result;
    }
}
