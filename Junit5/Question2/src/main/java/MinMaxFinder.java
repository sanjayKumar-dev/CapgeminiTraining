
public class MinMaxFinder {
	
public String findMinMax(int []arr) {			
		int minn = arr[0];
		int maxx = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<minn)
				minn = arr[i];
			else if(arr[i]>maxx)
				maxx = arr[i];
		}
		
		String str = "";		
		str += Integer.toString(minn)+Integer.toString(maxx);		
		return str;
	}

}
