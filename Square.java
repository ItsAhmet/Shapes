//Name:Ahmet Yesilbas
//Project Name: Square - Shapes
//Date: 12/22/2021
//Project Description: Square class that finds area and parameter using side length.

public class Square {
double sidelength;
  
public Square(double sidelength) {
	this.sidelength=sidelength;
}

public double area(double sidelength) {
	 return sidelength*sidelength;
}
public double par(double sidelength) {
	return sidelength*4;
}
public double getLength() {
	 return sidelength;
}

 public void setLength(double sidelength) {
	 this.sidelength=sidelength;
	 
 }
 public String toString() {
	 return "Square area\t\t"+String.format("%.2f",area(sidelength))+"\nSquare parameter\t"+String.format("%.2f",par(sidelength));
 }
 

public static void main(String [] args) {

Square x = new Square(3);
 System.out.println(x);
	}
}
