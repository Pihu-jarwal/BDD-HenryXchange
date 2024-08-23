package utils;

import static java.lang.System.getProperty;
import static java.lang.System.getenv;
import static java.util.Optional.ofNullable;
import static org.apache.logging.log4j.LogManager.getLogger;

import java.nio.file.Path;

import data.Transactions;
import org.apache.logging.log4j.Logger;

public class DataUtils {
    private static final Logger LOGGER = getLogger ();
    private static Transactions transactionsData;

    public static Transactions loadTransactionsData() {
        LOGGER.traceEntry ();
        if (transactionsData == null){
            final var defaultPath = Path.of (getProperty("user.dir"), "src/test/resources/test_data/tagent")
                .toString ();
            final var configDirectory = ofNullable (getenv ("TRANSACTIONS_DATA_PATH")).orElse (
                ofNullable (getProperty ("transactions.data.path")).orElse (defaultPath));
            final var configPath = Path.of (configDirectory, "transactions.json")
                .toString ();
            transactionsData = JsonUtil.fromFile (configPath, Transactions.class);
        }
        return LOGGER.traceExit (transactionsData);
    }

}
