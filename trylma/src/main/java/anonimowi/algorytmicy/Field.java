package anonimowi.algorytmicy;

public class Field {
    private Player player;

    public void setPlayer(Player player){
        if(this.player!=null){
            throw new IllegalArgumentException();
        }
        this.player = player;
    }
    
    public void removePlayer(){
        this.player = null;
    }
}
