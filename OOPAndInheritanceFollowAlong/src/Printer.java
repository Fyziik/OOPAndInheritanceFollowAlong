public class Printer extends Machine {

    private Papertray papertray;
    private String name;

    public Printer(int paperAmount, String name) {
        this.papertray = new Papertray(paperAmount);
        this.name = name;
    }

    public void print() {
        System.out.println("This is a " + this.name);
    }

    public void print(String text, int amount) {
        if (isOn()) {
            for (int i = 0; i < amount; i++) {
                if (papertray.usePaper()) {
                    System.out.println(text);
                }
            }
        }
    }

}
