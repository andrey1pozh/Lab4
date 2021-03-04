import java.util.Objects;

public class Bullet extends Thing{
    private String name;

    public Bullet(String name) {
        setName(name);
    }

    /*protected void noPunch(){
        System.out.print(" не пробила");
    }*/

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Bullet other = (Bullet) obj;
                return Objects.equals(this.name, other.name);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    public String toString() {
        return this.name;
    }
}
