import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList();
        studentList.add("Angelina");
        studentList.add("Lurda");
        studentList.add("Dovydas");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("Studentų Sąrašas:");
            System.out.println("1. įvesti vardą");
            System.out.println("2. atvaizduoti vardą");
            System.out.println("3. redaguoti vardą");
            System.out.println("4. trinti vardą");
            System.out.println("5. išeiti iš programos");
            System.out.println("----------------------------");
            System.out.println();

            int name = sc.nextInt();
            sc.nextLine();
            switch (name) {
                case 1:
                    System.out.println("Įveskite vardą");
                    String input = sc.nextLine();
                    if (studentList.contains(input)) {
                        System.out.println("Toks vardas jau yra");
                    } else studentList.add(input);
                    break;
                case 2:
                    System.out.println("Studentai:");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Įveskite vardą, kurį norite redaguoti");
                    String oldName = sc.nextLine();
                    if (studentList.contains(oldName)) {
                        System.out.println("Įveskite naują vardą");
                        String newName = sc.nextLine();
                        int index = studentList.indexOf(oldName);
                        studentList.set(index, newName);
                        System.out.println("Vardas pakeistas iš " + oldName + " į " + newName);
                    } else {
                        System.out.println("Tokio vardo nėra");
                    }
                    break;
                case 4:
                    System.out.println("Įveskite vardą, kurį norite ištrinti");
                    String wrongName = sc.nextLine();
                    if (studentList.contains(wrongName)) {
                        studentList.remove(wrongName);
                        System.out.println("Vardas ištrintas");
                    } else {
                        System.out.println("Tokio vardo nėra");
                    }
                    break;
                case 5:
                    System.exit(1);
            }

        }


//        PABAIGA

    }


}