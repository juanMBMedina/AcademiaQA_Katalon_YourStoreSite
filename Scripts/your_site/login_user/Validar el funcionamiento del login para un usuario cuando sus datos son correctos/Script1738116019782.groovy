import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('your_site/landing_page/my_account_menu'))

WebUI.click(findTestObject('your_site/landing_page/my_account_login_option'))

WebUI.sendKeys(findTestObject('your_site/login_form/input_email'), email)

WebUI.sendKeys(findTestObject('your_site/login_form/input_password'), password)

WebUI.click(findTestObject('your_site/login_form/input_submit'))

WebUI.verifyElementVisible(findTestObject('your_site/account_page/my_account_title'))

WebUI.verifyElementVisible(findTestObject('your_site/account_page/my_orders_title'))

WebUI.verifyElementVisible(findTestObject('your_site/account_page/my_affiliate_acc_title'))

WebUI.verifyElementVisible(findTestObject('your_site/account_page/my_newsletter_title'))

