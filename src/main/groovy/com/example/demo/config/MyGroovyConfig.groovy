package com.example.demo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * My Groovy config properties.
 */
@Component
@ConfigurationProperties("com.example.demo.my-groovy-config")
class MyGroovyConfig {

  /**
   * Simple property showcase.
   */
  String simpleProperty = "groovy simpleProperty original value"

  Nested nested = new Nested()

  /**
   * Nested properties.
   */
  class Nested {
    /**
     * Simple nested property showcase.
     */
    String nestedProperty = "groovy nestedProperty original value"
  }
}
