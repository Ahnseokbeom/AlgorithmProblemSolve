import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<=t;i++) {
			long result = 0;
			long dsum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken()); // 세로
			int m = Integer.parseInt(st.nextToken()); // 가로
			int d = Integer.parseInt(st.nextToken()); // day
			ArrayList<Integer> lists = new ArrayList<>();
			int[] dlist = new int[d];
			for(int j = 0;j<n;j++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int k = 0;k<m;k++) {
					lists.add(Integer.parseInt(st.nextToken()));
				}
			}
			st = new StringTokenizer(br.readLine()," ");
			Collections.sort(lists);
			for(int day = 0;day<d;day++) {
				dlist[day] = Integer.parseInt(st.nextToken());
				for(int li = 0;li<lists.size();li++) {
					lists.set(li, lists.get(li)+1);
				}
				for(int da = 1;da<=dlist[day];da++) {
					result+= (day+1)*(lists.get(lists.size()-1)-1);
					lists.remove(lists.size()-1);
					lists.add(0, 1);
				}
			}
			bw.write("#"+i+" "+result+"\n");
			bw.flush();
//			sb.append("#"+i+" "+result).append("\n");
		}
//		System.out.println(sb);
	}

}
