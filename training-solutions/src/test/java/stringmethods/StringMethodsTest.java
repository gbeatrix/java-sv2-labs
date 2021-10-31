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

    @Test
    public void testUrlManager(){
        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        assertThat(urlManager.getProtocol(), equalTo("https"));
        assertThat(urlManager.getHost(), equalTo("earthquake.usgs.gov"));
        assertThat(urlManager.getPort(), equalTo(null));
        assertThat(urlManager.getPath(), equalTo("fdsnws/event/1/query"));
        assertThat(urlManager.getProperty("format"), equalTo("geojson"));
        assertThat(urlManager.getProperty("starttime"), equalTo("2014-01-01"));
        assertThat(urlManager.hasProperty("endtime"), equalTo(true));
        assertThat(urlManager.hasProperty("param"), equalTo(false));

        urlManager = new UrlManager("http://127.0.0.1:5500/index.HTML");
        assertThat(urlManager.getProtocol(), equalTo("http"));
        assertThat(urlManager.getHost(), equalTo("127.0.0.1"));
        assertThat(urlManager.getPort(), equalTo(5500));
        assertThat(urlManager.getPath(), equalTo("index.HTML"));
        assertThat(urlManager.getProperty("param"), equalTo(null));
        assertThat(urlManager.hasProperty("param"), equalTo(false));

        urlManager = new UrlManager("HTTP://LOCALHOST:631");
        assertThat(urlManager.getProtocol(), equalTo("http"));
        assertThat(urlManager.getHost(), equalTo("localhost"));
        assertThat(urlManager.getPort(), equalTo(631));
        assertThat(urlManager.getPath(), equalTo(null));
    }
}
