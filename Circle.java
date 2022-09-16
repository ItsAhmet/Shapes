//Name:Ahmet Yesilbas
//Project Name: Square - Shapes
//Date: 12/22/2021
//Project Description: Circle class that finds area and diameter using radius





//Class
public class Circle {





//Variable(s)
double radius;



//Constructor Method
public Circle(double radius) {
	this.radius = radius;
}





//Methods

//Finds area using radius.
public double circleArea(double radius) {
	 return 3.14*(radius*radius);
}



//Finds diameter using radius.
public double circleDiameter(double radius) {
	return radius*2;
}



//Gets radius.
public double getRadius() {
	 return radius;
}



//Sets radius
public void setRadius(double radius) {
  this.radius=radius;
  }



//To String; inserts data into text format for user when printed.
public String toString() {
	return "Side length given by user:\t\t"+radius+"\nCircle area\t\t\t\t\t\t"+Math.round(circleArea(radius)*100.0)/100.0+"\nCircle parameter\t\t\t\t"+Math.round(circleDiameter(radius));
}
}