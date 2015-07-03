import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RomanConverterTest {
    @Test
    public void itShouldConvertIto1() {
        assertThat(RomanConvert.Convert("I")).isEqualTo(1);
    }

    @Test
    public void itShouldConvertIIto2() {
        assertThat(RomanConvert.Convert("II")).isEqualTo(2);
    }
}
