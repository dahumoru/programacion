public class bandera {
    public static void main(String args[]) {

        char bandera[][];
        bandera = new char[5][9];


        for (int i=0; i<bandera.length; i++)
        {
            for (int j=0; j<2; j++) 
            {
                bandera[i][j]='v';
            }
        }

        for (int i=0; i<bandera.length;i++) 
        {
            for (int j=3; j<5; j++) 
            {
                bandera[i][j]='b';
            }
        }

        for (int i=0; i<bandera.length; i++) 
        {
            for (int j=6; j<8; j++)
            {
                bandera[i][j]='m';
            }
        }

        for (int i=0; i<bandera.length ;i++) 
        {
            for (int j=0;j<bandera[0].length ;j++) 
            {
                if (bandera[i][j]=='v')
                {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND);
                }

                if (bandera[i][j]=='b') 
                {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND);
                }

                if (bandera[i][j]=='m')
                {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND);
                }
            }
        }

    }
}