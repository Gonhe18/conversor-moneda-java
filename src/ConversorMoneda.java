import java.util.Map;

public record ConversorMoneda(Map<String, Double> conversion_rates, Integer time_last_update_unix) {
}
