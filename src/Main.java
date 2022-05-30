public class Main {
    private static final Employee [] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {

        EMPLOYEES [0] = new Employee("Иванов Иван Иванович", 1, 100000);
        EMPLOYEES [1] = new Employee("Петров Петр Петрович", 2, 121000);
        EMPLOYEES [2] = new Employee("Попов Павел Павлович", 3, 110500);
        EMPLOYEES [3] = new Employee("Зайцев Андрей Андреевич", 4, 204400);
        EMPLOYEES [4] = new Employee("Зайцев Алексей Андреевич", 5, 122000);
        EMPLOYEES [5] = new Employee("Ильин Илья Ильич", 1, 98430);
        EMPLOYEES [6] = new Employee("Ланге Александр Александрович", 2, 120900);
        EMPLOYEES [7] = new Employee("Гусева Маргарита Ивановна", 3, 100500);
        EMPLOYEES [8] = new Employee("Пурпурная Марфа Петровна", 4, 205000);
        EMPLOYEES [9] = new Employee("Истина Алена Генадьевна", 5, 115000);

        printAllEmployees();
        double totalSalaries = totalSalaries();
        System.out.println("Сумма затрат на ЗП всех сотрудников в месяц: " + totalSalaries);
        System.out.println("Сотрудник с минимальной ЗП: " + employeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + employeeWithMaxSalary());
        System.out.println("Средняя ЗП всех сотрудников за месяц: " + averageSalary());
        printFullNameEmployees();

    }

    private static void printAllEmployees(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static double totalSalaries(){
        double sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum+=employee.getSalary();
        }
        return sum;
    }
    private static Employee employeeWithMinSalary (){
        double minSalary = 1000000;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if(EMPLOYEES[i].getSalary()<minSalary){
                minSalary = EMPLOYEES[i].getSalary();
                index = i;
            }
        }
        if(index!=-1){
            return EMPLOYEES[index];
        }else {
            return null;
        }

    }
    private static Employee employeeWithMaxSalary (){
        double maxSalary = 0;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if(EMPLOYEES[i].getSalary()>maxSalary){
                maxSalary = EMPLOYEES[i].getSalary();
                index = i;
            }
        }
        if(index!=-1){
            return EMPLOYEES[index];
        }else {
            return null;
        }

    }
    private static double averageSalary(){
        return totalSalaries()/ EMPLOYEES.length;
    }
    private static void printFullNameEmployees(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullname());
        }
    }


}