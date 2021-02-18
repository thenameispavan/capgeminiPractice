package day7;

public class Sender<T> {
	public T message;

	public void setMessage(T message) {
		this.message = message;
	}
	public void sendMessage() {
		System.out.println("sending message: "+message);
	}

}
