package com.company;

public class Main {

    public static void main(String[] args) {

        String names[] = new String[]{"Абай", "Бакай", "Таалай"};
        for (String name : names) {
            switch (name) {
                case "Абай":
                    System.out.println("Доброе утро!" + " " + name);
                    break;
                    case "Бакай":
                    System.out.println("Добрый день!" + " " + name);
                    break;
                    case "Таалай":
                    System.out.println("Доброе вечер!" + " " + name);
                    break;

            }
        }


    }
}
