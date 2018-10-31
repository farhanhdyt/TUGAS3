package ASD3;

public class MainStackString {
public static void main(String[] args) {
		classstackstring st= new classstackstring();
		
		st.push("alief");
    st.push("taufik");
		st.push("abdi");
		st.push("qadri");
		
		String d0=st.pop();
		System.out.println(d0);
		st.cetak();
	}
}
