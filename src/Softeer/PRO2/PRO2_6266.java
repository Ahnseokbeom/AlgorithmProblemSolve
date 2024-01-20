package Softeer.PRO2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Meeting {
    String room;
    int start;
    int end;

    public Meeting(String room, int start, int end) {
        this.room = room;
        this.start = start;
        this.end = end;
    }
}
public class PRO2_6266 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<String, List<Meeting>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String room = sc.next();
            map.put(room, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String room = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();
            map.get(room).add(new Meeting(room, start, end));
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        sc.close();

        for (String roomName : list) {
            List<Meeting> meetings = map.get(roomName);
            Collections.sort(meetings, Comparator.comparingInt(m -> m.start));

            List<String> time = new ArrayList<>();
            int prevEnd = 9;

            for (Meeting meeting : meetings) {
                if (meeting.start > prevEnd) {
                    time.add(format(prevEnd, meeting.start));
                }
                prevEnd = Math.max(prevEnd, meeting.end);
            }

            if (prevEnd < 18) {
                time.add(format(prevEnd, 18));
            }

            System.out.println("Room " + roomName + ":");
            if (time.isEmpty()) {
                System.out.println("Not available");
            } else {
                System.out.println(time.size() + " available:");
                for (String times : time) {
                    System.out.println(times);
                }
            }
            if (!roomName.equals(list.get(list.size() - 1))) System.out.println("-----");
        }
    }

    private static String format(int start, int end) {
        return String.format("%02d-%02d", start, end);
    }
}
