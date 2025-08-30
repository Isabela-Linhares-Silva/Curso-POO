package entities;

public class Products {
    public String name;
    public double price;
    public int stock;
    public int plus;
    public int remove;

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
