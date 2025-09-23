package entities;

public class ProductsV2 {
    public String name;
    public double price;
    public int stock;
    public int plus;
    public int remove;

    public ProductsV2(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }// construtor

    public double Total() {
        return price *stock;
    }

    public void TotalValueInStock(){
        System.out.printf("data: %s, $ %.2f, %d units, Total: $ %.2f\n",name,price,stock,Total());
    }

    public int AddProducts(){
        return stock += plus;
    }

    public int RemoveProducts(){
        return stock -=remove;
    }

    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + stock
            + " units, Total: $ "
            + String.format("%.2f", Total());
    }
}
