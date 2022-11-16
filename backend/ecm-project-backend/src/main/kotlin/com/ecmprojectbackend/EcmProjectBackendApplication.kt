package com.ecmprojectbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

//@ConfigurationPropertiesScan("com.ecmprojectbackend.configure")
@SpringBootApplication(
	scanBasePackages = [
		"com.ecmprojectbackend.domain",
		"com.ecmprojectbackend.infrastructure",
		"com.ecmprojectbackend.application",
		"com.ecmprojectbackend.webApi"
	]
)
@EntityScan("com.ecmprojectbackend.infrastructure.persistence.jpa")
class EcmProjectBackendApplication

fun main(args: Array<String>) {
	runApplication<EcmProjectBackendApplication>(*args)
}
