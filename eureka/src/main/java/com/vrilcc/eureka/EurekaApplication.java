package com.vrilcc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		// new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
// @EnableEurekaServer
// public class Application extends SpringBootApplication{

//     public static void main(String[] args) {
//         new SpringApplicationBuilder(Application.class).web(WebApplicationType.SERVLET).run(args);
//     }
//     @Override
// 	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
// 		return builder.sources(EurekaServerApplication.class);
// 	}

// }