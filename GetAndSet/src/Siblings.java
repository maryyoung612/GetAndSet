
public class Siblings
	{
	private String name;
	private String hairColor;
	private int age;
	private String personality;
	private String gender;
	public Siblings(String n, String h, int a, String p, String g)
	{
	name=n;
	hairColor=h;
	age=a;
	personality=p;
	gender=g;
	
	}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public String getHairColor()
		{
			return hairColor;
		}
	public void setHairColor(String hairColor)
		{
			this.hairColor = hairColor;
		}
	public int getAge()
		{
			return age;
		}
	public void setAge(int age)
		{
			this.age = age;
		}
	public String getPersonality()
		{
			return personality;
		}
	public void setAttitude(String personality)
		{
			this.personality = personality;
		}
	public String getGender()
		{
			return gender;
		}
	public void setGender(String gender)
		{
			this.gender = gender;
		}
	@Override
	public String toString()
		{
			return "Siblings [name=" + name + ", hairColor=" + hairColor + ", age=" + age + ", personality="
					+ personality + ", gender=" + gender + "]";
		}
	}