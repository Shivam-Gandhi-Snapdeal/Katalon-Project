import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.snapdeal.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Existence of Symbol/Page_Digital Entertainment Buy Digi/a_Donate stationery kits'), 
    10)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Existence of Symbol/Page_Digital Entertainment Buy Digi/a_Donate stationery kits'), 
    0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Digital Entertainment Buy Digi/a_Donate stationery kits'))
}

WebUI.waitForElementPresent(findTestObject('Existence of Symbol/Page_Online Shopping Site in India/a_Gift Cards'), 5)

if (WebUI.verifyElementPresent(findTestObject('Existence of Symbol/Page_Online Shopping Site in India/a_Gift Cards'), 0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Online Shopping Site in India/a_Gift Cards'))
}

WebUI.waitForElementPresent(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/span_Help Center'), 5)

if (WebUI.verifyElementPresent(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/span_Help Center'), 
    0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/span_Help Center'))

    WebUI.back()
}

WebUI.waitForElementPresent(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/a_Sell On Snapdeal'), 
    5)

if (WebUI.verifyElementPresent(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/a_Sell On Snapdeal'), 
    0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/a_Sell On Snapdeal'))

    WebUI.back()
}

WebUI.waitForElementPresent(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/a_Download App'), 5)

if (WebUI.verifyElementPresent(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/a_Download App'), 
    0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Contribute stationery kits at/a_Download App'))
}

WebUI.waitForElementPresent(findTestObject('Existence of Symbol/Page_Deals of the Day Snapdeal Offe/div_Cart0'), 5)

if (WebUI.verifyElementPresent(findTestObject('Existence of Symbol/Page_Deals of the Day Snapdeal Offe/div_Cart0'), 0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Deals of the Day Snapdeal Offe/div_Cart0'))

    WebUI.back()
}

WebUI.waitForElementPresent(findTestObject('Existence of Symbol/Page_Deals of the Day Snapdeal Offe/div_Sign In'), 5)

if (WebUI.verifyElementPresent(findTestObject('Existence of Symbol/Page_Deals of the Day Snapdeal Offe/div_Sign In'), 0)) {
    WebUI.click(findTestObject('Existence of Symbol/Page_Deals of the Day Snapdeal Offe/div_Sign In'))
}

WebUI.closeBrowser()

