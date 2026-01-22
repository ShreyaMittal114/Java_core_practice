package pillars_of_oops;

public class Inheritance {

	public static void main(String[] args) {
		Nokia n= new Nokia();
		samsung n2 = new samsung();

	}

}


class Nokia{
	int mic;
	int speaker;
	int radio;
	void set_data(int mic , int speaker, int radio) {
		this.mic=mic;
		this.radio=radio;
		this.speaker=speaker;
	}
	
	void display() {
		System.out.println(mic);
		System.out.println(radio);
		System.out.println(speaker);
		
	}
	Nokia(){
		System.out.println("Nokia constructor");
	}
}


class samsung extends Nokia{
	int sensor;
	int music;
	void f1() {
		this.sensor=sensor;
		this.music= music;
	}
	//super(); 
	samsung(){
		System.out.println("samsung constructor");
	}
	
}









//multiple inheritance can be achieved through interface