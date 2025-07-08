package Controller;

public interface EmployeeManagamentController {
    void addEmployee();
    void showEmployee();
    void updateEmployee();
    void deleteEmployee();
    
    // Các phương thức mới cho menu
    void showMenu();
    void runMenu();
    void addDepartment();
    void updateDepartment();
    void showAllDepartments();
    void showAllEmployees();
    void showEmployeesByDepartment();
    void showManagersAndViceManagers();
    void calculateTotalSalaryByDepartment();
}
