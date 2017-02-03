/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strutturedati;
import java.util.Scanner;
/**
 *
 * @author Matteo
 */
public class StruttureDati {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner inp =new Scanner(System.in);
    System.out.println("BENVENUTO");
    System.out.println("Questo è un vettore creato con numeri a caso");
    ListaVett lv = new ListaVett();
    lv.StampaTutto();
    int risp;
    boolean esc=false;
    while(esc==false)
    {
    System.out.println("1 Per inserire un elemento");
    System.out.println("2 Per cancellare un elemento");
    System.out.println("3 Per cercare la chiave");
    System.out.println("4 Per cercare la posizione");
    System.out.println("5 Per uscire dal ciclo");
    risp=inp.nextInt();
    switch(risp)
    {
        case 1:
            System.out.println("Dammi l'elemento da mettere");
            int ele=inp.nextInt();
            System.out.println("Dammi la posizione dove mettere l'elemento");
            int pos=inp.nextInt();
            lv.Inserisci(ele, pos);
            lv.StampaTutto();
            break;
        case 2:
            System.out.println("Dammi la posizione dove eliminare l'elemento");
            int p=inp.nextInt();
            lv.Cancella(p);
            lv.StampaTutto();
            break;
        case 3:
            System.out.println("Inserisci il numero da cercare");
            int q=inp.nextInt();
            System.out.println(lv.CercaChiave(q));
            break;
        case 4:
            System.out.println("Inserisci l'indice da cercare");
            int c=inp.nextInt();
            System.out.println(lv.CercaPosizione(c));
            break;
        case 5:  
            esc=true;
          
    }
    }
    }
}
