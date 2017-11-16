import java.util.Scanner;

public class dispara
{


    public static void shoot(int[] shoot)
    {
       // System.out.printf("posicio per defecte del dispar (%d,%d)\n",shoot[0],shoot[1]);

        Scanner input = new Scanner(System.in);

        System.out.print("Fila: ");
        shoot[0] = input.nextInt();
        shoot[0]--; // resta 1 xk la matriu comença en 0 pero visualment en 1

        System.out.print("Columna: ");
        shoot[1] = input.nextInt();
        shoot[1]--; // resta 1 xk la matriu comença en 0 pero visualment en 1
    }



    public static boolean hit(int[] shoot, int[][] vaixells)
    {
        for(int ship=0 ; ship<vaixells.length ; ship++)
        {
            if( shoot[0]==vaixells[ship][0] && shoot[1]==vaixells[ship][1]) // mira si coincideixen les coordenades de les posicions
            {
                System.out.printf("Has tocat un vaixell en la posicio (%d,%d)\n",shoot[0]+1,shoot[1]+1);
                return true;
            }
        }
        return false;
    }
}
