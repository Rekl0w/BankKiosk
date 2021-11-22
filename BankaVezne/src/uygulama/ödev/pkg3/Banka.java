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
public class Banka {
    

    public static void main(String[] args) {
        
        Kiosk a = new Kiosk(2, "Ahmet");
        Kiosk b = new Kiosk(9, "Mustafa");
        Kiosk c = new Kiosk(11, "Ayşe");
        Kiosk d = new Kiosk(13, "Hayriye");
        Kiosk e = new Kiosk(3, "Batuhan");
        Kiosk f = new Kiosk(17, "Ege");
        Kiosk g = new Kiosk(32, "Yusuf");
        Kiosk h = new Kiosk(6, "Furkan");
        Kiosk ı = new Kiosk(5, "Şeyma");
        Kiosk i = new Kiosk(12, "Burcu");
        Kiosk j = new Kiosk(15, "Zeynep");
        Kiosk k = new Kiosk(8, "Gökhan");
        
        
        
        Vezne v = new Vezne();
        Vezne2 v2 = new Vezne2();
        Vezne3 v3 = new Vezne3();
        Vezne4 v4 = new Vezne4();
        
        v.add(a);
        v.print();
        v.toplamIslemSuresi(a);
        int V = v.vezneZamanToplami();
        v2.add(b);
        v2.print();
        v2.toplamIslemSuresi(b);
        int V2 = v2.vezneZamanToplami();
        v3.add(c);
        v3.print();
        v3.toplamIslemSuresi(c);
        int V3 = v3.vezneZamanToplami();
        v4.add(d);
        v4.print();
        v4.toplamIslemSuresi(d);
        int V4 = v4.vezneZamanToplami();
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(e);
                    v4.print();
                    v4.toplamIslemSuresi(e);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(e);
                    v3.print();
                    v3.toplamIslemSuresi(e);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(e);
                v2.print();
                v2.toplamIslemSuresi(e);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(e);
            v.print();
            v.toplamIslemSuresi(e);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(f);
                    v4.print();
                    v4.toplamIslemSuresi(f);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(e);
                    v3.print();
                    v3.toplamIslemSuresi(f);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(f);
                v2.print();
                v2.toplamIslemSuresi(f);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(f);
            v.print();
            v.toplamIslemSuresi(f);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(g);
                    v4.print();
                    v4.toplamIslemSuresi(g);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(g);
                    v3.print();
                    v3.toplamIslemSuresi(g);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(g);
                v2.print();
                v2.toplamIslemSuresi(g);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(g);
            v.print();
            v.toplamIslemSuresi(g);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(h);
                    v4.print();
                    v4.toplamIslemSuresi(h);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(h);
                    v3.print();
                    v3.toplamIslemSuresi(h);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(h);
                v2.print();
                v2.toplamIslemSuresi(h);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(h);
            v.print();
            v.toplamIslemSuresi(h);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(ı);
                    v4.print();
                    v4.toplamIslemSuresi(ı);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(ı);
                    v3.print();
                    v3.toplamIslemSuresi(ı);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(ı);
                v2.print();
                v2.toplamIslemSuresi(ı);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(ı);
            v.print();
            v.toplamIslemSuresi(ı);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(i);
                    v4.print();
                    v4.toplamIslemSuresi(i);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(i);
                    v3.print();
                    v3.toplamIslemSuresi(i);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(i);
                v2.print();
                v2.toplamIslemSuresi(i);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(i);
            v.print();
            v.toplamIslemSuresi(i);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(j);
                    v4.print();
                    v4.toplamIslemSuresi(j);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(j);
                    v3.print();
                    v3.toplamIslemSuresi(j);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(j);
                v2.print();
                v2.toplamIslemSuresi(j);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(j);
            v.print();
            v.toplamIslemSuresi(j);
            V = v.vezneZamanToplami();
        }
        
        if(V > V2 || V > V3 || V > V4){
            if(V2 > V3 || V2 >V4){
                if(V3 > V4){
                    v4.add(k);
                    v4.print();
                    v4.toplamIslemSuresi(k);
                    V4 = v4.vezneZamanToplami();
                }else{
                    v3.add(k);
                    v3.print();
                    v3.toplamIslemSuresi(k);
                    V3 = v3.vezneZamanToplami();
                }
            }else{
                v2.add(k);
                v2.print();
                v2.toplamIslemSuresi(k);
                V2 = v2.vezneZamanToplami();
            }
        }else{
            v.add(k);
            v.print();
            v.toplamIslemSuresi(k);
            V = v.vezneZamanToplami();
        }
        
    }
    
}
