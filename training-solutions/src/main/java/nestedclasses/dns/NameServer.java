package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        if (getDnsEntryByName(hostName) != null || getDnsEntryByIp(hostIp) != null) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        DnsEntry dnsEntry = getDnsEntryByName(hostName);
        if (dnsEntry != null) {
            dnsEntries.remove(dnsEntry);
        }
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry dnsEntry = getDnsEntryByIp(hostIp);
        if (dnsEntry != null) {
            dnsEntries.remove(dnsEntry);
        }
    }

    public String getIpByName(String hostName) {
        DnsEntry dnsEntry = getDnsEntryByName(hostName);
        if (dnsEntry == null) {
            throw new IllegalArgumentException("Element not found");
        } else {
            return dnsEntry.ip;
        }
    }

    public String getNameByIp(String hostIp) {
        DnsEntry dnsEntry = getDnsEntryByIp(hostIp);
        if (dnsEntry == null) {
            throw new IllegalArgumentException("Element not found");
        } else {
            return dnsEntry.name;
        }
    }

    private DnsEntry getDnsEntryByName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.name.equals(hostName)) {
                return dnsEntry;
            }
        }
        return null;
    }

    private DnsEntry getDnsEntryByIp(String hostIp) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.ip.equals(hostIp)) {
                return dnsEntry;
            }
        }
        return null;
    }

    private static class DnsEntry {
        private String name;
        private String ip;

        public DnsEntry(String name, String ip) {
            if (name == null || ip == null) {
                throw new NullPointerException("Domain and IP cannot be null");
            }
            this.name = name;
            this.ip = ip;
        }
    }
}
