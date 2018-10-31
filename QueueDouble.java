package ASD3;

import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int farhan = -1;

	public void insert(Double value) {
		alief++;
		kelase.add(farhab,value);
	}
	public Double get() {
		Double value = 0.1;
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
