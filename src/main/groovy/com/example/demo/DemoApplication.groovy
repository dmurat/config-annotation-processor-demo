package com.example.demo

import com.example.demo.config.MyGroovyConfig
import com.example.demo.config.MyJavaConfig
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

  static void main(String[] args) {
    SpringApplication.run(DemoApplication, args)
  }

  @Bean
  ApplicationRunner runner(MyGroovyConfig myGroovyConfig, MyJavaConfig myJavaConfig) {
    return { ApplicationArguments applicationArguments ->
      println """\
        ==== Application runner line runner"
        ====== MyGroovyConfig"
        ======   MyGroovyConfig.simpleProperty: [${myGroovyConfig.simpleProperty}]"
        ======   MyGroovyConfig.nested.nestedProperty: [${myGroovyConfig.nested.nestedProperty}]
        ======
        ====== MyJavaConfig"
        ======   MyJavaConfig.simpleProperty: [${myJavaConfig.simpleProperty}]"
        ======   MyJavaConfig.nested.nestedProperty: [${myJavaConfig.nested.nestedProperty}]
      """.stripIndent()

    }
  }
}
