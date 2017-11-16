import java.util.Random;
import java.util.Scanner;

/**
 * classe principal des de la que es cridaran a les altres clases.
 * els noms de les clases no segueixen sempre els formulismes de mayuscules i minuscules.
 * Anava amb pressa. Respecteu l'escriptura perque ajuda a distingir que es cada cosa.
 */

public class guerra {

    public static void main(String[] args)
    {
        // declarem les variables mes importants

        int board [][] = new int[5][5]; // taulell de 5x5 = 25 posicions
        int vaixells [][] = new int[3][2];  // 3 parells de nombres (coordenades) x el vaixells
        int shoot [] = new int[2];  //dos valors (coordenades) fila i columna
        int attempts = 0;
        int shotHit = 0;

        // instanciem les clases necesaries, es a dir, creem objectes segons les definicions i metodes de cada clase

        taulell ta = new taulell(); // taulell es la clase que gestiona el taulell. Creem un objecte de la clase taulell que es diu ta
        barcu ba = new barcu(); // barcu es la clase que defineix com es gestionen els vaixells. Creem un objecte barcu
        dispara dis = new dispara(); // creem un objecte de la clase dispara que es diu dis
        pista pis = new pista(); // creem un objecte de la clase pista que es diu pis

        ta.initTaulell(board); // inicialitza el taulell; el objecte ta crida el metode initTaulell de la clase taulell
        ba.initvaixells(vaixells); // inicialitza els vaixells; del objecte ba cridem el metode initVaixells

        // despres de crear el taulell, els baixells i imprimir les posicions dels vaixells anem a dibuixar el taulell
        
        System.out.println(); // unu espai per a que no s'enganxin les posicions i el taulell

        do
            {
            ta.showTaulell(board); // dibuixa el taulell
            dis.shoot(shoot); // demana que entris el dispar. Per defecte te 0,0 o la ultima
            attempts++;
            if (dis.hit(shoot, vaixells))
            {
                pis.hint(shoot, vaixells, attempts);
                shotHit++;
            }
            else
                pis.hint(shoot, vaixells, attempts);
            ta.changeboard(shoot, vaixells, board);
            }
            while (shotHit != 3) ;
            System.out.println("\n\n\n Battleship Java game finished! You hit 3 vaixells in " + attempts + " attempts");
            ta.showTaulell(board);

    }
}




