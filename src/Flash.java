import java.util.Objects;

public class Flash extends Thing {
    private String name;
    public String description;
    public String fireDescr;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void smoke(){
        class Cloud{                                             //локальный класс
            void white(){
                description = "белыми облачками";
            }
        }
        Cloud cloud = new Cloud();
        cloud.white();
    }
    public class Fire{                                             //вложенный класс
        void descr(){
            fireDescr = "огненные";
        }
    }

    Fire fire = new Fire();

    public String fire(){
        return fireDescr;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Flash other = (Flash) obj;
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
