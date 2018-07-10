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

WebUI.waitForElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/span_Sign In'), 10)

WebUI.verifyElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/span_Sign In'), 0)

WebUI.click(findTestObject('Hello World/Page_Online Shopping Site in India/span_Sign In'))

WebUI.waitForElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/a_login'), 10)

WebUI.verifyElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/a_login'), 0)

WebUI.click(findTestObject('Hello World/Page_Online Shopping Site in India/a_login'))

WebUI.setText(findTestObject('Login Details/Page_Online Shopping Site in India/input_username'), PhoneNo)

WebUI.waitForElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/button_continue'), 0)

WebUI.verifyElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/button_continue'), 0)

WebUI.click(findTestObject('Login Details/Page_Online Shopping Site in India/button_continue'))

WebUI.waitForElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/button_Login Without Password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Hello World/Page_Online Shopping Site in India/button_Login Without Password'), 
    0)

WebUI.click(findTestObject('Login Details/Page_Online Shopping Site in India/button_Login Without Password'))

WebUI.closeBrowser()

