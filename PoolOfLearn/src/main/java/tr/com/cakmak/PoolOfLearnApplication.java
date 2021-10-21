package tr.com.cakmak;

import net.bytebuddy.pool.TypePool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class PoolOfLearnApplication {

	public static int[] siralama(int[] GS){//70,50,2,100

		for (int i = 0; i < GS.length; i++) { //Dizimizin değerlerini sırası ile alıyoruz

			int sayi = GS[i]; //sıradaki değeri sayi değişkenine atıyoruz
			int temp =i; //sayi 'nin indeksini temp değerine atıyoruz

			for (int j = i; j < GS.length ; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
				if(GS[i]<GS[j]){ //sayi değişkeninden küçük sayı var mı
					sayi = GS[j]; //varsa sayi değişkenimizide değiştiriyoruz
					temp = j; //indeks değerinide değiştiriyoruz
				}
			}

			if(temp != i){ //temp değeri başlangıç değeri ile aynı değil ise , yani GS[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
				GS[temp] = GS[i];//70 artık GS[3] eleman
				GS[i] = sayi;
			}

		}

		for (int sayi:GS) {// bu for çeşidi ilk önce GS nin ilk elemanını yazıyor sonra ikinci elemanı yazıyor  sonra ... yazıyor ve GS içindeki tüm elemanları yazıyor
			//Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
			System.out.print(sayi+" ");

		}

		return GS;
	}

	/*public static int EnBuyuk(int[] GS){

		int Enb=0;
		for (int i = 0; i < GS.length ; i++) {
			if (Enb<GS[i]){
				Enb=GS[i];
			}
		}  // hemen üste fonksiyonla en büyük değeri buldurduk

		return Enb ;

	}*/
	public static void main(String[] args) {

		SpringApplication.run(PoolOfLearnApplication.class, args);

		/*
		int GS;

			Scanner Gırıs = new Scanner(System.in);
			System.out.print("kaç sayı gireceksiniz : ");
			GS = Gırıs.nextInt();

		EnBuyuk(GS);
		System.out.print(EnBuyuk(GS));
		 */

		int [] Array1=new int[]{70,50,2,100};
		siralama(Array1);




	}

}
