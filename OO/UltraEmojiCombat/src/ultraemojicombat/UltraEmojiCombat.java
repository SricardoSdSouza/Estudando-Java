/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Ricardo
 */
public class UltraEmojiCombat {
    public static void main(String[] args) {
        // TODO code application logic here
        // Lutador(String no, String na, float al, float pe, int vi, int de, int em)
        // Criando um vetor para cadastrar 6 lutadores
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UfoCobol", "Brasil", 37, 1.70f, 119.3f,5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
       /* 
        //l[0].apresentar();
        l[0].status();
        System.out.println("==================");
        l[1].status();
        System.out.println("==================");
        l[2].status();
        System.out.println("==================");
        l[3].status();
        System.out.println("==================");
        l[4].status();
        System.out.println("==================");
        l[5].status();
        System.out.println("==================");*/
       Luta UFC01 = new Luta();
       UFC01.marcarLuta(l[1], l[4]);
       UFC01.lutar();
       System.out.println("====================");
       l[0].status();
       System.out.println("====================");
       l[1].status();
    }    
}
