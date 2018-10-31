package ASD3;
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int alief = -1;

	public void insert(String value) {
		farhan++;
		kelase.add(alief,value);
	}
	public String get() {
		String value = "KOSONG";
		if(farhan>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			farhan--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+farhan+" > KELAS E: "+kelase.toString());
	}
}
