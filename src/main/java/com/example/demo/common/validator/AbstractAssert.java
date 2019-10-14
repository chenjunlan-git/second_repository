package com.example.demo.common.validator;

import com.example.demo.common.xss.XfktechException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author  heyongjie
 * @date  2018/5/2
 * @updater
 */
public abstract class AbstractAssert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new XfktechException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new XfktechException(message);
        }
    }
}
