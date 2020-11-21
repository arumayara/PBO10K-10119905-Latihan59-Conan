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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Data Karakter Detective Conan");
        
        Conan objConan = new Conan("Conan Edogawa",6);
        Kogoro objKogoro = new Kogoro("Kogoro Mouri",37);
        Hiroshi objHiroshi = new Hiroshi("Hiroshi Agasa",52);
        Heiji objHeiji = new Heiji("Heiji Hatori",17);       
        Genta objGenta = new Genta("Genta Kojima",6);
        Mitsuhiko objMitsuhiko = new Mitsuhiko("Mitsuhiko Tsuburaya",6);
        Ai objAi = new Ai("Haibara Ai",6);
        Ran objRan = new Ran("Ran Mouri",16);
        Ayumi objAyumi = new Ayumi("Ayumi Yoshida",6);
        Eri objEri = new Eri("Eri Kisaki",38);
        Kazuha objKazuha = new Kazuha("Kazuha Tōyama",17);
        Sonoko objSonoko = new Sonoko("Suzuki Sonoko",17);
        
        System.out.println("Male Character");
        objConan.display();objConan.Detektifcilik();
        objKogoro.display();objKogoro.Detektifswasta();
        objHiroshi.display();objHiroshi.Profesor();
        objHeiji.display();objHeiji.Petarungkendo();
        objGenta.display();objGenta.DetektifCilik();
        objMitsuhiko.display();objMitsuhiko.DetektifCilik();
        System.out.println("");
        System.out.println("Female Character");
        objAi.display();objAi.AnggotaOrganisasiHitam();
        objRan.display();objRan.Pengacara_handal();
        objAyumi.display(); objAyumi.DetektifCilik();
        objEri.display();objEri.Pengacara();
        objKazuha.display();objKazuha.PutriKomisaris();
        objSonoko.display();objSonoko.Keluarga_Kaya();
        
    }
    
}
