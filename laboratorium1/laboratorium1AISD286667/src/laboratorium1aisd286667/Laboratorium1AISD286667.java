package laboratorium1aisd286667;

public class Laboratorium1AISD286667 {
    
    public static int[] posortuj(int[] tab){
        int klucz, j;
        for(int i = 1; i < tab.length; i++){
            j = i;
            klucz = tab[i];
            while(j>0&& tab[j-1] > klucz) {
                tab[j] = tab[j-1];
                j--;
            }
            tab[j]=klucz;
            System.out.println("Krok numer " + i + "\n");
            pokazTablice(tab);
        }
        return tab;
    }
    
    public static void pokazTablice(int[] tab) {
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");            
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        int[] ciagLiczb = new int[8];
        int[] posortowanyCiagLiczb = new int[ciagLiczb.length];
        ciagLiczb[0] = 9;
        ciagLiczb[1] = 7;
        ciagLiczb[2] = 5;
        ciagLiczb[3] = 4;
        ciagLiczb[4] = 2;
        ciagLiczb[5] = 1;
        ciagLiczb[6] = 5;
        ciagLiczb[7] = 3;
        System.out.println("Tablica przed posortowaniem:\n");
        pokazTablice(ciagLiczb);
        posortowanyCiagLiczb = posortuj(ciagLiczb);
        System.out.println("Tablica po posortowaniu:\n");
        pokazTablice(posortowanyCiagLiczb);
    }    
}
