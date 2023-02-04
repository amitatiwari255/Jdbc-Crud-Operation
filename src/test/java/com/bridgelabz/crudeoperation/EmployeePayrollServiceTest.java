package com.bridgelabz.crudeoperation;
import com.crudoperation.EmployeePayrollService.IOSevice;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
public class EmployeePayrollServiceTest {
    private static final IOSevice DB_IO = null;
    @Test
    public void givenEmployeePayrollInDB_WhenRetrived_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
        Assert.assertEquals(3, employeePayrollData.size());
    }
}
