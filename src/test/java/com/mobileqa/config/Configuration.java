package com.mobileqa.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

  private static final Config CONFIG = ConfigFactory.load("configuration.conf");
  private static final String ENVIRONMENT = CONFIG.getString("environment");

  public static final String PLATFORM = CONFIG.getString("platform");
  public static final String DEVICE = CONFIG.getString("device");
  public static final Config CAPABILITIES_ANDROID =
      CONFIG.getConfig("capabilities").getConfig("android");
  public static final Config DEVICE_PROPERTIES =
      CONFIG.getConfig("devices").getConfig(PLATFORM).getConfig(DEVICE);

  private static final Config ENV = CONFIG.getConfig("environments").getConfig(ENVIRONMENT);
  private static final Config USER_1 = ENV.getConfig("user_1");
  public static String userLogin = USER_1.getString("login");
  public static String userPassword = USER_1.getString("password");
  public static String ENVIRONMENT_URL = ENV.getString("env_url");
}
