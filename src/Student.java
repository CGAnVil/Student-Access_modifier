public class Student {
    private String name = "John";
    private String classes = "C02";

    Student(){

    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }
}
