public class funcoes_string {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toUpperCase();
        String s02 = original.toLowerCase();
        String s03 = original. trim();// elimina os espaços no canto das strings
        String s04 = original.substring(2);// mostra só a partir do caractere 2 
        String s05 = original. substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");

        String s = "potato apple lemon orange";

        String[] vect = s.split(" ");//"corta" as palavras onde possui espaço;

        System.out.println();
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

    }
}
