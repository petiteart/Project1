import java.awt.*;

public class Javaclass {
    private static String pawita = "Mike eats everything";
    private static String whatDoesMikeEat(){
        return pawita;
    }
    private static Color[] colorArray = {Color.black, Color.yellow, Color.BLUE, Color.darkGray, Color.gray,Color.black, Color.yellow, Color.BLUE, Color.darkGray, Color.gray};
    public static void main(String[] args){
        for (int i = 16; i <= 25; i++) {
            Pawita pawita = new Pawita(colorArray[i-16]);
            pawita.setAge(i);
            System.out.println(pawita);
        }

        PawitaGUI pawitaGUI = new PawitaGUI();
        pawitaGUI.showGUI();

    }
}


