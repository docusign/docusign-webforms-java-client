package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A value that most closely matches the technique your application used to authenticate the recipient / signer.
 */
public enum AuthenticationMethod {
  
  BIOMETRIC("Biometric"),
  
  EMAIL("Email"),
  
  HTTPBASICAUTH("HTTPBasicAuth"),
  
  KERBEROS("Kerberos"),
  
  KNOWLEDGEBASEDAUTH("KnowledgeBasedAuth"),
  
  NONE("None"),
  
  PAPERDOCUMENTS("PaperDocuments"),
  
  PASSWORD("Password"),
  
  RSASECUREID("RSASecureID"),
  
  SINGLESIGNON_CASITEMINDER("SingleSignOn_CASiteminder"),
  
  SINGLESIGNON_INFOCARD("SingleSignOn_InfoCard"),
  
  SINGLESIGNON_MICROSOFTACTIVEDIRECTORY("SingleSignOn_MicrosoftActiveDirectory"),
  
  SINGLESIGNON_OTHER("SingleSignOn_Other"),
  
  SINGLESIGNON_PASSPORT("SingleSignOn_Passport"),
  
  SINGLESIGNON_SAML("SingleSignOn_SAML"),
  
  SMARTCARD("Smartcard"),
  
  SSLMUTUALAUTH("SSLMutualAuth"),
  
  X509CERTIFICATE("X509Certificate");

  private String value;

  AuthenticationMethod(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthenticationMethod fromValue(String value) {
    for (AuthenticationMethod b : AuthenticationMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

