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
            infomesages();
            int name = intInput(sc);
            sc.nextLine();
            switch (name) {
                case 1:
                    newStudent(studentList, sc);
                    break;
                case 2:
                    existingStudents(studentList);
                    break;
                case 3:
                    editStudent(studentList);
                    break;
                case 4:
                    removeStudent(studentList);
                    break;
                case 5:
                    System.exit(1);
            }

        }

    }

    public static int intInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Pasirinkite komandą iš norodytų auksščiau ir įveskite jos skaitmenį");
                sc.nextLine();
            }
        }
    }

    public static void existingStudents(ArrayList<String> studentList) {
        System.out.println("Studentai:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    public static void newStudent(ArrayList<String> studentList, Scanner sc) {
        System.out.println("Įveskite vardą");
        String input = sc.nextLine();
        if (studentList.contains(input)) {
            System.out.println("Toks vardas jau yra");
        } else studentList.add(input);
    }

    public static void editStudent(ArrayList<String> studentList) {
        Scanner sc = new Scanner(System.in);
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
    }

    public static void removeStudent(ArrayList<String> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite vardą, kurį norite ištrinti");
        String wrongName = sc.nextLine();
        if (studentList.contains(wrongName)) {
            studentList.remove(wrongName);
            System.out.println("Vardas ištrintas");
        } else {
            System.out.println("Tokio vardo nėra");
        }
    }

    public static void infomesages() {
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
    }
}