package stringmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlManagerTest {
    @Test
    void testUrlManager(){
        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertNull(urlManager.getPort());
        assertEquals("fdsnws/event/1/query", urlManager.getPath());
        assertEquals("geojson", urlManager.getProperty("format"));
        assertEquals("2014-01-01", urlManager.getProperty("starttime"));
        assertTrue(urlManager.hasProperty("endtime"));
        assertFalse(urlManager.hasProperty("param"));

        urlManager = new UrlManager("http://127.0.0.1:5500/index.HTML");
        assertEquals("http", urlManager.getProtocol());
        assertEquals("127.0.0.1", urlManager.getHost());
        assertEquals(5500, urlManager.getPort());
        assertEquals("index.HTML", urlManager.getPath());
        assertNull(urlManager.getProperty("param"));
        assertFalse(urlManager.hasProperty("param"));

        urlManager = new UrlManager("HTTP://LOCALHOST:631");
        assertEquals("http", urlManager.getProtocol());
        assertEquals("localhost", urlManager.getHost());
        assertEquals(631, urlManager.getPort());
        assertNull(urlManager.getPath());
    }
}