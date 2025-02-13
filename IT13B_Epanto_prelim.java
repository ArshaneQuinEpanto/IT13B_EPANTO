
package it13b_epanto_prelim;



public class IT13B_Epanto_prelim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 4;
        int num3 = 6;
        int num4 = 3;
        
        System.out.println(num1 + "*" + num2 + "+" + num3 + "=" + (num1 * num2 + num3));
        System.out.println(num1 + "-" + num2 + "%" + num3 + "=" + ((num1 - num2) % num3));
        System.out.println("("+num1 + "+" + num2+")" + "/" + num4 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num3 + "-" + num2 + "*" + num2 + "=" + (num1 * num3 - num2 * num2));
    }
    
}
