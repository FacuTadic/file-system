package fs;

import java.util.function.Consumer;

public class LowLevelFSCommunicator implements LowLevelFileSystem{
    @Override
    public int openFile(String path) {
        return 0;
    }

    @Override
    public void closeFile(int fd) {

    }

    @Override
    public int syncReadFile(int fd, byte[] bufferBytes, int bufferStart, int bufferEnd) {
        return 0;
    }

    @Override
    public void syncWriteFile(int fd, byte[] bufferBytes, int bufferStart, int bufferEnd) {

    }

    @Override
    public void asyncReadFile(int fd, byte[] bufferBytes, int bufferStart, int bufferEnd, Consumer<Integer> callback) {

    }
}
