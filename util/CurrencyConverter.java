package util;

public class CurrencyConverter {
    
    public static double Converter(double price, double value){
        return price * value + (price * value *0.06);
    }
}
