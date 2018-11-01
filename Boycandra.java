public class Boycandra extends Novel{

	public String harga;

	public Boycandra(String judul, String harga){
		super(judul);
		this.harga = harga;
	}

	public Boycandra(String judul){
		super(judul);
	}

	public void showHarga(){
		System.out.println(harga);
	}
}