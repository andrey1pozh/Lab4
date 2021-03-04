import java.util.Objects;

public class Znaika extends Human {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

        protected static void move(String where) {
            if (where.equals("на снижение")){
                System.out.print("повел");
            }
            else {
                System.out.print("улетел");
            }
    }

        public boolean equals(Object obj) {
            if (obj != null && obj.getClass() == this.getClass()) {
                if (this == obj) {
                    return true;
                } else {
                    Znaika other = (Znaika) obj;
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
