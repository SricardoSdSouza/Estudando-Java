/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Ricardo Santos o Bom 11/09/2020
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Idioma utilizado no SO
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do seu sistema está configurado para: ");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}
