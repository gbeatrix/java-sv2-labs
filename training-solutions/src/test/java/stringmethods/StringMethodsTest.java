package stringmethods;

import org.junit.Test;
import stringmethods.filename.FileNameManipulator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StringMethodsTest {
    @Test
    public void testFileNameManipulator() {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        assertThat(fileNameManipulator.findLastCharacter(" szöveg  "), equalTo('g'));
        assertThat(fileNameManipulator.findFileExtension(" java.cheatsheet.pdf  "), equalTo( "pdf"));
        assertThat(fileNameManipulator.findFileExtension(" javacheatsheetpdf  "), equalTo(""));
        assertThat(fileNameManipulator.identifyFilesByExtension(" exe  ", " java.cheatsheet.pdf "), equalTo(false));
        assertThat(fileNameManipulator.identifyFilesByExtension(" pdf  ", " java.cheatsheet.pdf "), equalTo(true));
        assertThat(fileNameManipulator.compareFilesByName(" cheatsheet.pdf ", " java.cheatsheet.pdf "), equalTo(false));
        assertThat(fileNameManipulator.compareFilesByName("  cheatsheet.pdf ", " cheatsheet.pdf  "), equalTo(true));
        assertThat(fileNameManipulator.changeExtensionToLowerCase(" EXEfile.EXE "), equalTo("EXEfile.exe"));
        assertThat(fileNameManipulator.replaceStringPart("Indul a török aludni.", "török", "görög"), equalTo("Indul a görög aludni."));
        assertThat(fileNameManipulator.replaceStringPart("Indul a török aludni.", "görög", "török"), equalTo("Indul a török aludni."));
    }
}
