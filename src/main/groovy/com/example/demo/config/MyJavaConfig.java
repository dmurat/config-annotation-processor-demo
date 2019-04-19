package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * My Java config properties.
 */
@Component
@ConfigurationProperties("com.example.demo.my-java-config")
public class MyJavaConfig {
  private String simpleProperty = "java simpleProperty original value";

  /**
   * Simple property showcase.
   */
  public String getSimpleProperty() {
    return simpleProperty;
  }

  public void setSimpleProperty(String simpleProperty) {
    this.simpleProperty = simpleProperty;
  }

  private Nested nested = new Nested();

  public Nested getNested() {
    return nested;
  }

  public void setNested(Nested nested) {
    this.nested = nested;
  }

  /**
   * Nested properties.
   */
  static class Nested {
    private String nestedProperty = "java nestedProperty original value";

    /**
     * Simple nested property showcase.
     */
    public String getNestedProperty() {
      return nestedProperty;
    }

    public void setNestedProperty(String nestedProperty) {
      this.nestedProperty = nestedProperty;
    }
  }
}
