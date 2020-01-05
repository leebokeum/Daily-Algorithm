public class Pet {
    private String name;
    boolean isHappy = false;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public boolean startHappy() {
        isHappy = true;
        return isHappy;
    }
}
