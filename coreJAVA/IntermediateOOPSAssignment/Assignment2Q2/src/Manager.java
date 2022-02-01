class Manager extends employee {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;        
    }
}