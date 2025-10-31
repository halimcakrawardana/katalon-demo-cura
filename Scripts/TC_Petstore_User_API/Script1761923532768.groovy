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

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import java.text.SimpleDateFormat

// --------------- Step 0: Generate username ---------------
def username = 'halimtest123'
println("username: " + username)

// --------------- Step 1: Create User ---------------
println("STEP 1: Create User")
def createRequest = findTestObject('Object Repository/Petstore_User_API/POST_CreateUser')
def createResponse = WS.sendRequestAndVerify(createRequest)

// verify status
WS.verifyResponseStatusCode(createResponse, 200)
def jsonCreate = new JsonSlurper().parseText(createResponse.getResponseBodyContent())
WS.comment("Create response: " + jsonCreate.toString())
println(jsonCreate)

// --------------- Step 2: Get User ---------------
println("STEP 2: Get User")
def getRequest = findTestObject('Object Repository/Petstore_User_API/GET_GetUserByUsername', [('username') : username])
def getResponse = WS.sendRequestAndVerify(getRequest)
WS.verifyResponseStatusCode(getResponse, 200)
def jsonGet = new JsonSlurper().parseText(getResponse.getResponseBodyContent())
WS.verifyEqual(jsonGet.username, username)
WS.verifyEqual(jsonGet.firstName, "Test")
WS.verifyEqual(jsonGet.email, username + "@example.com")
WS.comment("Get response OK: " + jsonGet.toString())

// --------------- Step 3: Update User ---------------
println("STEP 3: Update User")
def updateRequest = findTestObject('Object Repository/Petstore_User_API/PUT_UpdateUser', [('username') : username])
def updateResponse = WS.sendRequestAndVerify(updateRequest)
WS.verifyResponseStatusCode(updateResponse, 200)
WS.comment("Update response status OK")
//
// --------------- Step 4: Verify Update ---------------
println("STEP 4: Verify updated details")
def getUpdatedResponse = WS.sendRequestAndVerify(getRequest) // same getRequest using username variable
WS.verifyResponseStatusCode(getUpdatedResponse, 200)
def jsonUpdated = new JsonSlurper().parseText(getUpdatedResponse.getResponseBodyContent())
//WS.verifyEqual(jsonUpdated.firstName, "Updated")
//WS.verifyEqual(jsonUpdated.email, "updateduser@example.com")
WS.comment("Updated user verified: " + jsonUpdated.toString())

// --------------- delete user ---------------

//def deleteRequest = findTestObject('Object Repository/Petstore_User_API/DELETE_DeleteUser', [('username') : username])
//def deleteResp = WS.sendRequest(deleteRequest)
//println("===== RAW RESPONSE BODY =====")
//println(deleteResp.getResponseBodyContent())
//WS.delay(5)
//WS.verifyResponseStatusCode(deleteResp, 200)
