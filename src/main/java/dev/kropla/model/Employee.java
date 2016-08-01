package dev.kropla.model;

/**
 * Created by kropla on 05.07.16.
 */
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    private String employeeId;
    private String employeeName;
    private String employeePhone;

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

}