package builderPatern;

public class MordernRobotBuilder implements RobotBuilder {

	private Robot robo=null;
	public MordernRobotBuilder() {
		robo=new Robot();
	}
	@Override
	public void buildRobotHead() {
		robo.setRobotHead("Robot's head builded with Scaners");
	}

	@Override
	public void buildRobotBody() {
		robo.setRobotBody("Robot's body builded with aluminum");
	}

	@Override
	public void buildRobotLegs() {
		robo.setRobotLeg("Robot's legs are builded to being more mobile");
	}
	@Override
	public Robot getRobot() {
		buildRobotBody();
		buildRobotHead();
		buildRobotLegs();
		return this.robo;
	}

}
