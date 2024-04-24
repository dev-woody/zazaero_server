package com.zazaero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon s
// src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public QuercusEngine quercusEngine() {
        return new QuercusEngine();
    }

    @GetMapping("/execute-php")
    public ResponseEntity<String> executePHP(QuercusEngine quercusEngine) {
        try {
            String phpCode = "include 'example.php';";
            String result = (String) quercusEngine.execute(phpCode);
            return ResponseEntity.ok(result);
        } catch (QuercusException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error executing PHP code: " + e.getMessage());
        }
    }
}