package com.learning.challengedependencyinjection.App;

import com.learning.challengedependencyinjection.entities.Order;
import com.learning.challengedependencyinjection.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.text.Format;

@SpringBootApplication
@ComponentScan({"com.learning.challengedependencyinjection"})
public class ChallengeDependencyInjectionApplication implements CommandLineRunner {
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order();

		order.setCode(1034);
		order.setBasic(150.00);
		order.setDiscount(20.00);
		System.out.println("........................................");
		System.out.println("Pedido código: " + order.getCode() + "\nValor total: R$ " + String.format("%.2f", orderService.total(order)));

		order.setCode(2282);
		order.setBasic(800.00);
		order.setDiscount(10.00);
		System.out.println("........................................");
		System.out.println("Pedido código: " + order.getCode() + "\nValor total: R$ " + String.format("%.2f", orderService.total(order)));

		order.setCode(1309);
		order.setBasic(95.90);
		order.setDiscount(0.0);
		System.out.println("........................................");
		System.out.println("Pedido código: " + order.getCode() + "\nValor total: R$ " + String.format("%.2f", orderService.total(order)));
	}
}
