import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.tesqa.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/sqrs.csv")
    public void calcSquaresFound(int expected, int from, int to) {
        SQRService service = new SQRService();

        int actual = service.calculationOfSqr(from,to);

        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
}
