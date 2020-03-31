package com.latihan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static boolean state = true;
    private static Scanner scanner;
    private static List<Student> studentList;

    public static void main(String[] args) throws IOException {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
        System.out.println("ATM Mahasiswa");
        int x;

        System.out.println("Silahkan pilih salah satu menu dibawah ini dengan angka");
        while (state) {
            System.out.println("1. Create Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Create Pelajaran");
            System.out.println("3. Edit Pelajaran");
            System.out.println("4. Exit");
            x = scanner.nextInt();
            clearScreen();
            switch (x) {
                case 1:
                    System.out.println("1. Create Student Menu");
                    break;
                case 2:
                    System.out.println("2. Edit Student Menu");
                    break;
                case 3:
                    System.out.println("3. Create Pelajaran Menu");
                    break;
                case 4:
                    System.out.println("4. Edit Pelajaran Menu");
                    break;
                case 5:
                    System.out.println("5. Exit");
                    state = false;
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak tersedia, silahkan masukan input lagi");
                    break;
            }
        }
    }

    private static void createStudent() {
        System.out.print("Enter Name : ");
        String name = String.valueOf(scanner);
        System.out.println("Enter NIK : ");
        int nik = scanner.nextInt();
        insertStudentData();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void insertStudentData(Student student) {
        studentList.add(student);
    }
}
