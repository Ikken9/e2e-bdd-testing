package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.FilmDetailsPage;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;

public class FilmDetailsPageSteps {
    private final FilmDetailsPage filmDetailsPage;

    public FilmDetailsPageSteps() {
        this.filmDetailsPage = new FilmDetailsPage();
    }

    @Then("debería ver que el creador es {string}")
    public void checkAuthor(String expectedAuthor) {
        String author = filmDetailsPage.getAuthor();
        Assertions.assertEquals(expectedAuthor, author, "Author does not match expected value");
    }

    @And("que hay al menos {int} temporadas")
    public void checkSeasons(int minSeasons) {
        int seasons = filmDetailsPage.getSeasons();
        Assertions.assertTrue(seasons >= minSeasons);
    }

    @Then("toma una captura de pantalla del resultado")
    public void takeScreenshot() throws IOException {
        filmDetailsPage.takeScreenshot();
    }
}