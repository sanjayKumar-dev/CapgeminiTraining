class Candy extends DesertItem {
	int price = 1;
	int total = 0;
    public int addCandies(int candies){
    	total += candies;
    	return total;
    }
    
    public int getCost() {
    	return (price*60); 
    }
}