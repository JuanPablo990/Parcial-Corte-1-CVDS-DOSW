package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class Punto5 {
    private final ServicioNotificacion servicio;

    public Punto5(ServicioNotificacion servicio) {
        this.servicio = servicio;
    }

    public void run(String[] args) {
        servicio.envianNotificacion("Hola, este es un mensaje de prueba", TipoNotificacion.WHATSAPP);
        servicio.envianNotificacion("Notificación importante", TipoNotificacion.EMAIL);

        servicio.envianNotificacion("Mensaje múltiple",
                TipoNotificacion.SMS, TipoNotificacion.PUSH, TipoNotificacion.TELEGRAM);
    }
}