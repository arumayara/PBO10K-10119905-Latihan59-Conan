/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119905.latihan59.conan;

/**
 *
 * @author aruma
 */
public class FemaleCharacter extends DataKarakter{
    private final String gender = "Male";
    public FemaleCharacter(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Gender : Male");
    }
    
}
