package ru.mirea.fedina;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер первого массива: ");
            int size1 = scanner.nextInt();
            int[] a1 = new int[size1];

            System.out.print("Введите размер второго массива: ");
            int size2 = scanner.nextInt();
            int[] a2 = new int[size2];

            System.out.println();

            Random random = new Random();

            for (int i = 0; i < size1; i++) {
                a1[i] = random.nextInt(100);
            }

            for (int i = 0; i < size2; i++) {
                a2[i] = random.nextInt(100);
            }

            System.out.println(Arrays.toString(a1));
            System.out.println(Arrays.toString(a2));
            System.out.println();


            boolean found = false;
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size2; j++) {
                    if (a1[i] == a2[j]) {
                        System.out.println("Общие элементы:");
                        System.out.print(a1[i] + " ");
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Общих элементов нет");
            }
            System.out.println();
        }
}
