/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama.ödev.pkg3;

/**
 *
 * @author Rekl0w
 */
public class Vezne {
    Node first;
    int toplamIslemSuresi;
    
    public Vezne(){
        this.first = null;
    }
    
    public void add(Kiosk a){
        Node n = new Node(a);
        if(this.first == null){
            this.first = n;
        }else{
            if(this.first.vezne.IslemSuresi> n.vezne.IslemSuresi){
                n.next = this.first;
                this.first = n;
            }else{
                Node tmp = first;
                while(tmp.next != null && tmp.next.vezne.IslemSuresi < n.vezne.IslemSuresi){
                tmp =tmp.next;
                }
               n.next = tmp.next;
               tmp.next = n;
            }
            
        }
    }
    
    public void toplamIslemSuresi(Kiosk a){
        Node n = new Node(a);
        toplamIslemSuresi = n.vezne.IslemSuresi + toplamIslemSuresi;
        System.out.println("Vezne 1 yeni toplam işlem süresi: " + toplamIslemSuresi + " dakika." );
        
    }
    
    public int vezneZamanToplami(){
        return toplamIslemSuresi;
    }
    
    
    public void print(){
        Node tmp = this.first;
            while(tmp != null){
                System.out.print("Vezne 1 -> " + tmp.vezne + "-> ");
                tmp = tmp.next;
                
            }
            System.out.println("");
                
    }
}
