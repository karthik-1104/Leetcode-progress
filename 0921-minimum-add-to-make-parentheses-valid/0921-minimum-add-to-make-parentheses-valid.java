class Solution {
    public int minAddToMakeValid(String s) {
         Stack<Character> stack = new Stack<>();

        int min= 0;

       
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } 
            else{
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                }
                else if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            
    }
        return stack.size();
    }
    
}