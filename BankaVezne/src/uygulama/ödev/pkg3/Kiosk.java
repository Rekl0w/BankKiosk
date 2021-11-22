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
public class Kiosk {
    int IslemSuresi;
    String isim;
    
    public Kiosk(int IslemSuresi, String isim){
        this.IslemSuresi = IslemSuresi;
        this.isim = isim;
        
    }
    
    @Override
    public String toString(){
        return "[ Müşteri: " + isim + " , İşlem Süresi: " + IslemSuresi + " dakika ]";
    }
}
