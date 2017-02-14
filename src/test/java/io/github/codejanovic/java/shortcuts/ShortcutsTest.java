package io.github.codejanovic.java.shortcuts;

import org.junit.Test;

import static io.github.codejanovic.java.shortcuts.Shortcuts.f;
import static io.github.codejanovic.java.shortcuts.Shortcuts.nn;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class ShortcutsTest {
    @Test
    public void testFormatString() throws Exception {
        assertThat(f("what the %s", "hell")).isEqualTo("what the hell");
    }

    @Test
    public void testNotNullThrowsNullPointerException() throws Exception {
        assertThatThrownBy(() -> nn(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage(null);
    }

    @Test
    public void testNotNullThrowsNullPointerExceptionWithCustomMessage() throws Exception {
        assertThatThrownBy(() -> nn(null, "param may not be null"))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("param may not be null");
    }
}