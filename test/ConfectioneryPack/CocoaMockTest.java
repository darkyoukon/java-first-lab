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

public class CocoaMockTest {
    @Test
    public void change_SugarAggrigatedProperties_SugarTypesEquals()  {
        Sugar sample = Mockito.mock(Sugar.class);
        when(sample.getSugarType()).thenReturn(SugarType.Cane);

        Cocoa baseClass = new Cocoa(100, 250, sample);
        baseClass.changeSugarCharacteristics(SugarType.Cane, 3);
        assertEquals(baseClass.getSugaride().getSugarType(), SugarType.Cane);
        verify(sample).changeSugarType(SugarType.Cane);
        verify(sample).changeSugarSpoons(3);
    }
}
