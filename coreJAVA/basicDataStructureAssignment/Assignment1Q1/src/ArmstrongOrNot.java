import java.lang.Math;
class ArmstrrongOrNot {
    public boolean armstrongCheck(int num) 
    {
    	int n = num;
    	int sum = 0;
    	int count = 0;
    	while(n!=0)
    	{
    		count++;	
    		n = n/10;
    	}
    	n = num;
    	while(n!=0)
    	{
    		int i = (n%10);
    		sum = sum + (int)(Math.pow(i, count));		
    		n = n/10;
    	}
    	return (num == sum);
    }
};