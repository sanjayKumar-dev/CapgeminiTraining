class ArmstrongNumBetweenRange{
    public void armstrongNumbersInRange(int min , int max){
    	ArmstrrongOrNot obj = new ArmstrrongOrNot();
    	for(int i= min; i<= max; i++)
    	{
    		boolean x = obj.armstrongCheck(i);
    		if(x)
    			System.out.println(i + " ");
    	}
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;
       int max = 999;
       ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
       obj.armstrongNumbersInRange(min, max);
    }
}