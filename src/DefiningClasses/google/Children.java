package DefiningClasses.google;

public class Children {
    private String name;
    private String birthday;

    public Children(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String toString() {
        return String.format("%s %s",this.name,this.birthday);
    }
}
