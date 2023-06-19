public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //public static void setId(int id) {Employee.id = id;}

    public String toString() {
        return "Ф.И.О. сотрудника : " + name + " Отдел : " + department + " Заработная плата : " + salary;
    }

}
