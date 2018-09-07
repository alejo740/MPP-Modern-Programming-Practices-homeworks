package edu.mum.cs.cs401.labs.lab02.problem2.prob2B;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(155);
		order.addOrderLine();

		List<OrderLine> lines = order.getOrderLines();
		Order order1 = lines.get(0).getOrder();
		Order order2 = lines.get(1).getOrder();
		
		if(order.equals(order1) && order.equals(order2)) {
			System.out.println("The same Order into the OrderLines");
		}

	}

}
