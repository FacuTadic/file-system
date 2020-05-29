package highLevelFileSystem;

import archivo.Archivo;
import fs.LowLevelFSCommunicator;

public interface HighLevelFileSystemInterface {

    LowLevelFSCommunicator lowLevelFileSystem = new LowLevelFSCommunicator();


    int openFile(Archivo archivoFS);

    int reedFile(Archivo archivoFS);

    void writeFile(Archivo archivoFS);

    void closeFile(Archivo archivoFS);


}
