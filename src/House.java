  public class House {
    private String color ;
    private int sum ;

    public House(String color, int sum) {
        this.color = color;
        this.sum = sum;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getColor() {
        return color;
    }

    public int getSum() {
        return sum;
    }
}
