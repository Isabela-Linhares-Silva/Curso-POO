package entities;

public class ProductsV3 {
    private String name;// como é private só pode ser acessado nessa classe
    private double price;
    private int stock;
    public int plus;
    public int remove;

    public ProductsV3(){
        
    }// construtor padrão

    public ProductsV3(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }// construtor personalizado

        public ProductsV3(String name, double price){
        this.name = name;
        this.price = price;
        
    }// construtor inicializando a quantidade em 0

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getStock(){
        return stock;
    }

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
