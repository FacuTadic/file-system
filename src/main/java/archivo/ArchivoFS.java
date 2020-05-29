package archivo;

public class ArchivoFS implements Archivo{

    String path;
    Integer fd;
    Integer bufferStart;
    Integer bufferEnd;
    byte[] bufferBytes;

    ArchivoFS(String pathOrigin,Integer bufferStartInput, Integer bufferEndInput, byte[] bufferBytesInput){
        this.path = pathOrigin;
        // Generar valor random y hashearlo this.fd = ;
        this.bufferStart = bufferStartInput;
        this.bufferEnd = bufferEndInput;
        this.bufferBytes = bufferBytesInput;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Integer getFD() {
        return fd;
    }

    @Override
    public Integer getBufferStar() {
        return bufferStart;
    }

    @Override
    public Integer getBufferEnd() {
        return bufferEnd;
    }
    @Override
    public byte[] getBufferBytes() {
        return bufferBytes;
    }
}
