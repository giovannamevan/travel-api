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

		abrirPaginaHTML();
	}

	private static void abrirPaginaHTML() {
		String htmlFilePath = "C:\\Users\\giova\\OneDrive\\Área de Trabalho\\Faculdade\\POO2\\travel-api\\src\\main\\resources\\Frontend\\home.html";
		String browserCommand = "cmd /c start \"\" \"" + htmlFilePath + "\"";

		try {
			Runtime.getRuntime().exec(browserCommand);
		} catch (IOException e) {
			System.out.println("Erro ao abrir a página HTML: " + e.getMessage());
		}
	}
}
