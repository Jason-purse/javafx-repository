package club.smileboy.ssh.util;

import org.apache.sshd.client.SshClient;

public class SshUtil {
    {
        new SshClient();
    }
    public static SshUtil getInstance() {
        return new SshUtil();
    }
}
