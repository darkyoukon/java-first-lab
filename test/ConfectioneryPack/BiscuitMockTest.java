package ConfectioneryPack;

import static org.junit.jupiter.api.Assertions.*;

import ConfectioneryPack.Biscuit;
import ConfectioneryPack.DataValidationException;
import ConfectioneryPack.FlourType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

public class BiscuitMockTest {
    @Test
    public void get_BuiltInAgregatedLayerQuantity_EqualsToVariable()  {
        Biscuit.Layer sample = Mockito.mock(Biscuit.Layer.class);
        when(sample.get_layer_quantity()).thenReturn(100);

        String[] types = {"grain"};
        Biscuit baseClass = new Biscuit(0, 0, true, FlourType.Wholegrain, sample);
        assertEquals(baseClass.get_layers_quantity(), 1);
        verify(sample).get_layer_quantity();
    }
}
