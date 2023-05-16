package twentythree.spring.oop.lesson1.a1;

import java.util.Scanner;  // Import the Scanner class

public class M22W0244{
    public static void main(String[] args) {

        double length, width, height, cuboid_surface_area;
        System.out.println("Required data have been imported");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("A reader object has been defined ");

        System.out.println("Enter the length of Cuboid:");  // allow user input
        length = myObj.nextDouble();  // Read user input
        System.out.println("Cuboid length is: " + length);  // Output user input

        System.out.println("Enter the width of Cuboid:");
        width = myObj.nextDouble();
        System.out.println("Cuboid width is: " + width);

        System.out.println("Enter the height of Cuboid:");
        height = myObj.nextDouble();
        System.out.println("Cuboid width is: " + height);

        cuboid_surface_area = 2*( length*width + width*height + height*length); // calculate the cuboid surface
        System.out.println(" Rectangular Cuboid surface area is: " + cuboid_surface_area); // Output the final result
    }

}
