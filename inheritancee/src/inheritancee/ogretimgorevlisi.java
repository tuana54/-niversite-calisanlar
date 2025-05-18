package inheritancee;

public class ogretimgorevlisi extends akademisyen{
//akademisyenden extend ettim çünkü öğretim görevlisi akademisyenin alt sınıfı akademisyen ise çalışanların
//direkt çalişanlardan extend etseydim öğretim grevlisinin akademisyenden farkı kalmazdı
	private String kapiNo;
	public ogretimgorevlisi(String adSoyad,String telefon,String eposta,String bolum,String unvan,String kapiNo){
		super(adSoyad,telefon,eposta,bolum,unvan);
		this.kapiNo=kapiNo;
	}
	public String getKapiNo() {
		return kapiNo;
	}
	public void setKapiNo(String kapiNo) {
		this.kapiNo=kapiNo;
	}
	
	@Override
	public void giris() {
		System.out.println(this.getAdSoyad()+"öğretim görevlisi b kapısından giriş yaptı");
		
	}
	@Override
	public void derseGir(String saat) {
		System.out.println(this.getAdSoyad()+" öğretim görevlisi derse "+saat + " giriş ");
	}
}
