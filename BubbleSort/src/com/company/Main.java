package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("BubbleSort");

	    int[] tablica = { 1, 20, 3, 7, 12, 39};
        int bubble;

        System.out.println("\nPoczątkowa tablica:");
        wypisz(tablica);

        for(int i=0; i< tablica.length; i++){
            for(int j=i+1; j< tablica.length-1; j++){
                if(tablica[i] > tablica[j]){
                    bubble = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = bubble;
                }
            }
        }

        System.out.println("\nPosortowana tablica:");
        wypisz(tablica);

    }

    public static void wypisz(int[] tablica){
        for(int i : tablica){
            System.out.println(i);
        }
    }
}
