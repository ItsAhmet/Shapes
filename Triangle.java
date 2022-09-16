//Name:Ahmet Yesilbas
//Project Name: Square - Shapes
//Date: 12/22/2021
//Project Description:
public class Triangle {
double base, height;
  
public Triangle(double base, double height) {
	this.base=base;
	this.height=height;
}

public double area(double base, double height) {
	 return 0.5*base*height;
}

public double getBase() {
	 return base;
}
public double getHeight() {
	 return height;
}

 public void setBase(double base) {
	 this.base=base;
	 
 }
 
 public void setHeight(double height) {
	 this.height=height;
	 
 }
 public String toString() {
	 return "Triangle area\t\t"+String.format("%.2f",area(base, height));
 }
 

public static void main(String [] args) {

Triangle x = new Triangle(3.234267, 4);
 System.out.println(x);
	}
}
