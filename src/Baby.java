public class Baby extends Product{
    private String name;

    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                '}';
    }
}
