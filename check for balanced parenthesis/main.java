import java.util.*;

class Main {

    public static boolean isBalanceString(String s ) throws EmptyStackException
    {
        Stack<Character> stack  = new Stack<>();
        char [ ] inputCharArray= s.toCharArray();
        try {
             for(char c : inputCharArray)
            {
                if(c =='(' || c =='{' || c =='[')
                {
                    stack.push(c);

                }else if( stack.isEmpty() == false || c == stack.peek() )
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }catch(Exception e) {
            return false;
        }
       
        return stack.isEmpty() ? true : false;
    }
    public  static void main(String args[]) {

        
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        String [] inputs =  new String[testCases];
        for(int i = 0 ; i < testCases ; i++)
        {
           inputs[i] =scan.nextLine();
        }
        for(int i = 0 ; i < testCases ; i++)
        {
           System.out.println(isBalanceString(inputs[i]));
        }
    }

}

// testCase
/*
10
{{}([])}
[[]][{]()
[][]]]
[]{}
{}
()
(((((((())))))))
{}{}{}{}{(((({{{{{{[[[[[[]]]]]]}}}}}}))))}
{{{{[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}}}}
{}
*/