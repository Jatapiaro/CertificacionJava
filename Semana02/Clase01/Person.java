public abstract class Person{

	private String name;
	public int age;

	public abstract String getEmoji();

	public int getDaysLived(){
		return age * 365;
	}

	public static void main(String[] args) {
		Person p = new Student();
		System.out.println(p.getEmoji());
	}

}

// Final, detiene la herencia, ya no 
// se puede seguir heredando de ella
/*final*/ class Student extends Person{

	final long MAX;

	Student(){
		MAX = 100;
	}

	public String getEmoji(){
		return "\u0001001";
	}

	/*
	* Impide hacer un override 
	* del método
	*/
	final void sing(){}

}

class Junior extends Student implements Swimmable{
	public int swimByDistance(){
		return 1;
	}

}