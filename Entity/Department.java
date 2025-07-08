package entity;
import java.util.ArrayList;
import java.util.List;

public  class Department {
    private String departmentId;
    private String departmentName;
    private String departmentAddress;
    List<Department> listDepartment = new ArrayList<>();

    public Department() {
    }

    public Department(String departmentId, String departmentName, String departmentAddress) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }
}

