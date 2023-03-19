import org.example.Test2.services.RestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
     public void shouldCalculateRest(int expected , int threshold , int expenses , int income) {
        RestService service = new RestService();
        //int threshold = 20000;
        //int expenses = 3000;
        //int income = 10000;
        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }

}
