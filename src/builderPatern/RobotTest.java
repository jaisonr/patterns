package builderPatern;

public class RobotTest {

	public static void main(String[] args) {
		RobotBuilder builder=new MordernRobotBuilder();
		RobotEngineer engineer=new RobotEngineer(builder);
		System.out.println(engineer.buildRobo().getBody());
	}

}
