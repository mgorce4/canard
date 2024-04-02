package canard.application;

import canard.model.Canard;
import canard.model.Colvert;
import canard.model.PrototypeCanard;

public class Client {
	public static void main(String[] args) {
		Canard duck = new Colvert("duck");
		Canard proto = new PrototypeCanard("blup",true);
		Canard proto2 = new PrototypeCanard("blup",false);
		
		System.out.println(duck.afficher());
		System.out.println(duck.nager());
        System.out.println(duck.effectuerVol());
        System.out.println(duck.cancanner());
        System.out.println(proto.afficher());
        System.out.println(proto2.effectuerVol());
        System.out.println(proto.effectuerVol());
        
	}


}
