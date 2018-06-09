package provider;

import com.service.ShortMsgService;
import net.sf.json.JSONObject;

/**
 * @author peanut
 * @date  2018/06/09
 */
public class ShortMsgServiceImpl implements ShortMsgService {
    @Override
    public JSONObject getCode(String tel) {
        return null;
    }

    @Override
    public boolean isCheckCode(String tel, String code) {
        return false;
    }
}
