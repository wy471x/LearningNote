package OOP;

public class ClassAndInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
	}

}

class City{
	String name;
	double latitude;
	double longitude;
}