package java_Assignment2;

 abstract class Animal{
// 	 abstract void sound();
//    abstract void walk();
//     public void colour() {  
//    	 System.out.println("White");
//    	 
//     }
	 
 }

      abstract class Dog extends Animal {

//		@Override
//		public void sound() {
//		   System.out.println("Bhoo Bhoo");
//			
//		}
//		abstract public void walk() {
//			System.out.println("Run");
//		}
//		  abstract void walk();
    	  
    	  public void colour() {  
    	    	 System.out.println("White");
    	    	 
   	     }
		  
 	}
      class breeds extends Dog{

//		@Override
//		void walk() {
//			System.out.println("Run");
//		}
    	  
    	  
      }
      
       


public class Abstract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new breeds();
		
//		obj.sound();
//		obj.walk();
		obj.colour();

	}

}
