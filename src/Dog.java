public class Dog
{
    private String name;
    private int age;
    private String breed;
    private double pounds;

    public Dog(String name, int age, String breed, double pounds)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.pounds = lbToKg(pounds);
    }// End constructor

    public Dog()
    {
        name = "";
        age = 0;
        breed = "";
        pounds = 0.0;
    }

    //Getters(Accessors)
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getPounds()
    {
        return lbToKg(pounds);
    }

    //Setters(Mutators)
    public void setName(String newName)
    {
        name = newName;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public void setBreed(String newBreed)
    {
        breed = newBreed;
    }
    public void setPounds(double newPounds)
    {
        pounds = lbToKg(pounds);
    }

    //Brain Methods
    public int lbToKg()
    {
        double convert = 2.205;
        double convert = convert.valueOf(2.205);
    }

    //toString
    public String toString()
    {
        String output = "Name: " + name;
        output += "Age: " + age;
        output += "Breed: " + breed;
        output += "Pounds " + pounds;
        return output;
    }
}