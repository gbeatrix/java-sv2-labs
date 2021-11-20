package stringconcat.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testEmployee(){
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520000);
        assertEquals("Kis Géza - minőségellenőr - 520000 Ft", employee.toString());
    }
}
