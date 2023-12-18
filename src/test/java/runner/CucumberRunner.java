package runner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/features",
//        glue = "stepdefinitions")
//public class CucumberRunner {
//}


import io.cucumber.core.cli.Main;

public class CucumberRunner {

    public static void main(String[] args) {
        // Provide the path to your feature files as arguments
        String[] arguments = {
                "src/test/resources/features",  // path to your feature files
                "--glue", "stepdefinitions",  // package where your step definitions are located
                "--plugin", "pretty",  // specify the output format (e.g., "pretty", "json:target/cucumber.json")
                "--strict"  // fail if there are undefined or pending steps
        };

        // Run Cucumber scenarios
        byte exitStatus = Main.run(arguments, Thread.currentThread().getContextClassLoader());
        System.exit(exitStatus);
    }
}

