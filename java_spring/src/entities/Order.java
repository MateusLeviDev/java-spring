package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

		private Integer id;
		private Date moment;
		private OrderStatus status;
		
		public Order() {
			//criando um construtor vazio		
		}

		public Order(Integer id, Date moment, OrderStatus status) {
			//construtor com argumentos
			this.id = id;
			this.moment = moment;
			this.status = status;
		}

		//"alt shift s" para aba source
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Date getMoment() {
			return moment;
		}

		public void setMoment(Date moment) {
			this.moment = moment;
		}

		public OrderStatus getStatus() {
			return status;
		}

		public void setStatus(OrderStatus status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
		}
		
		
}
