import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('your_site/login_user/Validar el funcionamiento del login para un usuario cuando sus datos son correctos'), 
    [('url') : 'http://opencart.abstracta.us/index.php?route=common/home', ('email') : 'email123123@gmail.com', ('password') : 'clave1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('your_site/landing_page/class_nav/class_elements', [('class_element') : class_element]))

if (WebUI.verifyElementVisible(findTestObject('your_site/landing_page/class_nav/sub_class_elements', [('sub_class_element') : sub_class_element]))) {
    WebUI.click(findTestObject('your_site/landing_page/class_nav/sub_class_elements', [('sub_class_element') : sub_class_element]))
}

WebUI.verifyElementPresent(findTestObject('your_site/landing_page/item/item_selected', [('title') : title_element]), 0)

data_element.putAt('name', WebUI.getText(findTestObject('your_site/landing_page/item/item_selected_title', [('title') : title_element])))

data_element.putAt('description', WebUI.getText(findTestObject('your_site/landing_page/item/item_selected_description', 
            [('title') : title_element])))

data_element.putAt('price', WebUI.getText(findTestObject('your_site/landing_page/item/item_selected_price', [('title') : title_element])))

WebUI.click(findTestObject('your_site/landing_page/item/add_to_cart_item_selected', [('title') : title_element]))

WebUI.verifyElementVisible(findTestObject('your_site/landing_page/item/mssg_shopping_cart_item_selected', [('title') : data_element.getAt('name')]))

WebUI.click(findTestObject('your_site/landing_page/my_account_shop_cart'))

WebUI.verifyElementPresent(findTestObject('your_site/shopping cart/title_item', [('title') : data_element.getAt('name')]), 0)

