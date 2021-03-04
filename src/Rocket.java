import java.util.Objects;

public class Rocket implements IRocket {
    private static int HP = 100;
    private String Name;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public static void hpBar(String Material){
        if (Material.equals("steal")){
            System.out.print(" не пробила");
        }
        else{
            HP -= 20;
            System.out.print(" пробила");
        }
    }

    public String shake(){
        return "вздрогнула";
    }

    public String loseControl(){
        return "потеряла";
    }

    public String rollOver(){
       return "перевернулась";
    }

    public String weightlessness(){
        return "находилась в состоянии невесомости";
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Rocket other = (Rocket) obj;
                return Objects.equals(this.Name, other.Name);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.Name);
    }

    public String toString() {
        return this.Name;
    }
}
