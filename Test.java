public class Test{
	public static void main(String[] args) {
		Boycandra b1 = new Boycandra("Catatan pendek untuk cinta yang panjang","Rp. 75.000,-");
		b1.showJudul();
		b1.showHarga();

		Boycandra b2 = new Boycandra("Sepasang kekasih yang belum bertemu","Rp. 88.000,-");
		b2.showJudul();
		b2.showHarga();
	}
}