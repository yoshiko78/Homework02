import java.time.LocalDateTime;
public class Sample03 {
	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(date1.plusYears(3).getDayOfWeek());
	}

}
