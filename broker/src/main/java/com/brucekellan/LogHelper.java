package com.brucekellan;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author brucekellan
 */
public class LogHelper {

  public static void log(int level, String template, Object... args) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      stringBuilder.append("=");
    }
    stringBuilder.append("> ");
    stringBuilder.append(String.format(template, toStringArgs(args)));
    System.out.println(stringBuilder.toString());
  }

  public static String[] toStringArgs(Object... args) {
    String[] args2 = new String[args.length];
    for (int i = 0; i < args.length; i++) {
      Object obj = args[i];
      args2[i] = JSON.toJSONString(obj);
    }
    return args2;
  }

  public static void log(String template, Object... args) {
    log(1, template, args);
  }

}
