package builderPatern;

public class Robot implements RobotPlan {
	
	String head;
	String body;
	String leg;
	
	@Override
	public void setRobotHead(String head) {
		this.head=head;
	}

	@Override
	public void setRobotBody(String body) {
		this.body=body;
	}

	@Override
	public void setRobotLeg(String leg) {
		this.leg=leg;
	}

	public String getHead() {
		return head;
	}

	public String getBody() {
		return body;
	}

	public String getLeg() {
		return leg;
	}

}
