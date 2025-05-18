package inheritancee;

public abstract class akademisyen extends calisanlar {
	private String bolum;
	private String unvan;
	
	//eğer bir sub class super class ı extend ediyorsa kalıtım aldığı sınıfın constructur ını yazmak zorunda
	public  akademisyen(String adSoyad,String telefon,String eposta,String bolum,String unvan) {
		super(adSoyad,telefon,eposta);
		//ilk başta super ı yazmak zorundayız
		this.bolum=bolum;
		this.unvan=unvan;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum=bolum;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan=unvan;
	}
	public abstract void derseGir(String dersSaati);
		
		//burda direkt this.adSoyad diyemiyorum çünkü adSoyad calisanlar sınıfında ve private
		//burda da yine kapsülleme işlemi örneği görüyoruz
	
	@Override
	public void giris() {
		System.out.println(this.getAdSoyad()+"akademisyeni a kapısından giriş yaptı");
	}
}
