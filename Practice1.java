import java.util.*;
public class Practice1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c, s;
	System.out.println("Enter the 3 values of the tri to get the area: ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	s = (a + b + c) / 2;
	float area = (float)Math.sqrt(s*(s - a) + (s - b) + (s - c));
	System.out.println(area);
}


}
