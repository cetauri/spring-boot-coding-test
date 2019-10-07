package com.example.demo.test.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

public class ITestServiceTest {

    @Test
    public void test(){
        // Given
        ITestService service = Mockito.mock(ITestService.class);

        // When
        when(service.calc(9)).thenReturn(8);
        when(service.calc(5)).thenReturn(4);

        // Then
        assertThat(service).isNotNull();
        assertThat(service.calc(9))
                            .isNotNull()
                            .isEqualTo(8);

        assertThat(service.calc(5))
                            .isNotNull()
                            .isEqualTo(4);
    }

}