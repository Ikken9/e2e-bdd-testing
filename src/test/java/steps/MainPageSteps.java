package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import org.example.pages.MainPage;

@RequiredArgsConstructor
public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Given("que el usuario navega a la página principal de TMDB")
    public void openTMDB() {
        mainPage.openMainPage();
    }

    @When("busca la serie {string}")
    public void searchFilm(String seriesName) {
        mainPage.search(seriesName);
    }
}
