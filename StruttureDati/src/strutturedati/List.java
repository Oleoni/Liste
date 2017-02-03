/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strutturedati;

/**
 *
 * @author Matteo
 */
public interface List {
    abstract public int CercaChiave(int e);
    abstract public int CercaPosizione(int i);
    abstract public void Inserisci(int e,int i);
    abstract public void Cancella (int i);
    abstract public void AllungaVettore();
    abstract public void AggiungiCoda(int e);
    abstract public void StampaTutto();
}
