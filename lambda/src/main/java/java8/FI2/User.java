package java8.FI2;

public class User {
    String name;
    boolean isIll;
    int lifeBar;

    public int getLifeBar() {
        return lifeBar;
    }

    public void setLifeBar(int lifeBar) {
        this.lifeBar = lifeBar;
    }

    public User(String name, boolean isIll, int lifeBar) {
        this.name = name;
        this.isIll = isIll;
        this.lifeBar = lifeBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }
}
