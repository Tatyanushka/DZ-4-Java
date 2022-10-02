import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> age = new ArrayList<>();
        LinkedList<Integer> id = new LinkedList<>();
        ArrayList<String> name = new ArrayList<>();
    
        // int numm = scanner.nextInt();
        // String str = scanner.nextLine();
        boolean run = true;

        int count = 0;
        while (run) {
            System.out.println("Введите имя");
            name.add(scanner.nextLine());

            System.out.println("Введите возраст");
            age.add(scanner.nextInt());
            id.add(count);
            count++;
            System.out.println("Хотим ли мы продолжить??");
            scanner.nextLine();
            if (scanner.nextLine().toLowerCase().equals("n")) {
                run = false;
            }
        }

        for (int index = 0; index < id.size(); index++) 
        {
            System.out.println(id.get(index) + " " + name.get(id.get(index)) + ", " + age.get(id.get(index)));  
        }
    

        System.out.println("Сортируем по возрасту (возрастание): ");
        for (int index = 0; index < id.size(); index++) {
            Collections.sort(age);
            System.out.println(id.get(index) + " " + name.get(id.get(index)) + ", " + age.get(id.get(index)));
        }
    }
}

