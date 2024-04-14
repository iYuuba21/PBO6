package Laptop;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void batas() {
        System.out.println("===========================================");
    }

    static void pilihLaptop() {
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.println("");
    }

    static void menuLaptop() {
        System.out.println("1. Input 'ON' untuk menyalakan laptop");
        System.out.println("2. Input 'OFF' untuk mematikan laptop");
        System.out.println("3. Input 'UP' untuk menambah volume");
        System.out.println("4. Input 'DOWN' untuk mengurangi volume");
    }

    public static void main(String[] args) {
        boolean bool = true;
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Laptop> laptop = new ArrayList<>();
            Lenovo lenovo = new Lenovo();
            Toshiba toshiba = new Toshiba();
            MacBook macbook = new MacBook();

            System.out.println("\n\tMerek Laptop");
            batas();
            pilihLaptop();
            System.out.print("Pilih jenis laptop : ");
            int noJenisLaptop = sc.nextInt();
            switch (noJenisLaptop) {
                case 1:
                    laptop.add(lenovo);
                    break;
                case 2:
                    laptop.add(toshiba);
                    break;
                case 3:
                    laptop.add(macbook);
            }

            while (bool) {
                System.out.println("\n\t    Menu");
                batas();
                menuLaptop();
                System.out.print("Input : ");
                String noMenu = sc.next();
                switch (noMenu) {
                    case "ON":
                        laptop.get(0).powerOn();
                        break;
                    case "OFF":
                        laptop.get(0).powerOff();
                        bool = false;
                        break;
                    case "UP":
                        laptop.get(0).volumeUp();
                        break;
                    case "DOWN":
                        laptop.get(0).volumeDown();
                        break;
                    default:
                        System.out.println("PILIH SESUAI INSTRUKSI DI MENU -_-");
                        break;
                }
            }
        }
    }
}