import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLogger extends Logger {
	
	private static SimpleDateFormat dateFORMAT = new SimpleDateFormat(
			"HH:mm:SS dd.MM.yy");
	private Date today = new Date();
	private String date = dateFORMAT.format(today);

	public DateLogger(int level) {
		super(level);
	}

	public DateLogger() {
		super();
	}

	private void log(int level, String message) {
		if (level <= this.getLevel()) {
			System.out.println("|" + date + "| " + level + " => " + message);
		}
	}

	private void log(String message) {
		if (this.getLevel() >= 3) {
			System.out.println("|" + date + "| " + level + this.getLevel()
					+ " => " + message);
		}
	}

}