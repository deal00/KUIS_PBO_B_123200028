/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis_PBO_B_123200028;

/**
 * Taufik Sahid Fadhil | 123200028
 * @author Asus
 */
public class Main {
    public static void cetakAnimals(Animal animal) {      
        System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");animal.Suara();  
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Animals ml = new Animals ("ml", "macan", "p");
        Animals ml2 = new Animals ("ml", "macan", "pp");
        Animals k =  new Animals ("k", "kambing", "k");
        Animals a =  new Animals ("a", "ayam", "a");
        cetakAnimals(ml);
        cetakAnimals(ml2);
        cetakAnimals(k);
        cetakAnimals(a);
    }
    
}
