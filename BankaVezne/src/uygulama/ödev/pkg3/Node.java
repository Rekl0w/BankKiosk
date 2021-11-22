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
public class Node {
    Kiosk vezne;
    Node next;
    
    public Node(Kiosk vezne){
        this.vezne = vezne;
        this.next = null;
    }
}
