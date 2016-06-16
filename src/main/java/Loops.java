
public class Loops {
	
	public static void main(String[] args) {
		String[] stringArray = {"hello","world","my","first","loop"};
		
		
		for(int i = 0;i<stringArray.length; i++){
			
			System.out.println(stringArray[i]);
			
		}
		
		System.out.println("==============================");
		
		for(String s:stringArray){
			
			System.out.println(s);
			
		}
		
		
	}
	

}
