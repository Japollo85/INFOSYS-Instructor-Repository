package net.mercy.objcomparison;

public class Person implements Comparable<Object> {

    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "";
    }
	
	public int compareTo(Object o) {
		
		if(o instanceof Person){
			if(this.age == ((Person) o).getAge()){
				return 0;
			}else{
				
				return this.age>((Person) o).getAge()?1:-1;
			}
		}
		
        return 0;
	}

}
