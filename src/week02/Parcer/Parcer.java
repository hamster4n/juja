package week02.Parcer;

/**
 * Created by hamster on 19.05.2017.
 */
public class Parcer {
    public static void main(String[] args) {
//        System.out.println(eval("123"));
//        System.out.println(eval("2*3"));
//        System.out.println(eval("2*(1+3)"));
//        System.out.println(eval("1+(5-2*(13/6))"));


//        System.out.println("Пример 123 = 123");
//        System.out.println("Результат: " + eval("123"));
//        System.out.println("-----------------------------------------");

//        System.out.println("Пример 2*3 = 6");
//        System.out.println("Результат: " + eval("2*3"));
//        System.out.println("-----------------------------------------");

//        System.out.println("Пример (1+3)*2 = 8");
//        System.out.println("Результат: " + eval("(1+3)*2"));
//        System.out.println("-----------------------------------------");

        System.out.println("Пример ((13/6)*2-5)+1= 0");
        System.out.println("Результат: " + eval("((13/6)*2-5)+1"));
        System.out.println("-----------------------------------------");
    }

    public static int eval(String expr) {

        return eval(expr, expr.length() - 1, 0);
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(from) == ')') {
            return eval(expr, from - 1, to + 1); //для to ставить +1?
        } else {
            int pos = from;
            while (pos >= to) {
                if (Character.isDigit(expr.charAt(pos))) {
                    //System.out.println("Нашёл цифру на позиции " + pos + ". Это цифра " + expr.charAt(pos));
                    pos--;
                } else {
                    int pos2 = pos +1;
                    int from2 = from + 1;
                    //System.out.println("Хочу сбацать правый операнд с pos +1 /from +1 " + pos2 + " " + from2);
                    //System.out.println("При этом выражение expr.substring(pos + 1, from + 1) = " + expr.substring(pos + 1, from + 1));
                    int rightOperand = Integer.valueOf(expr.substring(pos + 1, from + 1));
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, pos - 1, to);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(to, from + 1));
        }
    }
}
