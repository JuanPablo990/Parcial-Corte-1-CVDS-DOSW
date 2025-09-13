package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class CanalPush implements CanalNotificacion {
    @Override
    public void envian(String mensaje) {
        System.out.println("Enviando notificación Push: " + mensaje);
    }
}