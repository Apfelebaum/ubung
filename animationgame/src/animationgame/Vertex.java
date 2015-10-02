package animationgame;

public class Vertex {

	public double x;
	public double y;
	
	public Vertex(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {

Vertex v1 = new Vertex(42,4);
Vertex v2 = new Vertex(12,2);

	}
public String toString(){
	return "("+x+","+y+")";
}
public double length(){
	return Math.sqrt(x*x+y*y);
}
public Vertex skalarMult(double s){
	return new Vertex(x*s,y*s);
}
public void skalarMultMod(double s){
	x=x*s;
	y=y*s;}
public Vertex add(double s){
	return new Vertex(x+s,y+s);
}
public void addMod(double x, double y){
	x=this.x+x;
	y=this.y+y;
}
public void addMod(double s){
	x=x+s;
	y=y+s;}
public Vertex sub(double s){
	return new Vertex(x-s,y-s);
	}
	public void subMod(double s){
	x=x-s;
	y=y-s;}

public double getx() {return x;}

public double gety(){return y;}

public void setx(double x){this.x=x;}

public void sety(double y){this.y=y;}

public boolean equals(Object thatObject){
	if(thatObject instanceof Vertex){
		Vertex that=(Vertex)thatObject;
		
		return this.x==that.x && this.y==that.y;
	}
	return false;
}
public double distance(Vertex v2){
	double xx=v2.x-this.x;
	double yy=v2.y-this.y;
	return Math.sqrt(xx*xx+yy*yy);
}
public void normalize(){
	double factor = this.length();
	x=x/factor;
	y=y/factor;
}
}
