//Name:Ahmet Yesilbas
//Project Name: Square - Shapes
//Date: 12/22/2021
//Project Description:
public class Trapezoid {
double  baseA, baseB, height;
  
public Trapezoid(double baseA, double baseB, double height) {
	this.baseA=baseA;
	this.baseB=baseB;
	this.height=height;
}

public double area(double baseA, double baseB, double height) {
	 return  ( 0.5 * (baseA + baseB)) * height;
}
public double getBaseA() {
	 return baseA;
}
public double getBaseB() {
	 return baseB;
}

public double getHeight() {
	 return height;
}

 public void setBaseA(double baseA) {
	 this.baseA=baseA;
	 
 }
 public void setBaseB(double baseB) {
	 this.baseB=baseB;
	 
 }
 public void setHeight(double height) {
	 this.height=height;
	 
 }
 public String toString() {
	 return "Trapezoid area\t\t"+String.format("%.2f",area(baseA, baseB, height));
 }
 

public static void main(String [] args) {

Trapezoid x = new Trapezoid(3,21,1);
 System.out.println(x);
	}
}
