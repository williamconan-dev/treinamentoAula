package com.devsuperior.projeto;

import com.devsuperior.projeto.entityes.Order;
import com.devsuperior.projeto.services.OrderService;
import com.devsuperior.projeto.services.ShippingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class ProjetoApplication implements CommandLineRunner {

	@Autowired
	ShippingServices shippingServices;

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o código do pedido:");
		int code = sc.nextInt();

		System.out.println("Informe o valor básico do pedido:");
		double valueOrder = sc.nextDouble();

		System.out.println("Informe a porcentagem de desconto do pedido:");
		double valueDiscount = sc.nextDouble();

		Order order = new Order(code,valueOrder,valueDiscount);
		double total = orderService.total(order);

		System.out.println("Pedido código " + code);
		System.out.printf("Valor total: R$ %.2f %n", total);




	}
}
