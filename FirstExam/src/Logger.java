public class Logger {
	protected int level;

	public Logger() {
		this.level = 3;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Logger(int level) {
		super();
		this.level = level;
	}

	private void log(int level, String message) {
		if (level <= this.getLevel()) {
			System.out.println(level + " => " + message);
		}
	}

	private void log(String message) {
		if (this.getLevel() >= 3) {
			System.out.println(this.getLevel() + " => " + message);
		}
	}

	public static void main(String[] args) {
		Logger logger = new Logger(); // set LEVEL to 3
		System.out.println(logger.getLevel());
		logger.log(2, "Somewhat important message"); // gets logged as
														// "2 => Somewhat important message"
		logger.log(3, "Less important message"); // also gets logged!
		logger.log(5, "Not important"); // this is less important than LEVEL, so
										// it will **not be logged**.
		logger.log("Meh"); // overload without a LEVEL parameter, use 3 as
							// default.

		Logger logger2 = new DateLogger(); // I am not obliged to set a log
											// level, by default your class
											// should print everything in this
											// case
		logger2.log("My message"); // this is an overload without a LEVEL
									// parameter. In this situation, assume the
									// LEVEL given to you is 3.
		// |22:14:01 14.06.2014| 3 => My message

		// logger.log(Integer.MIN_VALUE,
		// "THIS is most important message in the world!!!");

	}
}
