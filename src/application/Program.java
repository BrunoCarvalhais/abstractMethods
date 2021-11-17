package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(width, height, color));
            } else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(radius));
            }
        }
        System.out.println();
        System.out.println("Shape Areas: ");
        for (Shape shp : shapes){
            System.out.println(shp.area());
        }
    }
}
