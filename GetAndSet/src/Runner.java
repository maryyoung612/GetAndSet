import java.util.ArrayList;
public class Runner
	{
		public static void main(String[] args)
			{
			ArrayList<Siblings>kids=new ArrayList<Siblings>();
			kids.add(new Siblings("Monica", "brown", 10, "sassy", "female"));
			kids.add(new Siblings("Robert", "red", 12, "caring", "male"));
			kids.add(new Siblings("James", "brown", 5, "hyper", "male"));
			kids.add(new Siblings("Michael", "brown", 15, "quiet", "male"));
			kids.add(new Siblings("Ray", "brown", 19, "outgoing", "male"));
			kids.add(new Siblings("Liz", "brown", 24, "know-it-all", "female"));
			kids.add(new Siblings("Bill", "black", 26, "bully", "male"));
			kids.add(new Siblings("Mary", "brown", 18, "amazing", "female"));
			
			for(Siblings fred:kids)
				{
					System.out.println(fred);
				}
			kids.get(1).setHairColor("brown with red");
			System.out.println(kids.get(1).getHairColor());
			for(Siblings fred:kids)
				{
					System.out.println(fred);
				}
			}
	}