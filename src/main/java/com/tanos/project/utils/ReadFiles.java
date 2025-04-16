package com.tanos.project.utils;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ReadFiles {

    public static final String EDGE = "Edge";
    public static final String CHROME = "Chrome";
    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    public static final String DEFAULT_BROWSER = CONF.getProperty("config.browser.default");
    private static final String CONFIG_DATA = "data.";
}
