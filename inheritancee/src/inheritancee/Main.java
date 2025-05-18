package inheritancee;

public class Main {

	public static void main(String[] args) {
		//ortak özelliklerin toplandığı sınıfa super ona bağlı alt sınıflara sub denir
		// alt sınıflar üst sınıfların özelliklerini alabilir ama üst sınıflar alt sınıflarınkini almaz
		// bir sınıf sadece bir sınıftan kalıtım yapabilir
		calisanlar c1=new calisanlar("tuana dayanç","5055999354","tuana.dayanc@istun.edu.tr");
		//akademisyen a1=new akademisyen("evren sönmez","5301514364","evren.dayanc@hotmail.com","ceng","prof");
		//memur m1=new memur("ali veli","5415340454","ali.veli@.com","bilgi işlem","09-18");
		ogretimgorevlisi o1=new ogretimgorevlisi("mahmut çetindağ","525656256","mahmut@patika.dev","ceng","doçent","814");
		//overlooding hatırlatması
		//o1.giris("10.00","18.00");
		
		/*o1.giris();
		//aslında giris methodu en başta calisanlar sınıfında tanımlıydı fakat akademisyen sınıfında override yani geçersiz kılma işlemi yaptım
		// artık o1 nesnem akademisyen sınıfındaki girs methodunu kullancak
		//akademisyen sınıfındaki metotu da ogretimgorevlisi sınıfında override yaptım ve ordaki giris i yazdırdı
		a1.giris();
		c1.giris();
		m1.giris();*/
		
		/*polimorfizm(çok biçimlilik)
		calisanlar a2=new akademisyen("kodluyoruz","5301514364","evren.dayanc@hotmail.com","ceng","prof");
		a2.giris();
		//a2.getBolum();
		// burda a2 den giris metodumu çalıştırdığımda akademisyenin içindeki giris metodunu çalıştırdı çünkü onu çalisanlardan owerride etmiştim
		//fakat akademisyenden getbolum metotunu çağırdığımda hata verdi çünkü getbolum calisnalar sınıfında yok.
		a2.cikis();*/
		//sadece ikisinde ortak olan ya da direkt calisanlar sınıfındaki metodu kullanabilirm
		
		//int[] loginUser=new int[5];
		//calisanlar[] loginUser= {c1,o1};
		//calisanlar.girisYapanlar(loginUser);
		o1.derseGir("10.00");
	}

}
