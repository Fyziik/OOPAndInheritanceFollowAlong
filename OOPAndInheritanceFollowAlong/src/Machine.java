public class Machine {

    private boolean isOn;

    public void power() {
        this.isOn = !this.isOn;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public String toString() {
        return "Current machines state is: " + this.isOn;
    }

}
