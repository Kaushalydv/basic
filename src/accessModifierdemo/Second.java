package accessModifierdemo;

public class Second {

	public static void main(String[] args) {
		  
		Modifierdemo md=new Modifierdemo();
		
		//md.Private();             //only within class not outside class. 
		md.Defaultm();
		md.Protectedm();
		md.Publicm();
	}
}
