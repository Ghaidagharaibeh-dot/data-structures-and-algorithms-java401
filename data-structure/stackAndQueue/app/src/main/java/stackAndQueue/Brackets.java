package stackAndQueue;

public class Brackets {

    public boolean validateBrackets(String brackets){
        Stack leftBracket=new Stack();


        for (int i=0;i<brackets.length();i++){

            if(brackets.charAt(i) == '{' || brackets.charAt(i) == '(' || brackets.charAt(i)== '['){
                leftBracket.push(brackets.charAt(i)+"");
            }
            else {
                if(brackets.charAt(i) == '}' && leftBracket.peek() == '{' + "" ||
                        brackets.charAt(i) == ']' && leftBracket.peek() == '['+ "" ||
                        brackets.charAt(i) == ')' && leftBracket.peek() == '(' + ""
                ) {
                    leftBracket.pop();
                }
                if(leftBracket.ifEmpty()){
                    return false;
                }
            }
        }

        return leftBracket.ifEmpty();
    }
}
