public class Main {
    public static void main(String[] args) {

        System.out.println("");
        Scanner reader= new Scanner(System.in);
        int num1,num2;

        System.out.println("Favor de introducir el numero para saber si es divisor");
        num1= reader.nextlnt();

        System.out.println("Favor de introducir el numero para saber si es divisor ");
        num2= reader.nextlnt();

        if(num1%num2==0)
            System.out.println(num1 + "es divisible por"+num2);
        else
            system.out.printl(num2+ "No es divisor por" + num2);
    }
}