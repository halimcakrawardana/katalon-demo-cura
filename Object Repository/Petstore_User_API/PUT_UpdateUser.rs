<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT_UpdateUser</name>
   <tag></tag>
   <elementGuidId>b5f5b735-61e3-4d4f-b784-c7837b9bb581</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: 99999,\n  \&quot;username\&quot;: \&quot;halimtest123\&quot;,\n  \&quot;firstName\&quot;: \&quot;Updated\&quot;,\n  \&quot;lastName\&quot;: \&quot;UserUpdated\&quot;,\n  \&quot;email\&quot;: \&quot;updateduser@example.com\&quot;,\n  \&quot;password\&quot;: \&quot;newPass123\&quot;,\n  \&quot;phone\&quot;: \&quot;0987654321\&quot;,\n  \&quot;userStatus\&quot;: 2\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>05c8c64b-3f63-4cf8-ba7a-85794fb0ad05</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://petstore.swagger.io/v2/user/${username}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

import groovy.json.JsonSlurper
import com.kms.katalon.core.webservice.verification.WSResponseManager

def response = WSResponseManager.getInstance().getCurrentResponse()

def json = new JsonSlurper().parseText(response.getResponseBodyContent())

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
