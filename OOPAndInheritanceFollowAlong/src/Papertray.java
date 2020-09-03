public class Papertray {

    private int paperAmount;

    public Papertray(int amount) {
        this.paperAmount = amount;
    }

    public boolean usePaper() {
        if (this.paperAmount >= 1) {
            this.paperAmount--;
            return true;
        }
        System.out.println("Restock paper");
        return false;
    }

    public void restockPaper(int amount) {
        this.paperAmount += amount;
    }

    public int displayPaperAmount() {
        return this.paperAmount;
    }

}
