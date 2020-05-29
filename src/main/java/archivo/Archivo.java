package archivo;

public interface Archivo {

    String getPath();

    Integer getFD();

    Integer getBufferStar();

    Integer getBufferEnd();

    byte[] getBufferBytes();
}
