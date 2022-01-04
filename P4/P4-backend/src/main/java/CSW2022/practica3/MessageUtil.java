package practica3;

public class MessageUtil {

	private String message;
	private int message2;
	private double message3;
	 //Constructor
	 //@param message to be printed
	
	 public MessageUtil(String message){
	 this.message = message;
	 }
	 
	 public MessageUtil(int message2){
		 this.message2 = message2;
		 }
	 
	 public MessageUtil(Double message3){
		 this.message3 = message3;
		 }

	 // prints the message
	 public String printMessage(){
		
	 System.out.println(message);

	 return message;
	 } 
	 
	 
}
