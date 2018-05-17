public class Employee {
    static int totalhours = 40;
    private int rate;
    private int hours;
    private String name;

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Employee(int rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public Employee(int rate, int hours, String name) {

        this.rate = rate;
        this.hours = hours;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rate=" + rate +
                ", hours=" + hours +
                ", name='" + name + '\'' +
                '}';
    }
    public int getSalary (){
        return this.rate * this.hours;
    }
    public double getBonus (int p){
        if (p > 100 || p < 0) {
             System.out.println("Wrong persent");
            return 0;
        } else {
            return this.getSalary()*p/100;
        }
    }

}
