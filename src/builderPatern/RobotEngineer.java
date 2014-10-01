package builderPatern;

public class RobotEngineer {
	private RobotBuilder robotBuilder;
	public RobotEngineer(RobotBuilder robotBuilder) {
		this.robotBuilder=robotBuilder;
	}
	public Robot buildRobo(){
		return this.robotBuilder.getRobot();
	}

}
