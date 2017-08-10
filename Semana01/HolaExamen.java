public class HolaExamen{
	/*
	* Los tres puntos se llaman VAR ARGS
	* no importa del tipo que sea, eso se convierte en un arreglo
	*/
	static public void main(String... args) {
		
		for(String s : args){
			System.out.println("Hola: "+s);
		}
		System.out.println(args.length);
		
	}
}