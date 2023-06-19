public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addEmployee("Иванов Иван Иванович ", 1, 20000);
        storage.addEmployee("Петров Петр Петрович ", 1, 22000);
        storage.addEmployee("Фудоров Федор Федорович ", 2, 22000);
        storage.addEmployee("Алексеев Алексей Алексеевич ", 2, 24000);
        storage.addEmployee("Александров Александр Александрович ", 3, 24000);
        storage.addEmployee("Николаев Николай Николаевич ", 3, 26000);
        storage.addEmployee("Родионов Родион Родионович ", 4, 26000);
        storage.addEmployee("Сергеев Сергей Сергеевич ", 4, 28000);
        storage.addEmployee("Дмитриев Дмитрий Дмитриевич ", 5, 28000);
        storage.addEmployee("Павлов Павел Павлович ", 5, 30000);

        storage.printAllEmployee();
        System.out.println("storage.calculateCostAmount() = " + storage.calculateCostAmount());
        System.out.println("storage.findEployeeWithMinSalary() = " + storage.findEployeeWithMinSalary());
        System.out.println("storage.findEployeeWithMaxSalary() = " + storage.findEployeeWithMaxSalary());
        System.out.println("storage.findAverageSalary() = " + storage.findAverageSalary());
        storage.printAllEmployeeName();
        // Методы для повышенной сложности
        storage.indexSalary(22);// индексируем зп на 22% всем сотрудникам
        storage.findDeptMinSalary(3);
        storage.findDeptMaxSalary(5);
        storage.calculateDeptCostAmount(2);
        storage.calculareDeptAverageSalary(1);
        storage.printDeptAllEmployee(4);
        storage.findBeggarEmployee(25000);
        storage.findRichEmployee(32000);


    }
}
