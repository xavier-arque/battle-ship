public class pista {

    // dona una pista sobre on estan els vaixells

    public static void hint(int[] shoot, int[][] vaixells, int attempt){
        int row=0, column=0;

        for(int line=0 ; line < vaixells.length ; line++){
            if(vaixells[line][0]==shoot[0])
                row++;
            if(vaixells[line][1]==shoot[1])
                column++;
        }

        System.out.printf("\nPista %d: \nFila %d -> %d vaixells\n" +
                "Columna %d -> %d vaixells\n",attempt,shoot[0]+1,row,shoot[1]+1,column);
    }

}
