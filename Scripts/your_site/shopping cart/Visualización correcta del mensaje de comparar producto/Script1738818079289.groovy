import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('your_site/login_user/Validar el funcionamiento del login para un usuario cuando sus datos son correctos'), 
    [('url') : 'http://opencart.abstracta.us/index.php?route=common/home', ('email') : 'email123123@gmail.com', ('password') : 'clave1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('your_site/landing_page/class_nav/class_elements', [('class_element') : class_element]))

if (WebUI.verifyElementVisible(findTestObject('your_site/landing_page/class_nav/sub_class_elements', [('sub_class_element') : sub_class_element]))) {
    WebUI.click(findTestObject('your_site/landing_page/class_nav/sub_class_elements', [('sub_class_element') : sub_class_element]))
}

WebUI.verifyElementPresent(findTestObject('your_site/landing_page/item/item_selected', [('title') : title_element]), 0)

name = WebUI.getText(findTestObject('your_site/landing_page/item/item_selected_title', [('title') : title_element]))

description = WebUI.getText(findTestObject('your_site/landing_page/item/item_selected_description', [('title') : title_element]))

price = WebUI.getText(findTestObject('your_site/landing_page/item/item_selected_price', [('title') : title_element]))

WebUI.click(findTestObject('your_site/landing_page/item/compare_item_selected', [('title') : title_element]))

WebUI.verifyElementVisible(findTestObject('your_site/landing_page/item/mssg_compare_item_selected', [('title') : title_element]))

