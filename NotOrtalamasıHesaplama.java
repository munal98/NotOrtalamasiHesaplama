import java.util.Scanner;

public class NotOrtalamasıHesaplama {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int fizik,matematik,turkce,kimya,muzik,tarih;
		double sonuc;
		
		System.out.print("Fizik Notunuz : ");
		fizik =sc.nextInt();
		
		System.out.print("Matematik Notunuz :");
		matematik =sc.nextInt();
		
		System.out.print("Türkçe Notunuz :");
		turkce=sc.nextInt();
		
		System.out.print("Kimya Notunuz :");
		kimya=sc.nextInt();
		
		System.out.print("Müzik Notunuz : ");
		muzik=sc.nextInt();
		
		System.out.print("Tarih Notunuz : ");
		tarih=sc.nextInt();
		
		sonuc= (fizik+matematik+turkce+kimya+muzik+tarih) / 6.0;
		System.out.println("Ortalamanız : " + sonuc);
         
		System.out.println(sonuc >=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
	}

}
