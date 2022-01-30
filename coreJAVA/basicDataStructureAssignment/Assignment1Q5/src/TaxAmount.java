class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double ans = 0.0;
    	if(ctc>0 && ctc<=180000)
    	{
    		ans = 0.0;
    	}
    	else if(ctc>=181001 && ctc<=300000)
    	{
    		ans =  (10*ctc)/100;
    		
    	}
    	else if(ctc>=300001 && ctc<500000)
    	{
    		ans = (20*ctc)/100;
    	}
    	else if(ctc>=500001 && ctc<1000000)
    	{
    		ans =  (30*ctc)/100;
    	}
    	return ans;
    }
}