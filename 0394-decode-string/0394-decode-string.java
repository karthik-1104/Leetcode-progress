class Solution {
    public String decodeString(String s) {
        String temp="",res="";
        int count=0;
        Stack<Character> characterStack=new Stack<>();
        Stack<Integer> integerStack=new Stack<>();
        for(int i=0;i<s.length();i++){

            count=0;
            if(Character.isDigit(s.charAt(i))){

                while(Character.isDigit(s.charAt(i))){
                    count=count*10+ s.charAt(i) - '0';
                    i++;
                }

                i--;
                integerStack.push(count);
            }

            else if(s.charAt(i)=='['){

                if(Character.isDigit(s.charAt(i-1))){
                    characterStack.push(s.charAt(i));
                }

                else{
                    characterStack.push(s.charAt(i));
                    integerStack.push(1);
                }
            }

            else if(s.charAt(i)==']'){
                temp="";
                count=0;
                if(!integerStack.isEmpty()){
                    count=integerStack.pop();
                }

                while(!characterStack.isEmpty() && characterStack.peek()!='['){
                    temp=characterStack.pop()+temp;
                }
                characterStack.pop();

                for(int k=0;k<count;k++){
                    res=res+temp;
                }
                System.out.println(res);
                for(int k=0;k<res.length();k++){
                    characterStack.push(res.charAt(k));
                }

                res="";
            }

            else{

                characterStack.push(s.charAt(i));
            }
        }

        while(!characterStack.isEmpty()){
            res=characterStack.pop()+res;
        }

        return res;
    }
}