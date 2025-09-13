package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class CanalTelegram implements CanalNotificacion {
    @Override
    public void envian(String mensaje) {
        System.out.println("Enviando mensaje por Telegram: " + mensaje);
    }
}