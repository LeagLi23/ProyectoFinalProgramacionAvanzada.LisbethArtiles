package edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.Saga;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step.SagaCreateProductResponseStep1;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step.SagaCreateProductResponseStep2;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step.SagaCreateProductResponseStepFinal;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step.SagaCreateProductResponseStepTrueFinal;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SagaFactory {
    public static Saga<CreateProductResponse> createProductSaga(UUID key, CreateProductResponse command) {
        SagaPayload<CreateProductResponse> sagaPayload = new SagaPayload<>();
        sagaPayload.addProperty(new SagaPayLoadKey<>("command", CreateProductResponse.class), command);
        return Saga.<CreateProductResponse>builder()
                .name("Create Product Saga")
                .key(key)
                .payload(sagaPayload)
                .requiredStep(List.of(
                        SagaCreateProductResponseStep1.class,
                        SagaCreateProductResponseStep2.class,
                        SagaCreateProductResponseStepFinal.class,
                        SagaCreateProductResponseStepTrueFinal.class
                ))
                .build();
    }
}
