package week02.Parcer;

/**
 * Created by hamster on 17.05.2017.
 */
public class Parcer2 {
    public static void main(String[] args) {
//        System.out.println("Пример 123");
//        System.out.println("Результат: " + eval("123"));
//        System.out.println("-----------------------------------------");
//        System.out.println("Пример 2*3");
//        System.out.println("Результат: " + eval("2*3"));
//        System.out.println("-----------------------------------------");
//        System.out.println("Пример 2*(1+3)");
//        System.out.println("Результат: " + eval("2*(1+3)"));
//        System.out.println("-----------------------------------------");
//        System.out.println("Пример 1+(5-2*(13/6))");
//        System.out.println("Результат: " + eval("1+(5-2*(13/6))"));
//        System.out.println("-----------------------------------------");


//        System.out.println("Пример 123 = 123");
//        System.out.println("Результат: " + eval("123"));
//        System.out.println("-----------------------------------------");
//
//        System.out.println("Пример 2*3 = 6");
//        System.out.println("Результат: " + eval("2*3"));
//        System.out.println("-----------------------------------------");
//
//        System.out.println("Пример (1+3)*2 = 8");
//        System.out.println("Результат: " + eval("(1+3)*2"));
//        System.out.println("-----------------------------------------");

//        System.out.println("Пример ((13/6)*2 - 5) + 1 = 0");
//        System.out.println("Результат: " + eval("((13/6)*2 - 5) + 1"));
//        System.out.println("-----------------------------------------");

    }

//    public static int eval(String expr) {
//        return eval(expr, 0, expr.length());
//    }
//
//    private static int eval(String expr, int from, int to) {
//        System.out.println("Исходный to = " + to);
//        if (expr.charAt(from) == '(') {
//            int countLeftBracket = 1; //счётчик открывающих скобок
//            int countRigthBracket = 0;//счётчик закрывающих скобок
//            System.out.println("Нашёл открывающую скобку! Позиция: " + from);
//            int secondBracket = from + 1;
//            //в цикле определяем наши from и to для запуска рекурсии
//            //стоит условие на нахождение последней парной закрывающей скобки
//            while (countLeftBracket != countRigthBracket) {
//                if (expr.charAt(secondBracket) == '(') {
//                    countLeftBracket++;
//                } else if (expr.charAt(secondBracket) == ')') {
//                    countRigthBracket++;
//                }
//                secondBracket++;
//            }
//            System.out.println("Нашёл закрывающую скобку! Позиция: " + secondBracket);
//            int leftOperand = eval(expr, from + 1, secondBracket); //чёт не так
//            //вот как отсюда перейти на проверку на знак/число и присвоение правому операнду значения?
//            //также не будет работать если скобок нет - потому левый и правый операнд должны присваиваться не тут, а ниже
//        } else {
//            int pos = from;
//            System.out.println("pos = " + pos + " to = " + to);
//            while (pos < to) {
//                if (Character.isDigit(expr.charAt(pos))) {
//                    pos++;
//                    System.out.println("Нашёл цифру! Увеличил pos. Теперь он равен " + pos);
//                } else {
//                    int leftOperand = Integer.valueOf(expr.substring(from, pos)); //todo
//                    System.out.println("leftOperand = " + leftOperand);
//                    char operation = expr.charAt(pos);
//                    System.out.println("operation = " + operation);
//                    int rightOperand = eval(expr, pos + 1, to); //todo
//                    System.out.println("rightOperand = " + rightOperand);
//                    switch (operation) {
//                        case '+':
//                            return leftOperand + rightOperand;
//                        case '-':
//                            return leftOperand - rightOperand;
//                        case '*':
//                            return leftOperand * rightOperand;
//                        case '/':
//                            return leftOperand / rightOperand;
//                    }
//                }
//            }
//            return Integer.valueOf(expr.substring(from, to));
//        }
//    }
}
