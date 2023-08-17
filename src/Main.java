import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я могу вычислить сумму целых чисел выбери что ты хочешь найти" +
                "\n1) произведение всех целых чисел от 8 до 15;\n" +
                "2) произведение всех целых чисел от a до 20 (значение a вводится с клавиатуры; 1<=a<=20);\n" +
                "3) произведение всех целых чисел от 1 до b (значение b вводится с клавиатуры; 1<=b<=20);\n" +
                "4) произведение всех целых чисел от a до b (значения a и b вводятся\n" +
                "с клавиатуры; b>=a).\n");
        int operation;
        operation = scanner.nextInt();
        if (operation==1) {
            int number = 8;
            int count = 7;
            int sum = 0;
            while (count <= 15) {
                number++;
                count++;
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            System.out.println("Результат сложения целых чисел:" + sum);
        } else if (operation == 2) {
            System.out.println("Введи знаниче а");
            int number;
            number = scanner.nextInt();
            int count = number;
            int sum = 0;
            while (count <= 20) {
                number++;
                count++;
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            System.out.println("Результат сложения целых чисел" + sum);
        } else if (operation == 3) {
            System.out.println("Введи число b оно должно быть меньше 20");
            int count = 1;
            int number;
            number = scanner.nextInt();
            int sum = 0;
            if (number <= 20){
                while (count <= number) {
                    count++;
                    if (count % 2 == 0) {
                        sum += count;
                    }
                }
                System.out.println("Сумма целых чисел:" + sum);
            } else {
                System.out.println("Значение b должно быть меньше 20");
            }

        } else if (operation == 4) {
            System.out.println("Введи значение а");
            int a;
            int b;
            int count;
            int sum = 0;
            a = scanner.nextInt();
            System.out.println("Введи значение b");
            b = scanner.nextInt();
            count = a;
            if (a<=b) {
                while (count<=b) {
                    count++;
                    a++;
                    if (count % 2 == 0) {
                        sum += a;
                    }
                }
                System.out.println("Сумма целых чисел равна:" + sum);
            } else {
                System.out.println("а должно быть меньше b");
            }
        } else {
            System.out.println("Можно вводить цифры только до 4");
        }
    }
}