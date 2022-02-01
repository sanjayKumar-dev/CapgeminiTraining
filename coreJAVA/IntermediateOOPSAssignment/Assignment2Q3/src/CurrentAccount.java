class CurrentAccount extends bank {
    int creditLimit = 2000;
    public int getCash() {
    	return totalDeposits +creditLimit;
    }
}