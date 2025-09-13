package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class ServicioNotificacion {

    private FabricaNotificacion fabrica;

    public ServicioNotificacion() {
        this.fabrica = new FabricaNotificacion();
    }

    public void envianNotificacion(String mensaje, TipoNotificacion tipo) {
        CanalNotificacion canal = fabrica.creanNotificacion(tipo);
        canal.envian(mensaje);
    }

    public void envianNotificacion(String mensaje, TipoNotificacion... tipos) {
        for (TipoNotificacion tipo : tipos) {
            envianNotificacion(mensaje, tipo);
        }
    }
}