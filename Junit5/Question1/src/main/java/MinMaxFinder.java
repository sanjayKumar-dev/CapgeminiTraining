
public class MinMaxFinder {
	public int[] findMinMax(int []arr) {
		
		int[] arr1 = new int[2];
		
		int minn = arr[0];
		int maxx = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<minn)
				minn = arr[i];
			else if(arr[i]>maxx)
				maxx = arr[i];
		}
		
		arr1[0] = minn;
		arr1[1] = maxx;
		
		return arr1;
	}
}
