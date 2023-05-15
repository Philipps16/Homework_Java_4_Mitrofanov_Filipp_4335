package Homework_Java_4_Mitrofanov_Filipp_4335;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {

        Queue<Integer> list1 = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            list1.add(rd.nextInt(10));
        }
        System.out.println(list1);
        Scanner iScanner = new Scanner(System.in);
        System.out.println("какое число поставить в конец очереди? ");
        int num = iScanner.nextInt();
        list1.add(num);
        System.out.println(list1);
        iScanner.close();

        

        int frontdelete = list1.remove();
        System.out.println("Удаленный элемент: " + frontdelete);
        System.out.println("Оставшийся список: ");
        System.out.println(list1);
        System.out.println();

        int front = list1.peek();
        System.out.println("Новый первый элемент: " + front);
        System.out.println("Последний список: ");
        System.out.println(list1);

    }
}
