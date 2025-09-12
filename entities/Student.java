package entities;

public class Student {
    public String name;
    public float n1;
    public float n2;
    public float n3;


    public float totalGrade (){
        return n1 + n2 + n3;
    }
    public void grade(){
        if (totalGrade() > 59) {
            System.out.println("PASS! ");
        }
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", 60 - totalGrade()); 

        }
    }
    
}
