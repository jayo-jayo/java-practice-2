package org.example;

import java.util.*;


public class Main {
    static void main() {
        massiv();
//        guess_number();
    }

    public static void massiv() {
        int[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println("Все элементы: ");
        System.out.println(Arrays.toString(numbers1));

        System.out.println("1 -- Добавить элемент");
        System.out.println("2 -- Удалить элемент");
        System.out.print("Выберите пункт: ");

        Scanner point = new Scanner(System.in);
        int user_choice = point.nextInt();

        if (user_choice == 1) {
            System.out.print("Введите число которое хотите добавить: ");

            try {
                Scanner number = new Scanner(System.in);
                int user_number = number.nextInt();
                int[] numbers2 = new int[numbers1.length + 1];

                System.arraycopy(numbers1, 0, numbers2, 0, numbers1.length);
                numbers2[numbers2.length - 1] = user_number;
                System.out.println(Arrays.toString(numbers2));

            } catch (InputMismatchException e) {
                System.out.println("Ошибка, Вы ввели не целое число");
                return;
            }

        } else if (user_choice == 2) {
            System.out.print("Введите индекс элемента (от 0 до " + (numbers1.length - 1) + "): ");

            try {

                Scanner index = new Scanner(System.in);
                int user_index = index.nextInt();
                if (user_index > 0 && user_index <= numbers1.length - 1) {
                    int[] numbers3 = new int[numbers1.length - 1];

                    System.arraycopy(numbers1, 0, numbers3, 0, user_index);
                    System.arraycopy(numbers1, user_index + 1, numbers3, user_index, numbers1.length - user_index - 1);
                    System.out.println(Arrays.toString(numbers3));
                } else {
                    System.out.println("Ошибка, Вы ввели индекс которого нет в массиве");
                }
            } catch(InputMismatchException e) {
                System.out.println("Ошибка, Вы ввели не целое число");
                return;}

        }else {
                System.out.println("Ошибка ввода, Введите 1 или 2");
                return;
            }
        }

        public static void guess_number(){
            Random random = new Random();


            int number_computer = random.nextInt(1, 100);

            System.out.println("Компьютер загадал число, Попробуйте отгадать");
            System.out.println("Число от 1 до 100 ");
            int count = 0;

            while (count < 10) {
                System.out.println("Ваше число: ");
                Scanner num = new Scanner(System.in);
                int number_user = num.nextInt();

                if (number_user < 1 || number_user > 100) {
                    System.out.println("Вы ввели число вне диапазона");
                    continue;

                } else if (number_user < number_computer) {
                    System.out.println("Мое число больше!");
                    count++;
                    continue;

                } else if (number_user > number_computer) {
                    System.out.println("Мое число меньше!");
                    count++;
                    continue;

                } else if (number_user == number_computer) {
                    System.out.println("Вы угадали число!");
                    System.out.println("За" + " " + count + " " + "Попыток");

                }
                break;
            }
                    System.out.println("У вас кончились попытки");
                    System.out.println("Загаданное число было" + " " + number_computer);
                    }
            }


