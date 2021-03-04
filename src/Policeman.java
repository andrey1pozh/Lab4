import java.util.Objects;

public class Policeman extends Human {
    private String name;
    private static String location;
    private String description;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLocation(String location){
        Policeman.location = location;}

    public void setDescription(String description) {
        this.description = description;
    }

    protected String shoot() {
        return "выстрелил " + description;
    }

    public static class boomStick{
        private String name;
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public static void armed(String location){
            if (location.equals("на крышах домов")){
                boomStick.setName("вооруженных винтовками");
            }else{
                boomStick.setName("просто палки");
            }
        }
    }
    static boomStick boomStick = new boomStick();

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            if (this == obj) {
                return true;
            } else {
                Policeman other = (Policeman) obj;
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
