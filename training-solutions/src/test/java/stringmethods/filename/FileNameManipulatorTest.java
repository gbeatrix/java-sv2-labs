package stringmethods.filename;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileNameManipulatorTest {
    @Test
    void testFileNameManipulator() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        assertEquals('g', fileNameManipulator.findLastCharacter(" szöveg  "));
        assertEquals("pdf", fileNameManipulator.findFileExtension(" java.cheatsheet.pdf  "));
        assertEquals("", fileNameManipulator.findFileExtension(" javacheatsheetpdf  "));
        assertFalse(fileNameManipulator.identifyFilesByExtension(" exe  ", " java.cheatsheet.pdf "));
        assertTrue(fileNameManipulator.identifyFilesByExtension(" pdf  ", " java.cheatsheet.pdf "));
        assertFalse(fileNameManipulator.compareFilesByName(" cheatsheet.pdf ", " java.cheatsheet.pdf "));
        assertTrue(fileNameManipulator.compareFilesByName("  cheatsheet.pdf ", " cheatsheet.pdf  "));
        assertEquals("EXEfile.exe", fileNameManipulator.changeExtensionToLowerCase(" EXEfile.EXE "));
        assertEquals("Indul a görög aludni.", fileNameManipulator.replaceStringPart("Indul a török aludni.", "török", "görög"));
        assertEquals("Indul a török aludni.", fileNameManipulator.replaceStringPart("Indul a török aludni.", "görög", "török"));
    }
}
