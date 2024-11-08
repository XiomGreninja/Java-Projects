package Interview.Misc_Practice;

public class AbstractEncapsulationExample {
    public static void main(String[] args) {
        Batsman player = new Batsman(1,"White");
        System.out.println("Bat Number: " + player.getBat());
        System.out.println("Ball Type: " + player.getBall());

        player.setBat(2);
        player.setBall("White Ball");

        System.out.println("Updated Bat Number: " + player.getBat());
        System.out.println("Updated Ball Type: " + player.getBall());

        // Call the play method
        player.play();
        player.showInfo();
    }
}

abstract class cricket {
    private int bat;
    private String ball;

    public cricket(int bat, String ball){
        this.ball = ball;
        this.bat = bat;
    }

    public abstract void play();

    public void showInfo(){
        System.out.println("bat: "+bat+" Ball: "+ball);
    }

    // Getters
    public int getBat(){
        return bat;
    }
    public String getBall(){
        return ball;
    }

    // Setters
    public void setBat(int bat){
        this.bat = bat;
    }
    public void setBall(String ball){
        this.ball = ball;
    }
}

class Batsman extends cricket{
    public Batsman (int bat, String ball){
        super(bat,ball);
    }
    public void play(){
        System.out.println("We're gonna loose!");
    }

}
