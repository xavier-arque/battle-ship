import java.util.Random;


/**
 * aquesta clase el que fa es crear els vaixells i mirar
 * que cada vaixel tingui les seves propies coordenades
 */

public class barcu {

    public static void initvaixells(int[][] vaixells)
    {
        Random random = new Random(); // objecte per tenir aleatoriament les posicions dels vaixells


        // coemncem a construir barcus!!

        for(int ship=0 ; ship < 3 ; ship++)
        {

            // possem un numero aleatori en la primera posicio de la matriu
            vaixells[ship][0]=random.nextInt(5);// omplim primera fila. la x coordenades amb numeros entre 0 i 4

            // possem un numero aleatori en la segona posicio de la matriu
            vaixells[ship][1]=random.nextInt(5);// omplim segona fila. la y coordenades amb numeros entre 0 i 4

            // Ara que el parell ja esta creat, em de mirar si la posicio del baixell ja existeig
            // Si existeix un vaixell en la mateixa posicio, creem un altre numero

            for(int last=0 ; last < ship ; last++)
            {
                if( (vaixells[ship][0] == vaixells[last][0])&&(vaixells[ship][1] == vaixells[last][1]) ) // mira si les coordenades son les mateixes
                    do
                    {
                        vaixells[ship][0]=random.nextInt(5); //dona un nou valor a la x coordenades
                        vaixells[ship][1]=random.nextInt(5); // dona un nu valor a la y coordenades
                    }
                    while( (vaixells[ship][0] == vaixells[last][0])&&(vaixells[ship][1] == vaixells[last][1]) );
            }


            // fem un printout de la posicio dels vaixells.
            // ja... aixo es fer trampes pero ara nomes vull saber
            // on estan els barcus per probar si funciona el disparo

            // sumem 1 a cada poscion perque el taulell va de 1 a 5 pero l'array va de 0 a 4
            // ho posso entre parentesis perque java no es lii i pensi que el + abans de l'1 es per concatenar

            System.out.println("posicio x (fila): "+ (vaixells[ship][0]+1));
            System.out.println("posicio y (columna): "+ (vaixells[ship][1]+1));

        }
    }


}
