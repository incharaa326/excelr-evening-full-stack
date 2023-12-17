class Dog
{
	String name,breed,gender;
	int age;
	double height,weight;

	Dog(String name,String breed,String gender,String nature,int age,double,height,double,weight)
	{
		this.name=name;
		this.breed=breed;
		this.gender=gender;
        this.nature=nature;
		this.height=height;
		this.weight=weight;
    }
	public static void main(String[] args) 
	{
		Dog charlie = new Dog("charlie","labrador","male","animal",6,2.5,6.4);
		System.out.println("your dog details:" + "Dog Name:" + charlie.name + "," + "Dog breed:" + charlie.breed + 
		"," + "dog gender:" + charlie.gender + "," + "Dog nature:" + charlie.nature + "," + "Dog age:" + charlie.age + "," + "Dog name:" +
		charlie.height + "," + "Dog name:" + charlie.weight);
		System.out.println("-----------------------------------------");
		Dog charlie = new Dog("baby","indian periah","female","animal",6,2.5,6.4);
		System.out.println("your dog details:" + "Dog Name:" + baby.name + "," + "Dog breed:" + baby.breed + 
		"," + "dog gender:" + baby.gender + "," + "Dog nature:" + baby.nature + "," + "Dog age:" + baby.age + "," + "Dog name:" +
		baby.height + "," + "Dog name:" + baby.weight);
		System.out.println("-----------------------------------------");
		Dog charlie = new Dog("ruby","indian periah","male","animal",6,2.5,6.4);
		System.out.println("your dog details:" + "Dog Name:" + ruby.name + "," + "Dog breed:" + ruby.breed + 
		"," + "dog gender:" + ruby.gender + "," + "Dog nature:" + ruby.nature + "," + "Dog age:" + ruby.age + "," + "Dog name:" +
		ruby.height + "," + "Dog name:" + ruby.weight);
	}
}
