
class Cookie extends DesertItem {
	int price = 2;
	int total = 0;
    public int addCookies(int candies){
    	total += candies;
    	return total;
    }
    
    public int getCost() {
    	return (price*70); 
    }
}