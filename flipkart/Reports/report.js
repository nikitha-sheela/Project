$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/resources/features/TC_WISHLIST_001.feature");
formatter.feature({
  "line": 1,
  "name": "User WISHLIST",
  "description": "",
  "id": "user-wishlist",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "AddToCart From Wishlist",
  "description": "",
  "id": "user-wishlist;addtocart-from-wishlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Get the Title of the page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User Navigates to Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on loginlink",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Navigated to login popup",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enter UserName and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Navigates to User Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Mouse Hover On MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User click On Wishlistlink",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Navigates to WishlistPage",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Click On Product In WishlistPage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User Navigates to Product Page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User Click On AddToCart",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Product should be displayed to AddToCartPage",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartStepDefination.openTheBrowser()"
});
formatter.result({
  "duration": 10600419500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.enterTheURL()"
});
formatter.result({
  "duration": 8495222200,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.getTheTitleOfThePage()"
});
formatter.result({
  "duration": 11409700,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userNavigatesToHomePage()"
});
formatter.result({
  "duration": 18041800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userClickOnLoginlink()"
});
formatter.result({
  "duration": 421464600,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userNavigatedToLoginPopup()"
});
formatter.result({
  "duration": 89335000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userEnterUserNameAndPassword()"
});
formatter.result({
  "duration": 616986500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.clickOnLoginButton()"
});
formatter.result({
  "duration": 119288000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userNavigatesToUserHomePage()"
});
formatter.result({
  "duration": 7963300,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userMouseHoverOnMyAccount()"
});
formatter.result({
  "duration": 5217133000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userClickOnWishlistlink()"
});
formatter.result({
  "duration": 5228733500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userNavigatesToWishlistPage()"
});
formatter.result({
  "duration": 2908536500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userClickOnProductInWishlistPage()"
});
formatter.result({
  "duration": 289610200,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userNavigatesToProductPage()"
});
formatter.result({
  "duration": 9682167000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.userClickOnAddToCart()"
});
formatter.result({
  "duration": 193233300,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepDefination.productShouldBeDisplayedToAddToCartPage()"
});
formatter.result({
  "duration": 44653400,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Compound class names not permitted\n  (Session info: chrome\u003d81.0.4044.138)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-ON6835CL\u0027, ip: \u0027172.20.10.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\91837\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49624}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 81.0.4044.138, webStorageEnabled: true}\nSession ID: e14a2cd354e32316626722380e4ad10f\n*** Element info: {Using\u003dclass name, value\u003d_3gijNv col-12-12}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.flipkart.addtocartpages.AddToCartPage.validateWithProductText(AddToCartPage.java:13)\r\n\tat com.flipkart.addtocartstepdefination.AddToCartStepDefination.productShouldBeDisplayedToAddToCartPage(AddToCartStepDefination.java:103)\r\n\tat ✽.Then Product should be displayed to AddToCartPage(./src/main/resources/features/TC_WISHLIST_001.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddToCartStepDefination.userLogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCartStepDefination.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});