package piolin;
import EstrellasTV.Piolin;
import aves.Ave;
import aves.pajaros.Canario;
import aves.tropicales.Loro;
import EstrellasTV.Piolin;

public class MiPrograma {

	public static void main(String[] args) {
		Piolin pi=new Piolin('m',(byte)12,12.5F,7);
		Loro lo=new Loro('f',(byte)5,'n',"Verde");
		pi.quienSoy();
		lo.quienSoy();
		pi.altura();
		lo.deDondeEres();
		pi.setTamanio(23);
		pi.altura();
		lo.setRegion('e');
		lo.deDondeEres();
		Ave.visuAves();
	}

}
