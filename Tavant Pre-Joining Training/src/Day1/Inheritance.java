package Day1;


	class Animals
	{
		void Sound()
		{
			System.out.println("Sound");
		}
	 
	}
	class Dog extends Animals
	{
		void Bark()
		{
			System.out.println("Barking");
		}
		
	}
	class Cat extends Animals
	{
		void Meow()
		{
			System.out.println("Meowing");
		}
	}
	public class Inheritance {
		
	public static void main(String[] args) {
		Cat c =new Cat();
		Dog d =new Dog();
		c.Meow();
		d.Bark();
		c.Sound();
			
		
	}

}
