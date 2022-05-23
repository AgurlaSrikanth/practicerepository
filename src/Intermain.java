

public class Intermain {
 public static void main(String[] args) {
	 ICalculator calc=new ICalculator() {
		
		@Override
		public void subtraction() {
			// TODO Auto-generated method stub
			System.out.println(4+5);
		}
		
		@Override
		public void addition() {
			// TODO Auto-generated method stub
			System.out.println(3-8);
		}

		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println();
		}
	
	};
	calc.addition();
	calc.subtraction();
 }
			 
			 }
	


