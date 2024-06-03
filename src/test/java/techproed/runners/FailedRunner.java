package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"
                // rerun plugini ile fail olan scenariolari burada belirtmis oldugumuz failed_scenario.txt dosyasi icinde tutariz
        },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinitions", "techproed/hooks"},
        dryRun = false,
        monochrome = false//eger true kullanirsak konsoldaki ciktilari tek renk siyah olarak verir
        /*
        Bu classda sadece fail olan scenariolari calistiracağımiz icin feature parametresine features packaginin yolunu vermek yerine
        fail scenariolarimizi bulundugu txt dosyamizin yolunu beliritiriz
        ve dosya yolu belirttigimiz icin @ sembolu koyariz
        bu classta sadece fail olan scenariolari calistiracagımız icin tags parametresine ihtiyac yoktur
         */

)
public class FailedRunner {
}
/*
    dryRun parametresi eger true secili ise scenariolari calistirmadan feature file daki steplerin eksik
    stepdefinitioni olup olmadigini kontrol eder, browseri acmaz testi gercekten calistirmaz
 */