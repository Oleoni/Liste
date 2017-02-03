/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strutturedati;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/**
 *
 * @author Matteo
 */
public class ListaVett implements List{
    Scanner input=new Scanner(System.in);
    int[]vett= new int[10];
    int k;
    int cont=0;
    public ListaVett()
    {
        cont=6;
        for(int i=0;i<cont;i++)
        {
            k=ThreadLocalRandom.current().nextInt(1, 50);
            vett[i]=k;
        }
    }
    @Override
    public void StampaTutto()
    {
        for(int i=0;i<vett.length;i++)
        {
            System.out.println(vett[i]);
        }
    }
    
    @Override
    public int CercaChiave(int e)
    {
      for(int i=0;i<vett.length;i++)
      {
          if(vett[i]==e)
          {
              return i+1;
          }
      }  
      return 0;
    }
    @Override
    public int CercaPosizione(int p)
    {
     return vett[p-1];
    }
    @Override
    public void AllungaVettore()
    {
        int[]app=vett;
        vett=new int [vett.length+10];
        for(int i=0;i<vett.length;i++)
        {
            vett[i]=app[i];
        }
    }
    @Override
    public void AggiungiCoda(int e)
    {
        vett[cont]=e;
        cont++;
        if(cont>=vett.length)
        {
            AllungaVettore();
        }
    }
    @Override
    public void Inserisci (int e, int p)
    {
            for(int i=cont;i>=p;i--)
            {
                vett[i]=vett[i-1];
            }
            vett[p]=e;
            cont++;
            if(cont>=vett.length)
            {
                AllungaVettore();
            }
    }
    @Override
    public void Cancella (int p)
    {
        vett[p]=0;
        for(int i=p;i<cont;i++)
        {
            vett[i]=vett[i+1];
        }        
        cont--;
    }
}
