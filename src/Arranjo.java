import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arranjo {
    @Test
     public static void main(String[] args) {
         int[] b = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
         Op a = new Op();
         assertEquals(510, a.menor(b), "O Menor deve ser 510");

    }


}
