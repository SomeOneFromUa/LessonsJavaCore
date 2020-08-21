package homework2.part2;

public class main {
    public static void main(String[] args) {
        Employee Rue = new Employee("Rue", "Hehelia", 4, "chief");
        Employee Mark = new Employee("Mark", "Gorbachik", 2, "HR");
        Department dep1 = new Department("dep1");
        Department dep2 = new Department("dep2");
        Company company1 = new Company("MyCompany");
        company1.getDepartments().add(dep1);
        company1.getDepartments().add(dep2);
        dep1.getEmployees().add(Rue);
        dep1.getEmployees().add(Mark);
        System.out.println(company1);
    }
}
