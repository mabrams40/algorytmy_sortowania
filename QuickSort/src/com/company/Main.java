package com.company;

public class Main {

    public static void main(String[] args) {
        int tablica[] = { 11, 33, 44, 88, 66, 55, 22, 77};
        int n = tablica.length;

        System.out.println("\nTablica:");
        for(int i : tablica){
            System.out.print(i + " ");
        }
        System.out.println();

        sortuj(tablica, 0, n-1);

        System.out.println("\nUporządkowana tablica:");
        for(int i : tablica){
            System.out.print(i + " ");
        }
        System.out.println();


    }

    /**
     * Wyznaczanie pivota jako ostatni element.
     * Umieszczenie pivota w odpowiedniej pozycji,
     * oraz umieszczenie liczb:
     * a) mniejszych od pivota - na lewo od pivota.
     * b) wiekszych od pivota - na prawo od pivota.
     *
     * @param tablica - przekazana tablica.
     * @param mniejszy - liczba mniejsza od pivota.
     * @param wiekszy - liczba większa od pivota.
     * @return indeks elementu większego od pivota.
     */
    static int partycjonuj(int tablica[], int mniejszy, int wiekszy) {
        int pivot = tablica[wiekszy];
        int i = (mniejszy - 1); // index of smaller element

        for (int j = mniejszy; j < wiekszy; j++) {

            if (tablica[j] <= pivot) {
                i++;

                //zamiana
                int bubble = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = bubble;
            }
        }

        // zamiana z pivotem
        int bubble = tablica[i + 1];
        tablica[i + 1] = tablica[wiekszy];
        tablica[wiekszy] = bubble;

        return i + 1;
    }

    /**
     * Sortowanie tablicy.
     * @param tablica - przekazana tablica.
     * @param mniejszy - liczba mniejsza od pivota.
     * @param wiekszy - liczba większa od pivota.
     */
    static void sortuj(int tablica[], int mniejszy, int wiekszy){
        if(mniejszy < wiekszy){
            int pivot = partycjonuj(tablica, mniejszy, wiekszy);

            sortuj(tablica, mniejszy, pivot-1);
            sortuj(tablica, pivot+1, wiekszy);
        }
    }
}
