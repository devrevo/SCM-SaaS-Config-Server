package com.scm_saas_config_server.scm_saas_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class ScmSaasConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmSaasConfigServerApplication.class, args);
	}

}
