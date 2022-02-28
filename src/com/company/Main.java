package com.company;

public class Main {

    public int convert_Letters_Test(char[] letterArrayIndex, int indexTal) {


        for (int i = 0; i < letterArrayIndex.length; i++) {

            if(indexTal == letterArrayIndex[i]) {


                return i;
            }

        }

        return -1;
    }




    public char convert_Numbers_Test(char[] numbersArrayIndex, int indexBogstav) {

        // Kan ikke få den anden metode til at virke.... int --> char.
        // Prøvet med forskellige array sammenhænge.


        for (char j = 0; j < numbersArrayIndex.length; j++) {

            if(indexBogstav == numbersArrayIndex[j]) {


                return j;
            }

        }


        return '?';
    }





    public static void main(String[] args) {


        
        Main Enigma = new Main();

        // Test kodning af Cæsar cipher prototypen.

        // Selve array'et indhold:
        char[] letterArrayIndex = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T','U', 'V','W', 'X','Y','Z','Æ','Ø','Å'};


        char[] numbersArrayIndex = new char[30];
        numbersArrayIndex[0] = ' ';
        numbersArrayIndex[1] = 'A';
        numbersArrayIndex[2] = 'B';
        numbersArrayIndex[3] = 'C';
        numbersArrayIndex[4] = 'D';
        numbersArrayIndex[5] = 'E';
        numbersArrayIndex[6] = 'F';
        numbersArrayIndex[7] = 'G';
        numbersArrayIndex[8] = 'H';
        numbersArrayIndex[9] = 'I';
        numbersArrayIndex[10] = 'J';
        numbersArrayIndex[11] = 'K';
        numbersArrayIndex[12] = 'L';
        numbersArrayIndex[13] = 'M';
        numbersArrayIndex[14] = 'N';
        numbersArrayIndex[15] = 'O';
        numbersArrayIndex[16] = 'P';
        numbersArrayIndex[17] = 'Q';
        numbersArrayIndex[18] = 'R';
        numbersArrayIndex[19] = 'S';
        numbersArrayIndex[20] = 'T';
        numbersArrayIndex[21] = 'U';
        numbersArrayIndex[22] = 'V';
        numbersArrayIndex[23] = 'W';
        numbersArrayIndex[24] = 'X';
        numbersArrayIndex[25] = 'Y';
        numbersArrayIndex[26] = 'Z';
        numbersArrayIndex[27] = 'Æ';
        numbersArrayIndex[28] = 'Ø';
        numbersArrayIndex[29] = 'Å';



        System.out.println("");
        int index_Letter = Enigma.convert_Letters_Test(letterArrayIndex, 'Å');
        // System.out.println("Bogstavet index er: " + index_Letter);

        // System.out.println("");

        char index_Numbers = Enigma.convert_Numbers_Test(numbersArrayIndex, 5);
        // System.out.println("index'et bogstav er: " + index_Numbers);

        // Kan ikke få den anden metode til at virke.... int --> char.
        // Prøvet med forskellige array sammenhænge.






    }
}
