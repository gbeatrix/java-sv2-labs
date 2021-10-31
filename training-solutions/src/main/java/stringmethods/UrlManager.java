package stringmethods;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url){
        String urlWithoutQuery = setQuery(url);
        String urlHostPortPath = setProtocol(urlWithoutQuery);
        path = setHostAndPort(urlHostPortPath);
    }

    private String setQuery(String url){
        int pos = url.indexOf("?");
        query = pos>=0?url.substring(pos+1):null;
        return pos>=0?url.substring(0, pos):url;
    }

    private String setProtocol(String url){
        int pos = url.indexOf("://");
        if(pos>=0){
            protocol = url.substring(0, pos).toLowerCase();
        }
        return pos>=0?url.substring(pos+3):url;
    }

    private String setHostAndPort(String urlWithoutProtocol){
        int pos1 = urlWithoutProtocol.indexOf(":");
        int pos2 = urlWithoutProtocol.indexOf("/");
        if(pos1>=0 && pos1<pos2){
            port = Integer.valueOf(urlWithoutProtocol.substring(pos1+1, pos2));
        } else if(pos1>=0 && pos2<0) {
            port = Integer.valueOf(urlWithoutProtocol.substring(pos1+1));
        }
        if(pos1>0) {
            host = urlWithoutProtocol.substring(0, pos1).toLowerCase();
        } else if(pos2>0) {
            host = urlWithoutProtocol.substring(0, pos2).toLowerCase();
        } else {
            host = urlWithoutProtocol.toLowerCase();
        }
        if(pos2>=0) {
            return urlWithoutProtocol.substring(pos2 + 1);
        } else {
            return null;
        }
    }

    public boolean hasProperty(String key){
        if(query!=null && (query.startsWith(key + '=') || query.contains('&' + key + '='))) {
            return true;
        }
        return false;
    }

    public String getProperty(String key){
        if(query!=null) {
            String[] properties = query.split("&");
            for (String property : properties) {
                int posEq = property.indexOf('=');
                if (posEq < 0 && property.equals(key)) {
                    return "";
                } else if (posEq >= 0 && property.substring(0, posEq).equals(key)) {
                    return property.substring(posEq + 1);
                }
            }
        }
        return null;
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public static void main(String[] args) {
        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        System.out.println("protocol: " + urlManager.getProtocol());
        System.out.println("host: " + urlManager.getHost());
        System.out.println("port: " + urlManager.getPort());
        System.out.println("path: " + urlManager.getPath());
        System.out.println("format = " + urlManager.getProperty("format"));
        System.out.println("starttime = " + urlManager.getProperty("starttime"));
        System.out.println("has endtime: " + urlManager.hasProperty("endtime"));
        System.out.println("has param: " + urlManager.hasProperty("param"));
    }
}
