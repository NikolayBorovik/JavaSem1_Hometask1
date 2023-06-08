package Java_Seminar1.JavaSem1HomeTasks;

import java.util.Scanner;

public class JavaSem1_Hometask1 {
    public static void main(String[] args) {
//         Задание

                                    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
                                    // (произведение чисел от 1 до n)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int n = sc.nextInt();
        // int result = 0;
        // for (int i = 1; i < n+1; i++) {
        //     result = i * (i+1);
        // }
        // System.out.println(result);
                                    // 2) Вывести все простые числа от 1 до 1000
        // int result = 0;
        // for (int j = 1001; j > 1; j--) {
        //     for (int i = j-1; i > 1; i--) {
        //         if (j%i != 0) {
        //             result = j;
        //         }
        //         else {
        //             result = 0;
        //             break;
        //         }
        //     }
        //     if (result != 0) System.out.printf("%d ", result);
        // } 

                                    // 3) Реализовать простой калькулятор (+-/*)
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        var num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your 2nd number: ");
        var num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a type of operation: ");
        char operation = sc.next().charAt(0);
       
        int result = 0;
        if (operation == '*'){
            result = num1*num2;
            System.out.println(result);
        }
        else if (operation == '/'){
            result = num1/num2;
            System.out.println(result);
        } 
        else if (operation == '+'){
            result = num1+num2;
            System.out.println(result);
        }
        else if (operation == '-'){
            result = num1-num2;
            System.out.println(result);
        }
        else System.out.println("You have entered a wrong type of operation");

        sc.close();

        // 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть 
        // заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
        // Предложить хотя бы одно решение или сообщить, что его нет.
        // Под знаком вопроса - всегда одинаковая ЦИФРА.
        // Введите уравнение: ?? + ?? = 44
        // Решение: 22 + 22 = 44
    }
}
