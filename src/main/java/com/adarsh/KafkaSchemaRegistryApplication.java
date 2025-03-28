package com.adarsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaSchemaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSchemaRegistryApplication.class, args);
	}

}
/*
todo: project setup
1- enable wsl and download and install docker
2- go to terminal and compose the docker file  to run all images of servcies we need
        broker, schema-registry, zookeeper, kafka-tools, control-center
3-  run command "docker compose up -d"

PS C:\Users\AdarshGupta\IdeaProjects\Basant-tut-kafkaAvro> docker compose up -d
time="2025-03-28T13:35:19+05:30" level=warning msg="C:\\Users\\AdarshGupta\\IdeaProjects\\Basant-tut-kafkaAvro\\docker-compose.yml: the attribute `version` is obsolete, it will be ignored, please remove it to avoid potential confusion"
[+] Running 24/24
 ✔ broker Pulled                                                                                                                             412.0s
 ✔ schema-registry Pulled                                                                                                                    346.5s
 ✔ zookeeper Pulled                                                                                                                          190.9s
 ✔ kafka-tools Pulled                                                                                                                        239.8s
 ✔ control-center Pulled
 */