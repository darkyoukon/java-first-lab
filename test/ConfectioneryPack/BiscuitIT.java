package ConfectioneryPack;

import static org.junit.jupiter.api.Assertions.*;

import ConfectioneryPack.Biscuit;
import ConfectioneryPack.DataValidationException;
import ConfectioneryPack.FlourType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

public class BiscuitIT {
    @Test
    public void get_BuiltInAgregatedLayerQuantity_EqualsToVariable()  {
        Biscuit.Layer sample = Mockito.mock(Biscuit.Layer.class);
        when(sample.get_layer_quantity()).thenReturn(100);

        String[] types = {"grain"};
        Biscuit baseClass = new Biscuit(0, 0, true, FlourType.Wholegrain, sample);
        assertEquals(baseClass.get_layers_quantity(), 100);
        verify(sample).get_layer_quantity();
    }

    @Test
    public void check_NestedClassSize_WhenAddingToArrayList() {
        ArrayList<String> list = spy(new ArrayList<>());
        Biscuit sample = new Biscuit(0, 0, false, FlourType.Wholegrain, new Biscuit.Layer(0, list));
        sample.setLayersTypes("sample1");
        sample.setLayersTypes("sample2");
        assertEquals(2, list.size());
    }
}
