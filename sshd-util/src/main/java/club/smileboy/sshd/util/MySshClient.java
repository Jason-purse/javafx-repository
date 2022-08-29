package club.smileboy.sshd.util;

import org.apache.sshd.client.SshClient;

public class MySshClient {
    {
        new SshClient();
    }

    public static void main(String[] args) {
        new SshClient();
    }

    public static MySshClient getInstance() {
        return new MySshClient();
    }
}
