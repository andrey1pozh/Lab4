import java.util.Objects;

public abstract class Thing {
    private String Name;

    public Thing() {
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    //protected void noPunch() {
    //}

    public String happen() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Thing other = (Thing)obj;
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
