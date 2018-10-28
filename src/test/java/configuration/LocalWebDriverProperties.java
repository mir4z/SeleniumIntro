package configuration;

import util.BrowserType;

public class LocalWebDriverProperties {

    public static BrowserType getBrowser() {
        return BrowserType.valueOf(ConfigurationProperties.getProperties().getProperty("browser"));
    }

    public static boolean getIsRemoteRun() {
        return Boolean.parseBoolean(ConfigurationProperties.getProperties().getProperty("is.remote.run"));
    }

    public static String getChromeWebDriverLocation() {
        return ConfigurationProperties.getProperties().getProperty("chrome.driver.location");
    }

    public static String getFirefoxWebDriverLocation() {
        return ConfigurationProperties.getProperties().getProperty("firefox.driver.location");
    }

    public static String getEdgeWebDriverLocation() {
        return ConfigurationProperties.getProperties().getProperty("edge.driver.location");
    }



}
