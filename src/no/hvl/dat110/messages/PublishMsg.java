package no.hvl.dat110.messages;

public class PublishMsg extends Message {

	private Message message;
	private String topic;

	public PublishMsg(String user, Message message, String topic) {
		super(MessageType.PUBLISH, user);
		this.message = message;
		this.topic = topic;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "PublishMsg [message=" + message + ", topic=" + topic + "]" + super.toString();
	}
}
