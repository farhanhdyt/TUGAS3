package ASD3;

import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int farhan = -1;

	public void insert(Float value) {
		farhan++;
		kelase.add(farhan,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(farhan>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			farhan--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+farhan+" > VARIABLE: "+kelase.toString());
	}
}
