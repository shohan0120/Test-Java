package org.selenium.script.init;

import org.selenium.script.config.GlobalValues;

public class Bootstrap {
    GlobalValues gv = new GlobalValues();
    public void init() {
        gv.getAppPropFileContent();
        gv.setDriver();
    }
}
