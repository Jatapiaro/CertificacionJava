public abstract interface Swimmable{
	
	public final int DEMO = 10;

	public int swimByDistance();
	default int swimByF(){
		return 1;
	}

}