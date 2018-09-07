package edu.mum.cs.cs401.labs.lab02.problem2.prob2B;

public class OrderLine {
	private Order order;

	public OrderLine(Order order) {
		super();
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
