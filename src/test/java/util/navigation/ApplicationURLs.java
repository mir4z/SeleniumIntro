package util.navigation;

import configuration.AppProperties;

public class ApplicationURLs {
    private static final String BASE_URL = AppProperties.getAppUrl();
    public static final String MAIN_PAGE = BASE_URL + "actions/Catalog.action";
    public static final String LOGIN_PAGE = BASE_URL + "actions/Account.action?signonForm=";

}
