package util;

public enum BrowserType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("microsoftEdge");

    private final String browser;

    BrowserType(String browser) {
        this.browser = browser;

    }
}
