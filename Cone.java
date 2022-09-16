//Name:Ahmet Yesilbas
//Project Name: Cone - Shapes
//Date: 12/22/2021
//Project Description: Cone class that finds area and volume using radius and height.





//Class
public class Cone {





//Variable(s)
double radius;
double height;
  


//Constructor Method
public Cone(double radius, double height) {
	this.radius=radius;
  this.height=height;
}





//Methods

//Finds Area of a cone using radius & height.
public double coneArea(double radius, double height) {
	return Math.PI*radius*(radius+(Math.sqrt(Math.pow(height,2)+Math.pow(radius,2))));
}



//Finds volume of a cone using radius & height.
public double coneVolume(double radius, double height) {
	 return Math.PI*Math.pow(radius,2)*(height/3);
}



//Gets radius
public double getRadius() {
	 return radius;
}



//Sets radius
public void setRadius(double radius) {
 this.radius=radius;
	 
 }



 //Gets height
public double getHeight() {
  return height;
}



//Sets height
public void setHeight(double height) {
	this.height=height;
	 
}



//To String; inserts data into text format for user when printed.
public String toString() {
	return "Radius provided by user:\t\t"+radius+"\nHeight provided by user:\t\t"+height+"\nCone volume:\t\t\t\t\t"+Math.round(coneVolume(radius, height)*100.0)/100.0+"\nCone area:\t\t\t\t\t\t"+Math.round(coneArea(radius, height)*100.0)/100.0;
 }
}