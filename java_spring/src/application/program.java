package application;

import java.util.Date;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import entities.Order;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);
		
		System.out.println(order);
	}

}
