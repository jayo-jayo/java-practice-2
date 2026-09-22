package org.example;

import java.util.*;


public class Main {
    static void main() {
//        massiv();
        guess_number();
    }

    public static void massiv() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Все элементы: ");
        System.out.println(numbers);

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
                numbers.add(user_number);
                System.out.println(numbers);

            } catch (InputMismatchException e) {
                System.out.println("Ошибка, Вы ввели не целое число");
                return;
            }

        } else if (user_choice == 2) {
            System.out.print("Введите индекс элемента (от 0 до " + (numbers.size() - 1) + "): ");




            try {

                Scanner index = new Scanner(System.in);
                int user_index = index.nextInt();
                if (user_index > 0 && user_index <= numbers.size() - 1) {
                    numbers.remove(user_index);
                    System.out.println(numbers);
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
                    count++;
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


