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

    public int costAmount() {
        int costAmount = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            costAmount += employee.getSalary();
        }
        return costAmount;
    }

    public Employee minSalary() {
        int minCost = 30_000;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < minCost) {
                minCost = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == minCost) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee maxSalary() {
        int maxCost = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > maxCost) {
                maxCost = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == maxCost) {
                return employees[i];
            }
        }
        return null;
    }

    public double averageSalary() {
        double costAmount = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            costAmount += employee.getSalary();
        }
        return costAmount / size;
    }

    public void salaryIndexing(int a) {
        int percent;
        int result;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            percent = (employee.getSalary() / 100) * a;
            result = employee.getSalary() + percent;
            employee.setSalary(result);
        }
    }

    public Employee deptMinSalary(int dept) {
        int min = 100_000_000;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dept) {
                if (employee.getSalary() < min) {
                    min = employee.getSalary();
                }
            }
            if (employee.getDepartment() == min) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee deptMaxSalary(int dept) {
        int max = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dept) {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                }
            }
            if (employee.getDepartment() == max) {
                return employees[i];
            }
        }
        return null;
    }

    public void deptCostAmount(int dept) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dept) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Общая сумма выплат в отделе " + dept + " составляет " + sum + " рупий");
    }

    public double deptAverageSalary(int dept) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dept) {
                sum += employee.getSalary();
                counter++;
            }
        }
        return sum / counter;
    }

    public void deptSalaryIndexing(int dept, int percent) {
        int perc;
        int result;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dept) {
                perc = (employee.getSalary() / 100) * percent;
                result = employee.getSalary() + perc;
                employee.setSalary(result);
            }
        }
    }

    public void deptAllEmployeePrint(int dept) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dept) {
                System.out.println("Ф.И.О. сотрудника : " + employee.getName() + "| Заработная плата : " + employee.getSalary());
            }
        }
    }

    public void findBeggarEmployee(int a) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < a) {
                System.out.println("Id : " + employee.getId() + " Ф.И.О. сотрудника : " + employee.getName() + "| Заработная плата : " + employee.getSalary());
            }
        }
    }

    public void findRichEmployee(int a) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= a) {
                System.out.println("Id : " + employee.getId() + " Ф.И.О. сотрудника : " + employee.getName() + "| Заработная плата : " + employee.getSalary());
            }
        }
    }

}