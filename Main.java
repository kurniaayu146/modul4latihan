package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    String nama, kelas, matkulPraktikum;
    int nim;

    public Main (String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Main> mhs = new HashMap<>();
        String input;
        Main data;

        mhs.put("1", new Main("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Main("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Main("Arro", "3O", "Pemrograman", 2020017));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + "\nkelas : " + data.kelas + "\nmata kuliah praktikum"
                    + data.matkulPraktikum + "\nnim : " + data.nim);
        }
    }
}

