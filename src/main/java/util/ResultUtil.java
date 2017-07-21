package util;

import com.liub.domain.Result;

/**
 * ResultUtil
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;

    }
}
