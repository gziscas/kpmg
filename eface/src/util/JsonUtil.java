package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.util.Assert;

public class JsonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    /**
     * 将给定的对象转换成JSON
     * @param obj
     * @return
     */
    public static String beanToJson(Object obj) {
        JSONObject json = JSONObject.fromObject(obj);
        return json.toString();
    }

    /**
     * 将JSON转换成Bean
     * @param str
     * @param bean
     * @return
     */
    public static Object jsonToBean(String str, Class bean) {
        JSONObject jsonObj = JSONObject.fromObject(str);
        return JSONObject.toBean(jsonObj, bean);
    }

    /**
     * 将给定的JSON字符串转换成MAP
     * @param message
     * @return
     */
    public Map<String ,Object> parseMessageToMap(String message) {
        Object result = JsonUtil.jsonToBean(message, Map.class);
        return (Map<String, Object>) result;
    }

    /**
     * 将JSON数组转换成List
     * @param jsonArray
     * @return
     */
    public static List jsonArrayToList(JSONArray jsonArray) {
        if(jsonArray == null)
            return null;
        return (List)jsonArray.toList(jsonArray);
    }

    /**
     * 将JSON数组转换成包含指定对象的List
     * @param jsonArray
     * @param clazz
     * @return
     */
    public static List jsonArrayToList(JSONArray jsonArray, Class clazz) {
        if(jsonArray == null)
            return null;
        return (List)jsonArray.toList(jsonArray, clazz);
    }

    /**
     * 将List转换成JSON数组
     * @param list
     * @return
     */
    public static JSONArray listToJsonArray(List list) {
        if(list == null)
            return null;
        return JSONArray.fromObject(list);
    }

    public static String toJson(Object value) {
        try {
            return mapper.writeValueAsString(value);
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return null;
    }

    public static void toJson(HttpServletResponse response, String contentType, Object value) {
        Assert.notNull(response);
        Assert.hasText(contentType);
        try {
            response.setContentType(contentType);
            mapper.writeValue(response.getWriter(), value);
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }

    public static void toJson(HttpServletResponse response, Object value) {
        Assert.notNull(response);
        PrintWriter localPrintWriter = null;
        try {
            localPrintWriter = response.getWriter();
            mapper.writeValue(localPrintWriter, value);
            localPrintWriter.flush();
        } catch (Exception localException) {
            localException.printStackTrace();
        } finally {
            IOUtils.closeQuietly(localPrintWriter);
        }
    }

    public static <T> T toObject(String json, Class<T> valueType) {
        Assert.hasText(json);
        Assert.notNull(valueType);
        try {
            return mapper.readValue(json, valueType);
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return null;
    }

    public static <T> T toObject(String json, TypeReference<?> typeReference) {
        Assert.hasText(json);
        Assert.notNull(typeReference);
        try {
            return mapper.readValue(json, typeReference);
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return null;
    }

    public static <T> T toObject(String json, JavaType javaType) {
        Assert.hasText(json);
        Assert.notNull(javaType);
        try {
            return mapper.readValue(json, javaType);
        } catch (Exception localException) {
            localException.printStackTrace();
        }
        return null;
    }

}
