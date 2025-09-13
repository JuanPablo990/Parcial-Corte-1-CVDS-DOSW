package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class FabricaNotificacion {

    public CanalNotificacion creanNotificacion(TipoNotificacion tipo) {
        switch (tipo) {
            case WHATSAPP:
                return new CanalWhatsApp();
            case TELEGRAM:
                return new CanalTelegram();
            case EMAIL:
                return new CanalEmail();
            case SMS:
                return new CanalSMS();
            case PUSH:
                return new CanalPush();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
        }
    }
}