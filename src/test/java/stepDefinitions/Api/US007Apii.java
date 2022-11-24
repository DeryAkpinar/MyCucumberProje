package stepDefinitions.Api;

import MedunnaBaseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class US007Apii extends MedunnaBaseUrl {
    Response response;
    @Given("Kullanici\\(Patient) Medunna url gider")
    public void kullaniciPatientMedunnaUrlGider() {

        spec.pathParams("{first}","{appointments}","{second}",333185);

    }

    @When("Kullanici request istegini gonderir ve yaniti alir")
    public void kullaniciRequestIsteginiGonderirVeYanitiAlir() {
        response=given().spec(spec).when().get("{first},{second}");
        response.prettyPrint();

    }

    @And("Kullanici Api ile beklenen datalari dogrular {string}, {string},{string},{string}")
    public void kullaniciApiIleBeklenenDatalariDogrular(String arg0, String arg1, String arg2, String arg3) {



        // iv) Do Assertion (dogrulama yapmak)

        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

        // Status Code konsola yazdiralim
        System.out.println("Status Code : "+response.getStatusCode());

        // Content Type konsola yazdiralim
        System.out.println("Content Type : "+ response.getContentType());

        // Status Line konsola yaziralim
        System.out.println("Status Line : "+response.getStatusLine());

        // Header konsola yazdiralim
        System.out.println("Header : "+response.getHeader("Server"));

        // Headers konsola yazdiralim
        System.out.println("Headers : "+response.getHeaders());

        // Time konsola yazdiralim

        System.out.println("Time : "+response.getTime());

    }
    }

