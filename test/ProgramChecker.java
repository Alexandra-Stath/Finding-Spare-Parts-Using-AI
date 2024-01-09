import java.util.ArrayList;
import java.util.List;
public class ProgramChecker {
    public static void main(String[] args) {
        List<String> expectedOutputs = getExpectedOutputs();
        List<String> actualOutputs = getActualOutputs();
        List<String> missingOutputs = findMissingOutputs(expectedOutputs, actualOutputs);
        List<String> unexpectedOutputs = findUnexpectedOutputs(expectedOutputs, actualOutputs);
        System.out.println("Missing outputs:");
        for (String output : missingOutputs) {
            System.out.println(output);
        }
        System.out.println("Unexpected outputs:");
        for (String output : unexpectedOutputs) {
            System.out.println(output);
        }
    }

    private static List<String> getExpectedOutputs() {
        List<String> expectedOutputs = new ArrayList<>();
        // Add the expected outputs here
        expectedOutputs.add("EXPECTED_OUTPUT_1");
        expectedOutputs.add("EXPECTED_OUTPUT_2");
    
        return expectedOutputs;
    }

    private static List<String> getActualOutputs() {
        List<String> actualOutputs = new ArrayList<>();
        // Add the actual outputs here
        actualOutputs.add("ACTUAL_OUTPUT_1");
        actualOutputs.add("ACTUAL_OUTPUT_2");
        
        return actualOutputs;
    }

    private static List<String> findMissingOutputs(List<String> expectedOutputs, List<String> actualOutputs) {
        List<String> missingOutputs = new ArrayList<>();
        for (String expectedOutput : expectedOutputs) {
            if (!actualOutputs.contains(expectedOutput)) {
                missingOutputs.add(expectedOutput);
            }
        }
        return missingOutputs;
    }

    private static List<String> findUnexpectedOutputs(List<String> expectedOutputs, List<String> actualOutputs) {
        List<String> unexpectedOutputs = new ArrayList<>();
        for (String actualOutput : actualOutputs) {
            if (!expectedOutputs.contains(actualOutput)) {
                unexpectedOutputs.add(actualOutput);
            }
        }
        return unexpectedOutputs;
    }
}
