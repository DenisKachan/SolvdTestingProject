package com.solvd.testingProject.commonDomain;

import com.zebrunner.carina.utils.R;

public enum OnlinerColors {

    YELLOW(R.TESTDATA.get("colorNameY"), R.TESTDATA.get("colorCodeY")),
    ORANGE(R.TESTDATA.get("colorNameO"), R.TESTDATA.get("colorCodeO"));

    private final String colorName;
    private final String colorCode;

    OnlinerColors(String colorName, String colorCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public String getColorCode() {
        return colorCode;
    }
}
