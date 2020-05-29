package highLevelFileSystem;

import archivo.Archivo;

public class HighLevelFileSystem implements HighLevelFileSystemInterface {
    @Override
    public int openFile(Archivo archivoFS) {
        return lowLevelFileSystem.openFile(archivoFS.getPath());
    }

    @Override
    public int reedFile(Archivo archivoFS) {
        Integer fd = archivoFS.getFD();
        Integer bufferStart = archivoFS.getBufferStar();
        Integer bufferEnd = archivoFS.getBufferEnd();
        byte[] buffer = archivoFS.getBufferBytes();

        return lowLevelFileSystem.syncReadFile(fd, buffer, bufferStart, bufferEnd);
    }

    @Override
    public void writeFile(Archivo archivoFS) {
        Integer fd = archivoFS.getFD();
        Integer bufferStart = archivoFS.getBufferStar();
        Integer bufferEnd = archivoFS.getBufferEnd();
        byte[] buffer = archivoFS.getBufferBytes();
        lowLevelFileSystem.syncWriteFile(fd, buffer, bufferStart, bufferEnd);
    }

    @Override
    public void closeFile(Archivo archivoFS) {
        lowLevelFileSystem.closeFile(archivoFS.getFD());
    }
}
