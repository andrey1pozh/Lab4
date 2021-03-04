public enum Any {
    TIME("В это время,"),
    //INR(" в ракету"),
    CONTROL(" управление"),
    INAIR(" в воздухе"),
    STEEL(" оболочку"),
    FEEL(" особенно ощутим"),
    PATH("От внезапного изменения курса"),
    PLACE(" с мест"),
    FIRST("С начала");

    private final String name;

    Any(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
