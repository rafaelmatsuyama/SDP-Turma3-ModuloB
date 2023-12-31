package lab03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class CarrinhoService implements CommandLineRunner {
    @Autowired
    public CarrinhoRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(CarrinhoService.class, args);
    }

    @Override
    public void run(String... args) {
        Carrinho produto1 = new Carrinho(1, "PS 5", 2, 4999.00);
        repository.save(produto1);

        Carrinho produto2 = new Carrinho(2, "Perfume One Million", 5, 400.00);
        repository.save(produto2);

        Carrinho produto3 = new Carrinho(3, "Camisa do Flamengo", 11, 350.00);
        repository.save(produto3);

        Carrinho produto4 = new Carrinho(4, "Whisky Royal Salutre", 2, 975.00);
        repository.save(produto4);

        Carrinho produto5 = new Carrinho(5, "iPhone 14 Pro", 5, 8000.00);
        repository.save(produto5);

        repository.findAll().forEach(it -> System.out.println(it.toString()));
    }
}
