public class TwoSmallest {

 

public static void main(String[] args) {

 
System.out.println("Enter the terminating value");
double halt=IO.readDouble();
double number;
int count=0;
double smallest=Double.MAX_VALUE;
double small=Double.MAX_VALUE;
 while(true) {
	 number=IO.readDouble();
	 if(number==halt) {
		 if(count<2) {
			 IO.reportBadInput();
			 continue;
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 else break;
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 if(number<smallest) {
		 
		 
		 small=smallest;
		 smallest=number;
		 
		 
		 
		 
		 
	 }
	 
	 
	 else if(number<small) {
		 
		 small=number;
		 
		 
		 
	 }
	 
	 count++;
	 
 }

 IO.outputDoubleAnswer(smallest);
 IO.outputDoubleAnswer(small);

}

 

 

 

}

 