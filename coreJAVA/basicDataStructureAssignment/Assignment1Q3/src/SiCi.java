import java.lang.Math;
class SiCi {
    public double simpleInterest(double p,int t,double r){
    	
    	double ans = (p*r*t)/100;
    	return ans;
    	
    }
    
    
    public double compoundInterest(double p,int t,double r){
    	
    	double ans = Math.pow((p*(1+r)), t);
    	return ans;
    	
    }
}
