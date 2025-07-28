package steps;

import io.cucumber.java.en.And;
import org.example.pages.ResultsPage;

public class ResultPageSteps {
    private final ResultsPage resultsPage;

    public ResultPageSteps() {
        this.resultsPage = new ResultsPage();
    }

    @And("accede a la página de detalles del show")
    public void goToDetails() {
        resultsPage.goToResultDetails();
    }
}
