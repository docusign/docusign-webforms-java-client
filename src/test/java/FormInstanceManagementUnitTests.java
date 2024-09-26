import static org.junit.jupiter.api.Assertions.assertThrows;

import com.docusign.webforms.api.*;
import com.docusign.webforms.client.*;
import com.docusign.webforms.client.auth.OAuth;
import com.docusign.webforms.model.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;

import org.junit.*;
import org.junit.runners.MethodSorters;

/** @author avinash.rai */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormInstanceManagementUnitTests {

  private static final String userId = System.getenv("USER_ID");
  private static final String integratorKey = System.getenv("INTEGRATOR_KEY_JWT");
  private static final byte[] privateKeyBytes =
      Base64.getDecoder().decode(System.getenv("PRIVATE_KEY"));
  private static final long expiresInHours = 3600;
  private static String accountId;
  private static String formId;
  private static String webFormInstanceId;

  public FormInstanceManagementUnitTests() {}

  @BeforeClass
  public static void setUpClass() {
    try {

      ApiClient apiClient = new ApiClient();

      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add(OAuth.Scope_SIGNATURE);
      scopes.add(OAuth.Scope_IMPERSONATION);
      scopes.add("webforms_instance_write");
      scopes.add("webforms_instance_read");
      scopes.add("webforms_read");
      scopes.add("webforms_write");

      OAuth.OAuthToken tokenInfo =
          apiClient.requestJWTUserToken(
              integratorKey, userId, scopes, privateKeyBytes, expiresInHours);

      OAuth.UserInfo userInfo = apiClient.getUserInfo(tokenInfo.getAccessToken());
      Assert.assertNotNull(userInfo.getAccounts());
      accountId =
          userInfo.getAccounts().stream()
              .filter(x -> x.getIsDefault() == "true")
              .findFirst()
              .get()
              .getAccountId();

      apiClient.setAccessToken(tokenInfo.getAccessToken(), tokenInfo.getExpiresIn());
      Configuration.setDefaultApiClient(apiClient);

      FormManagementApi formManagementApi =
          new FormManagementApi(Configuration.getDefaultApiClient());
      FormInstanceManagementApi formInstanceManagementApi =
          new FormInstanceManagementApi(Configuration.getDefaultApiClient());

      // get form id from published forms
      WebFormSummaryList webforms = formManagementApi.listForms(accountId);
      WebFormSummary publishedWebForm =
          webforms.getItems().stream().filter(x -> x.isIsPublished()).findFirst().get();

      formId = publishedWebForm.getId();
      CreateInstanceRequestBody requestBody = getInstanceRequestBody();
    
      // Get webforms instance id
      WebFormInstance webformInstance =
          formInstanceManagementApi.createInstance(accountId, formId, requestBody);
      webFormInstanceId = webformInstance.getId();

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @AfterClass
  public static void tearDownClass() {
    Configuration.setDefaultApiClient(null);
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() {}

  private static CreateInstanceRequestBody getInstanceRequestBody() {
    // Arrange
    WebFormValues values = new WebFormValues();
    values.put("TextBox_vN_8TweZ", "Random Customer");
    values.put("Email_Qt2M7kwQ", "customer@domain.com");

    Tags tags = new Tags();
    tags.add("loan_application");
    tags.add("finance_dept");

    CreateInstanceRequestBody requestBody = new CreateInstanceRequestBody();
    requestBody.setClientUserId("customer_id@domain.com");
    requestBody.setAuthenticationInstant(LocalDateTime.now().toString());
    requestBody.setAuthenticationMethod(AuthenticationMethod.BIOMETRIC);
    requestBody.setAssertionId("client-1");
    requestBody.setSecurityDomain("domain.com");
    requestBody.setReturnUrl("http://www.google.com");
    requestBody.setExpirationOffset(120);
    requestBody.setTags(tags);
    requestBody.setFormValues(values);

    return requestBody;
  }

  @Test
  public void listInstances_ShouldReturnInstances_WithValidAccountId_FormId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    WebFormInstanceList webFormInstances = null;

    // Act
    try {
      webFormInstances = formInstanceManagementApi.listInstances(accountId, formId);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertNotNull("The webFormInstances should not be null.", webFormInstances);
    Assert.assertNotNull(
        "The list of instances should not be null", webFormInstances.getItems());
    Assert.assertTrue(
        "The list of instances should not be empty.", webFormInstances.getItems().size() > 0);
  }

  @Test
  public void listInstances_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    String invalidAccountId = UUID.randomUUID().toString();
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.listInstances(invalidAccountId, null);
        });
  }

  @Test
  public void listInstancesWithHttpInfo_ShouldReturnInstances_WithValidAccountId_FormId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    ApiResponse<WebFormInstanceList> apiResponse = null;

    // Act
    try {
      apiResponse = formInstanceManagementApi.listInstancesWithHttpInfo(accountId, formId, null);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertTrue(
        "The response status code should be 200 (OK).", apiResponse.getStatusCode() == 200);
    Assert.assertNotNull("The webFormInstances should not be null.", apiResponse.getData());
    Assert.assertTrue(
        "The list of instances should not be empty.", apiResponse.getData().getItems().size() > 0);
  }

  @Test
  public void listInstancesWithHttpInfo_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    String invalidAccountId = UUID.randomUUID().toString();
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.listInstancesWithHttpInfo(invalidAccountId, null, null);
        });
  }

  @Test
  public void getInstance_ShouldReturnInstances_WithValidAccountId_FormId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    WebFormInstance webForm = null;

    // Act
    try {
      webForm = formInstanceManagementApi.getInstance(accountId, formId, webFormInstanceId);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertNotNull("The webFormInstances should not be null.", webForm);
    Assert.assertTrue("The form id must be same as queried", webForm.getFormId().equals(formId));
  }

  @Test
  public void getInstance_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.getInstance(
              UUID.randomUUID().toString(),
              UUID.randomUUID().toString(),
              UUID.randomUUID().toString());
        });
  }

  @Test
  public void getInstanceWithHttpInfo_ShouldReturnInstances_WithValidAccountId_FormId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    ApiResponse<WebFormInstance> apiResponse = null;

    // Act
    try {
      apiResponse =
          formInstanceManagementApi.getInstanceWithHttpInfo(accountId, formId, webFormInstanceId);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertTrue(
        "The response status code should be 200 (OK).", apiResponse.getStatusCode() == 200);
    Assert.assertNotNull("The webFormInstances should not be null.", apiResponse.getData());
    Assert.assertTrue(
        "The form id must be same as queried", apiResponse.getData().getFormId().equals(formId));
    Assert.assertTrue(
        "The account id must be same as queried",
        apiResponse.getData().getAccountId().equals(accountId));
  }

  @Test
  public void getInstanceWithHttpInfo_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    String invalidAccountId = UUID.randomUUID().toString();
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.getInstanceWithHttpInfo(
              invalidAccountId, UUID.randomUUID().toString(), UUID.randomUUID().toString());
        });
  }

  @Test
  public void createInstance_ShouldReturnCreatedWebform_WithValidFormId_AccountId() {

    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    CreateInstanceRequestBody requestBody = getInstanceRequestBody();
    WebFormInstance webFormInstance = null;

    // Act
    try {
      webFormInstance = formInstanceManagementApi.createInstance(accountId, formId, requestBody);
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertEquals(requestBody.getClientUserId(), webFormInstance.getClientUserId());
    List<String> tags = webFormInstance.getTags();
    Assert.assertTrue(requestBody.getTags().stream().allMatch(x -> tags.contains(x)));
  }

  @Test
  public void createInstance_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.createInstance(
              UUID.randomUUID().toString(), UUID.randomUUID().toString(), getInstanceRequestBody());
        });
  }

  @Test
  public void createInstanceWithHttpInfo_ShouldReturnCreatedWebform_WithValidFormId_AccountId() {

    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    CreateInstanceRequestBody requestBody = getInstanceRequestBody();
    ApiResponse<WebFormInstance> apiResponse = null;

    // Act
    try {
      apiResponse =
          formInstanceManagementApi.createInstanceWithHttpInfo(accountId, formId, requestBody);
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertEquals(requestBody.getClientUserId(), apiResponse.getData().getClientUserId());

    List<String> tags = apiResponse.getData().getTags();
    Assert.assertTrue(requestBody.getTags().stream().allMatch(x -> tags.contains(x)));
  }

  @Test
  public void createInstanceWithHttpInfo_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.createInstanceWithHttpInfo(
              UUID.randomUUID().toString(), UUID.randomUUID().toString(), getInstanceRequestBody());
        });
  }

  @Test
  public void refreshToken_ShouldReturnWebFormInstanceOfNewToken_WithValidFormId_AccountId() {

    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    CreateInstanceRequestBody requestBody = getInstanceRequestBody();
    WebFormInstance webFormInstance = null;
    WebFormInstance refreshedWebFormInstance = null;

    // Act
    try {
      webFormInstance = formInstanceManagementApi.createInstance(accountId, formId, requestBody);

      refreshedWebFormInstance =
          formInstanceManagementApi.refreshToken(accountId, formId, webFormInstance.getId());

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertEquals(webFormInstance.getId(), refreshedWebFormInstance.getId());
    Assert.assertNotEquals(
        webFormInstance.getInstanceToken(), refreshedWebFormInstance.getInstanceToken());
  }

  @Test
  public void refreshToken_ShouldReturnApiException_WithInvalid_InstanceId() {

    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.refreshToken(accountId, formId, UUID.randomUUID().toString());
        });
  }

  @Test
  public void
      refreshTokenWithHttpInfo_ShouldReturnWebFormInstanceOfNewToken_WithValidFormId_AccountId() {

    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());
    CreateInstanceRequestBody requestBody = getInstanceRequestBody();
    WebFormInstance webFormInstance = null;
    ApiResponse<WebFormInstance> apiResponse = null;

    // Act
    try {
      webFormInstance = formInstanceManagementApi.createInstance(accountId, formId, requestBody);

      apiResponse =
          formInstanceManagementApi.refreshTokenWithHttpInfo(
              accountId, formId, webFormInstance.getId());

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertEquals(webFormInstance.getId(), apiResponse.getData().getId());
    Assert.assertNotEquals(
        webFormInstance.getInstanceToken(), apiResponse.getData().getInstanceToken());
  }

  @Test
  public void refreshTokenWithHttpInfo_ShouldReturnApiException_WithInvalid_InstanceId() {

    // Arrange
    FormInstanceManagementApi formInstanceManagementApi =
        new FormInstanceManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formInstanceManagementApi.refreshTokenWithHttpInfo(
              accountId, formId, UUID.randomUUID().toString());
        });
  }
}
