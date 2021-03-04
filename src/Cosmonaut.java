import java.util.Objects;

public class Cosmonaut extends Human {
    private String name;
    public Cosmonaut(String name) {
        setName(name);
    }

    protected static void fall(String event) {
        if (event.equals("От внезапного изменения курса")){
            System.out.print("упали");
        }
        else {
            System.out.print("едва не упали");
        }
    }
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Cosmonaut other = (Cosmonaut) obj;
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
