# Containerized SpringBoot Microservice

This project is a sample SpringBoot microservice project which is further containerized to be run within docker containers. Following are key aspects demonstrated in this project:
 - Dockerfile
 - Sample RESTController representing a REST endpoint

## Dockerfile

Following is the Dockerfile:
```
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
```

## Sample RESTController representing a REST endpoint

Following code represents a REST endpoint created with @RestController annotation.

```
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorSearchController {
	
	@Autowired
	DoctorService docService;
	
	@RequestMapping(value="/doctors", method=RequestMethod.GET, produces="application/json")
	public DoctorList searchDoctor(@RequestParam(value="location", required=false) String location,
			@RequestParam(value="speciality", required=false) String speciality) {
		DoctorList docList = docService.find(location, speciality);
		return docList;
	}
}

```

