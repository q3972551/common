package provider;

import com.service.TokenService;
import common.config.Config;
import common.error.TokenError;
import net.sf.json.JSONObject;
import org.peanut.common.utils.StringUtil;

import java.util.Map;

/**
 * @author peanut
 * @date  2018/06/07
 */
public class TokenServiceImpl implements TokenService {

    @Override
    public JSONObject isCheckSign(Map<String, String> parameter, String sign) {

        String newSign = StringUtil.formatUrlMapToSign(parameter, Config.getSecretKey());

        JSONObject object = new JSONObject();

        String error = "0";
        if (!newSign.equals(sign))
        {
            error = TokenError.FAILURE;
        }
        object.put("error",error);
        return object;
    }
}
