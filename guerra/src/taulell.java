public class taulell {
    
    // clase per crear el taulell, dibuixar-lo i actualitzar-lo
    

    dispara dis = new dispara(); // dispars fet. Es necesari per cridar el metode hit de la clase dispara

    // crea el taulell amb tots el seus valors a -1

    public static void initTaulell(int[][] taulell)
        {
            for(int row=0 ; row < 5 ; row++ )
                for(int column=0 ; column < 5 ; column++ )
                    taulell[row][column]=-1;
        }

    // dibuixa el taulell i mira quins valors te cada casella del taulell

    public static void showTaulell(int[][] taulell)
        {
           System.out.println("\t1 \t2 \t3 \t4 \t5"); //primera linia 1-2-3-4-5
           System.out.println(); // linia en blanc per separar numero columna de columna

            for(int row=0 ; row < 5 ; row++ ){
                System.out.print((row+1)+"");  // numero de la fila mes tabulador
                for(int column=0 ; column < 5 ; column++ ){
                    if(taulell[row][column]==-1){
                        System.out.print("\t"+"~"); // simbol inicial
                    }else if(taulell[row][column]==0){
                        System.out.print("\t"+"*");  // simbol aigua
                    }else if(taulell[row][column]==1){
                        System.out.print("\t"+"X"); // simbol tocat
                    }
                }
                System.out.println();
            }
        }


    // actualitza el taulell despres dels dispars. aquest no pot ser estatic perque crida el metode hit que es de la clase dispara
    
    public void changeboard(int[] shoot, int[][] vaixells, int[][] board){
            if(dis.hit(shoot,vaixells))
                board[shoot[0]][shoot[1]]=1;
            else
                board[shoot[0]][shoot[1]]=0;
    }





}
