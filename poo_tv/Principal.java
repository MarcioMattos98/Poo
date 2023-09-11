
package poo_tv;


public class Principal {

    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.canal = 13;
        tv.volume = 7;
        tv.ligado = true;
        
        tv.aumentarVolume();
        tv.reduzirVolume();
        tv.subirCanal();
        tv.descerCanal();
        tv.ligarTelevisor();
        tv.ligarTelevisor();
        tv.desligarTelevisor();
        tv.mostraStatus();
    }
    
}
