package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml",
                "rerun:TestOutput/failed_scenario.txt"
                // rerun plugini ile fail olan scenariolari burada belirtmis oldugumuz failed_scenario.txt dosyasi icinde tutariz
        },
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinitions", "techproed/hooks"},
        tags = "@US012",
        dryRun = false,
        monochrome = false//eger true kullanirsak konsoldaki ciktilari tek renk siyah olarak verir
)
public class ParallelRunner2 {
}
/*
    dryRun parametresi eger true secili ise scenariolari calistirmadan feature file daki steplerin eksik
    stepdefinitioni olup olmadigini kontrol eder, browseri acmaz testi gercekten calistirmaz
 */