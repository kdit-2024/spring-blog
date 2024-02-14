package shop.mtcoding.blog.util;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodeTest {

    @Test
    public void encode_test() {
        BCryptPasswordEncoder en = new BCryptPasswordEncoder();
        String rawPassword = "1234";

        String encPassword = en.encode(rawPassword);
        System.out.println(encPassword);
    }

    @Test
    public void string_reverse() {
        String v = "abcdef";

        char[] chs = v.toCharArray();

        for (int i = 0; i < chs.length / 2; i++) {
            char temp = chs[i]; // temp = a, temp = b
            chs[i] = chs[chs.length - 1 - i]; // chs[0] = d, chs[1] = c
            chs[chs.length - 1 - i] = temp; // chs[3] = a, chs[2] = b
        }

        System.out.println(chs);
    }
}
