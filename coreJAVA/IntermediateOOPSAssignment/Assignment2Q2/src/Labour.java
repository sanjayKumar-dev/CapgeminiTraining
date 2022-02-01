class Labour extends employee {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return overtime+salary;
    }
}