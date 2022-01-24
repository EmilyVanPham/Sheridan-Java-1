/* ThiThanhVanPhamAssignment1.java
 * Author: Thi Thanh Van Pham
 * Date: January 23, 2022

 * Description: This program is the assignment 1 of class 1221_78235 PROG10082
 */

public class ThiThanhVanPhamAssignment1 {

    public static void main(String[] args) {

        int firstVariable = 27; // Define the first variable
        int secondVariable = 7; // Define the second variable
        int thirdVariable = 9; // Define the third variable

        // Calculate and display the sum of the first two variables times the third.
        System.out.println("(" + firstVariable + " + " + secondVariable + ") * " + thirdVariable + " = "
                + (firstVariable + secondVariable) * thirdVariable);
        // Calculate and display the difference of the first variable from second one divided by the third.
        System.out.println("(" + firstVariable + " - " + secondVariable + ") / " + thirdVariable + " = "
                + (firstVariable - secondVariable) / thirdVariable);
        // Calculate and display the sum of the second and third variable modulus the first.
        System.out.println("(" + secondVariable + " + " + thirdVariable + ") % " + firstVariable + " = "
                + (secondVariable + thirdVariable) % firstVariable);
    }
}
