import java.util.Objects;

public class Hit implements IHit {
    private String Name;
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }

    public static void isHeard( Double chance ){
        if (chance >= 50){
            System.out.print("Послышался звонкий ");
        }
        else{
            System.out.print("Послышался глухой ");
        }

    }
    public String was(){
        return "был";
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Hit other = (Hit) obj;
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
