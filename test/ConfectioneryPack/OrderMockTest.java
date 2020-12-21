package ConfectioneryPack;

import ConfectioneryPack.Biscuit;
import ConfectioneryPack.DataValidationException;
import ConfectioneryPack.FlourType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

public class OrderMockTest {
    @Test
    public void check_AssociationSugarIterator_ImplicitArgumentParam() {
        Cocoa sample_cocoa = Mockito.mock(Cocoa.class);
        Biscuit sample_bisc = Mockito.mock(Biscuit.class);
        when(sample_cocoa.getSugaride()).thenReturn(new Sugar(0, 0, true, SugarType.Cane, 1));

        Order baseClass = new Order(sample_cocoa, sample_bisc);
        assertTrue(baseClass.checkSugarSufficiency(SugarType.Pearl));
        verify(sample_cocoa).getSugaride();
    }
}
