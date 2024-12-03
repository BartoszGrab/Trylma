package anonimowi.algorytmicy;

public class Board {
    private Field[][] fields;

    public Board(){
        fields = new Field[17][25];

    }

    /*
     * @brief funkcja do generowania planszy
     */
    public void generateBoard(){
        //generowanie gornego trojkata
        for(int i = 0; i < 4; i++){
            for(int j = 12-i; j <= 12+i; j += 2){
                fields[i][j] = new Field();
            }
        }

        //generowanie srodkowej czesci 1.
        for(int i = 4; i <= 8; i++){
            for(int j = i-4; j < 29-i; j += 2){
                fields[i][j] = new Field();
            }
        }

        //generowanie srodkowej czesci 2.
        for(int i = 9; i <= 12; i++){
            for(int j = 12-i; j<= 12+i; j += 2){
                fields[i][j] = new Field();
            }
        }

        //generowanie dolnego trojkata
        for(int i = 13; i <= 17; i++){
            for(int j = i-4; j <= 28-i; j += 2){
                fields[i][j] = new Field();
            }
        }
    }

    /*
     * pomocnicza funkcja do wyswietlania planszy w konsoli
     */
    public void displayBoard(){
        for(int i = 0; i<17; i++){
            for(int j = 0; j<25; j++){
                if(fields[i][j]==null){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
