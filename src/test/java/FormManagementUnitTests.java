import static org.junit.jupiter.api.Assertions.assertThrows;

import com.docusign.webforms.api.*;
import com.docusign.webforms.client.*;
import com.docusign.webforms.client.auth.OAuth;
import com.docusign.webforms.model.*;
import java.util.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

/** @author avinash.rai */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormManagementUnitTests {

  private static final String userId = System.getenv("USER_ID");
  private static final String integratorKey = System.getenv("INTEGRATOR_KEY_JWT");
  private static final byte[] privateKeyBytes =
      Base64.getDecoder().decode(System.getenv("PRIVATE_KEY"));
  private static final long expiresInHours = 3600;
  private static String accountId;
  private static String formId;

  public FormManagementUnitTests() {}

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
      WebFormSummaryList webforms = formManagementApi.listForms(accountId);
      WebFormSummary publishedWebForm =
          webforms.getItems().stream().filter(x -> !x.isIsPublished()).findAny().get();

      formId = publishedWebForm.getId();

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

  @Test
  public void listForms_ShouldReturnForms_WithValidAccountId() {
    // Arrange
    FormManagementApi formManagementApi =
        new FormManagementApi(Configuration.getDefaultApiClient());
    WebFormSummaryList formSummaryList = null;

    // Act
    try {
      formSummaryList = formManagementApi.listForms(accountId);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertNotNull("The list of forms should not be null.", formSummaryList);
    Assert.assertTrue(
        "The list of forms should not be empty.", formSummaryList.getItems().size() != 0);
  }

  @Test
  public void listForms_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    String invalidAccountId = UUID.randomUUID().toString();
    FormManagementApi formManagementApi =
        new FormManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formManagementApi.listForms(invalidAccountId);
        });
  }

  @Test
  public void listFormsWithHttpInfo_ShouldReturnForms_WithValidAccountId() {
    // Arrange
    FormManagementApi formManagementApi =
        new FormManagementApi(Configuration.getDefaultApiClient());
    ApiResponse<WebFormSummaryList> formSummaryResponse = null;

    // Act
    try {
      formSummaryResponse = formManagementApi.listFormsWithHttpInfo(accountId, null);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertTrue(formSummaryResponse.getStatusCode() == 200);
    Assert.assertNotNull("The list of forms should not be null.", formSummaryResponse.getData());
    Assert.assertTrue(
        "The list of forms should not be empty.",
        formSummaryResponse.getData().getItems().size() != 0);
  }

  @Test
  public void getForm_ShouldReturnForm_WithValidAccountId_FormId() {
    // Arrange
    FormManagementApi formManagementApi =
        new FormManagementApi(Configuration.getDefaultApiClient());
    WebForm webForm = null;

    // Act
    try {
      webForm = formManagementApi.getForm(accountId, formId);
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertNotNull("Form Object cannot be null", webForm);
    Assert.assertTrue(
        "WebformId in request and response should match",
        formId.toString().equals(webForm.getId()));
  }

  @Test
  public void getForm_ShouldThrowApiException_WithInvalidAccountId() {
    // Arrange
    String invalidAccountId = UUID.randomUUID().toString();
    FormManagementApi formManagementApi =
        new FormManagementApi(Configuration.getDefaultApiClient());

    assertThrows(
        ApiException.class,
        () -> {
          formManagementApi.getForm(invalidAccountId, formId);
        });
  }

  @Test
  public void getFormsWithHttpInfo_ShouldReturnForm_WithValidAccountId() {
    // Arrange
    FormManagementApi formManagementApi =
        new FormManagementApi(Configuration.getDefaultApiClient());
    ApiResponse<WebForm> formResponse = null;

    // Act
    try {
      formResponse = formManagementApi.getFormWithHttpInfo(accountId, formId, null);

    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }

    // Assert
    Assert.assertTrue(formResponse.getStatusCode() == 200);
    Assert.assertNotNull("The list of forms should not be null.", formResponse.getData());
    Assert.assertTrue(
        "WebformId in request and response should match",
        formId.toString().equals(formResponse.getData().getId()));
  }
}
