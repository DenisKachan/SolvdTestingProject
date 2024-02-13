java -Dwebdriver.chrome.driver=chromedriver -jar selenium-server-4.17.0.jar standalone
appium -pa /wd/hub
"appium:platformName": "ANDROID",
"appium:deviceName": "pixel_3a",
"appium:automationName": "uiautomator2"