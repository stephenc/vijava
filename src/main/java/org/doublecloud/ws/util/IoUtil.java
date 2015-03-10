package org.doublecloud.ws.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author <a href="mailto:cleclerc@cloudbees.com">Cyrille Le Clerc</a>
 */
public class IoUtil {

    public static long copy(InputStream from, OutputStream to) throws IOException {
        from.getClass();
        to.getClass();

        byte[] buffer = new byte[4096];
        long total = 0L;

        while (true) {
            int length = from.read(buffer);
            if (length == -1) {
                return total;
            }

            to.write(buffer, 0, length);
            total += (long) length;
        }
    }
}
