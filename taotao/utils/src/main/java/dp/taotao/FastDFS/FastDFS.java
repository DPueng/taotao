package dp.taotao.FastDFS;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

public class FastDFS {

    private StorageClient storageClient;

    public FastDFS(String proPath) throws IOException, MyException {
        storageClient = init(proPath);
    }

    private StorageClient init(String proPath) throws IOException, MyException {
        ClientGlobal.initByProperties(proPath);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        return new StorageClient(trackerServer, storageServer);
    }


    public String uploadFile(byte[] fileBuff, String fileType) throws IOException, MyException {
        String[] strings = storageClient.upload_file(fileBuff, "jpg",null);
        return "http://192.168.56.101/" + strings[0] + "/" + strings[1];
    }
}
