package stringconcat;

import org.junit.Test;
import stringconcat.employee.Employee;
import stringconcat.nameconcat.Name;
import stringconcat.nameconcat.Title;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StringConcatTest {
    @Test
    public void testEmployee(){
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520000);
        assertThat(employee.toString(), equalTo("Kis Géza - minőségellenőr - 520000 Ft"));
    }

    @Test
    public void testName(){
        Name gipsz = new Name("Gipsz", null, "Jakab");
        Name bodon = new Name("Zsíros", "B.", "Ödön", Title.MR);
        Name house = new Name("House", "", "Gregory", Title.DR);

        assertThat(gipsz.concatNameHungarianStyle(), equalTo("Gipsz Jakab"));
        assertThat(gipsz.concatNameWesternStyle(), equalTo("Jakab Gipsz"));
        assertThat(bodon.concatNameHungarianStyle(), equalTo("Mr. Zsíros B. Ödön"));
        assertThat(bodon.concatNameWesternStyle(), equalTo("Mr. Ödön B. Zsíros"));
        assertThat(house.concatNameHungarianStyle(), equalTo("Dr. House Gregory"));
        assertThat(house.concatNameWesternStyle(), equalTo("Dr. Gregory House"));

    }
}
