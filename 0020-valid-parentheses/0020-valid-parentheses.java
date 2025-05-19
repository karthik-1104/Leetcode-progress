class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        char s,top;
        for(int i=0;i<str.length();i++){
        s=str.charAt(i);

        if(s=='(' || s=='[' || s=='{'){
            stack.push(s);
        }

        else if(s==')' || s==']' || s=='}'){
            if(stack.isEmpty()){
                return false;
            }
            top=stack.pop();
            if(s==')'&&top!='(' || s==']'&& top!='[' || s=='}'&&top!='{'){
                return false;
            }
        }

    }

    if(!stack.isEmpty()){
        return false;
    }
    
    return true;
    }

    
}