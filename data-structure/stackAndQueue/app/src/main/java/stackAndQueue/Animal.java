package stackAndQueue;

public class Animal {
    private String pref;

    public Animal(String pref) {
        this.pref = pref;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "pref='" + pref + '\'' +
                '}';
    }


}
