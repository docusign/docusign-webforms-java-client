import com.docusign.webforms.api.*;
import com.docusign.webforms.client.*;
import com.docusign.webforms.model.*;
import java.util.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

/** @author majid.mallis */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SdkUnitTests {

  // private static final String UserName = System.getenv("USER_NAME");
  // private static final String UserId = System.getenv("USER_ID");
  // private static final String IntegratorKey = System.getenv("INTEGRATOR_KEY_JWT");

  // private static final String BaseUrl = "https://demo.services.docusign.net/webforms/v1.1";
  // private static final byte[] privateKeyBytes =
  //     Base64.getDecoder().decode(System.getenv("PRIVATE_KEY"));
  // private static final String brandLogoFullPath =
  //     System.getProperty("user.dir") + "/src/test/docs/DS.png";
  // private static final String brandFullPath =
  //     System.getProperty("user.dir") + "/src/test/docs/brand.xml";

  // private static final String SignTest1File = "/src/test/docs/SignTest1.pdf";
  // private static final String TemplateId = System.getenv("TEMPLATE_ID");
  // private static final String BrandId = System.getenv("BRAND_ID");
  // private String[] envelopeIds = new String[0];
  // JUnit 4.12 runs test cases in parallel, so the envelope ID needs to be initiated as well.
  private String AccountId = "temp-accountId";

  public SdkUnitTests() {}

  @BeforeClass
  public static void setUpClass() {}

  @AfterClass
  public static void tearDownClass() {}

  @Before
  public void setUp() {
    // if (envelopeIds.length == 0) {
    //   envelopeIds = getLastTenEnvelopeIds();
    // }

    AccountId = "temp-accountId";
    // if (AccountId.isEmpty()) {
    //   AccountId = initApiClient();
    // }
  }

  @After
  public void tearDown() {}

  //   try {
  //     java.util.List<String> scopes = new ArrayList<>();
  //     scopes.add(OAuth.Scope_SIGNATURE);
  //     scopes.add(OAuth.Scope_IMPERSONATION);

  //     OAuth.OAuthToken oAuthToken =
  //         apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
  //     Assert.assertNotNull(oAuthToken);
  //     // now that the API client has an OAuth token, let's use it in all
  //     // DocuSign APIs
  //     apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
  //     UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
  //     Assert.assertNotNull(userInfo);
  //     Assert.assertNotNull(userInfo.getAccounts());
  //     Assert.assertTrue(userInfo.getAccounts().size() > 0);

  //     System.out.println("UserInfo: " + userInfo);
  //     // parse first account's baseUrl
  //     // below code required for production, no effect in demo (same
  //     // domain)
  //     apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
  //     Configuration.setDefaultApiClient(apiClient);
  //   } catch (ApiException ex) {
  //     Assert.fail("Exception: " + ex);
  //   } catch (Exception e) {
  //     Assert.fail("Exception: " + e.getLocalizedMessage());
  //   }
  // }

  @Test
  public void ListDocuments() {
    try {
      String BaseUrl = "https://demo.services.docusign.net/webforms/v1.1";
      ApiClient apiClient = new ApiClient(BaseUrl);
      apiClient.setAccessToken(
          "Bearer temp-token",
          (long) 5000000);
      // UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      // System.out.println("userInfo: " + userInfo);
      FormManagementApi formManagementApi = new FormManagementApi();
      UUID AccountIdUuid = UUID.fromString(AccountId);
      WebFormSummaryList forms = formManagementApi.listForms(AccountIdUuid);

      Assert.assertNotNull(forms);
      // Assert.assertNotNull(users.getUsers());

      // System.out.println("forms: " + forms);
    } catch (ApiException ex) {
      System.err.println("##########Exception#############: " + ex.getMessage());
      Assert.fail("Exception: " + ex.getLocalizedMessage());
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }
}
