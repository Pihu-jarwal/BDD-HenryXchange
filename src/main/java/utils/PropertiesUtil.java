package utils;

import java.io.File;
import java.nio.file.Paths;

public class PropertiesUtil {

    private static final String APP_PROPERTY_FILE = Paths.get (System.getProperty ("user.dir"), "src", "main",
            "resources", "application.properties")
        .toString ();

    public static String getEnvironmentKey (String environmentKey) {
        if (new File (APP_PROPERTY_FILE).exists ()) {
            return FileUtility.readPropertyFile (APP_PROPERTY_FILE)
                .get (environmentKey)
                .toString ();
        }
        throw new RuntimeException ("App properties file not exist at" + APP_PROPERTY_FILE);
    }
}




