package com.project.travel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.io.IOException;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Após iniciar a aplicação Spring Boot, abrir a página HTML no navegador
		abrirPaginaHTML();
	}

	private static void abrirPaginaHTML() {
		String htmlFilePath = "C:/Users/User/Desktop/Facul/POO/travel-api/src/main/resources/Frontend/home.html";
		String browserCommand = "cmd /c start \"\" \"" + htmlFilePath + "\"";

		try {
			Runtime.getRuntime().exec(browserCommand);
		} catch (IOException e) {
			System.out.println("Erro ao abrir a página HTML: " + e.getMessage());
		}
	}
}
