import java.util.Objects;

public class Stekliaskin extends Human {
    private String name;
    private String description;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String see(){
        return "увидел" + " " + description;
    }

    public String think(){
        return "подумал что это";
    }

    public String noticed(){
        return "вскоре заметил";
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Stekliaskin other = (Stekliaskin) obj;
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
