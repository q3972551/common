package common.config;


import java.util.ResourceBundle;

/**
 * @author peanut
 * @date   2018/05/26
 */
public class Config {

    private static int s_id = 0;
    private static String s_key = null;

    public static void init()  {
        ResourceBundle resource = ResourceBundle.getBundle("properties/config");
        String value = resource.getString("id");
        String key   = resource.getString("secretKey");

        if (value == null)
        {
            throw new IllegalArgumentException("id not exit!");
        }

        s_id = Integer.valueOf(value);
        s_key = key;
    }

    public static int getId()
    {
        return s_id;
    }

    public static String getSecretKey()
    {
        return s_key;
    }
}
