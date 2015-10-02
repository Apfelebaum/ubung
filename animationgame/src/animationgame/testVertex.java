package animationgame;

public class testVertex {
	public static void main(String[] args) {

		Vertex v1 = new Vertex(42,4);
		/*Vertex v2 = new Vertex(12,2);

		System.out.println(v1);
		System.out.println(v1.length());
		v1.skalarMultMod(2);
		System.out.println(v1);
		v2=v1.add(7);
		System.out.println(v2);
		v2.addMod(27);
		System.out.println(v1.distance(v2));
		System.out.println(v2);
		System.out.println(v2.length());
		v2.normalize();
		System.out.println(v2);*/
		
		GeometricObject o1= new GeometricObject(5,6,v1);
		System.out.println(o1);
		
			}
}
