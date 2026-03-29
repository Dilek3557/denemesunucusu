package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Bu, internetten gelen isteklere cevap vereceğim demek
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/selam") // Tarayıcıya veya Postman'e bunu yazınca çalışacak
    public String selamVer() {
        return "İnşaat Mühendisi Görev Takip Sistemine Hoş Geldiniz!zzzzzsss";
    }
}