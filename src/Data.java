public class Data {

    private String address;
    private String item;
    private int qty;
    private double price;

    public Data(String address, String item, int qty, double price) {
        this.address = address;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public Data(String item, int qty, double price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public Data(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toCSV() {
        return this.address + ", " + this.item + ", " + this.qty + ", " + this.price;
    }

    public String toCSV1() {
        return this.item + ", " + this.qty + ", " + this.price;
    }
}