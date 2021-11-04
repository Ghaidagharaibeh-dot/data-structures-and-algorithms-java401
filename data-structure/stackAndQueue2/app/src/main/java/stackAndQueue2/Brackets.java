package stackAndQueue2;

public class Brackets {
    public boolean validateBrackets(String brackets) {
        Stack stack = new Stack();


        for (int i = 0; i < brackets.length(); i++) {

            if (brackets.charAt(i) == '{' || brackets.charAt(i) == '(' || brackets.charAt(i) == '[') {
                stack.push(brackets.charAt(i) + "");
            } else if (brackets.charAt(i) == '}' || brackets.charAt(i) == ')' || brackets.charAt(i) == ']') {
                String value = stack.peek();
                if (((brackets.charAt(i) + "").equals('}' + "") && value.equals('{' + "")
                        || (brackets.charAt(i) + "").equals(')' + "") && value.equals('(' + "")
                        || (brackets.charAt(i) + "").equals(']' + "") && value.equals('[' + "")) && !stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
