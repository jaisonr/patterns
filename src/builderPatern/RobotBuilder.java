package builderPatern;

public interface RobotBuilder {
	public void buildRobotHead();
	public void buildRobotBody();
	public void buildRobotLegs();
	public Robot getRobot();
}
