class IceCream extends DesertItem {
	int price = 3;
	int total = 0;
    public int addIceCreams(int candies){
    	total += candies;
    	return total;
    }
    
    public int getCost() {
    	return (price); 
    }
}