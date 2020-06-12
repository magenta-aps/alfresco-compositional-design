package dk.magenta.alfresco.platformsample.model;

import java.util.Map;

public class AppInfoModelB {

    private String name;
    private String version;
    private Map<String, String> phoneNumbers;

    public AppInfoModelB(String name, String version, Map<String, String> phoneNumbers) {
        this.name = name;
        this.version = version;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
