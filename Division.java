package Calculat;

public class Division {
    public static void main(String[] args) {
        int a=15;
        int b=0;
        try{
            int div =a/b;
            System.out.println("Division : "+div);
        }catch (AirthmeticException e){
            System.out.println("Error : Cannont divisible by zero");
        }  
    }
}
