public class Storage {
    private final Employee[] employees = new Employee[10];
    private int size;

    public void addEmployee(String name, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, в хранилище закончилось место");
        }
        Employee newEmployee = new Employee(name, department, salary);
        employees[size++] = newEmployee;
    }

    public int getCurrentSize() {
        return size;
    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public void printAllEmployeeName() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getName());
        }
    }

    public void costAmount() {
        int costAmount = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            costAmount += employee.getSalary();
        }
        System.out.println("Сумма выплат на ЗП в месяц составляет : " + costAmount);
    }

    public void minSalary() {
        int minCost = 30_000;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < minCost) {
                minCost = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата составляет : " + minCost);
    }

    public void maxSalary() {
        int maxCost = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > maxCost) {
                maxCost = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата составляет : " + maxCost);
    }

    public void AverageSalary() {
        int costAmount = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            costAmount += employee.getSalary();
        }
        System.out.println("Средняя ЗП : " + costAmount / size);
    }
}
