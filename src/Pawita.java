import java.awt.*;

public class Pawita {
    private Color hairColor;
    private int age;
    public Pawita(Color hairColor){
        this.setHairColor(hairColor);
    }

    @Override
    public String toString(){
        return super.toString() + "Pawita has "+ this.hairColor + " hair and is "+ this.age + " years old.";
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
