package stringconcat.nameconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    @Test
    void testName(){
        Name gipsz = new Name("Gipsz", null, "Jakab");
        Name bodon = new Name("Zsíros", "B.", "Ödön", Title.MR);
        Name house = new Name("House", "", "Gregory", Title.DR);

        assertEquals("Gipsz Jakab", gipsz.concatNameHungarianStyle());
        assertEquals("Jakab Gipsz", gipsz.concatNameWesternStyle());
        assertEquals("Mr. Zsíros B. Ödön", bodon.concatNameHungarianStyle());
        assertEquals("Mr. Ödön B. Zsíros", bodon.concatNameWesternStyle());
        assertEquals("Dr. House Gregory", house.concatNameHungarianStyle());
        assertEquals("Dr. Gregory House", house.concatNameWesternStyle());
    }
}