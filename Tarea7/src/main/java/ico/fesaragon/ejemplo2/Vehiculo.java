package ico.fesaragon.ejemplo2;

public interface Vehiculo {
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char Clasificacion_EFICIENCIA = 'A';
    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();

}
