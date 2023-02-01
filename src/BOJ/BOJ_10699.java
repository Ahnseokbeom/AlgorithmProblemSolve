package BOJ;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ_10699 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(date.format(today));
	}

}
