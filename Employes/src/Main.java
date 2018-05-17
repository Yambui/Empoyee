public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12000,8,"Ivanov");
        Employee emp2 = new Employee(13000,10,"Sidorov");
        Employee emp3 = new Employee(14000,15,"Petrov");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp1.getSalary());
        System.out.println(emp2.getBonus(55));
    }
}
