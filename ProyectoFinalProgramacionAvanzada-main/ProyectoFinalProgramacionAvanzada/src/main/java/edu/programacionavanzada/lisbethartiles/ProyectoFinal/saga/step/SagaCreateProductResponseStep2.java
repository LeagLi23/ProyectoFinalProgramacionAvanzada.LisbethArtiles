package edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SagaCreateProductResponseStep2 implements SagaStep<CreateProductResponse> {

    @Override
    public String getName() {
        return "Demo Step 2";
    }

    @Override
    public SagaStepHandler<CreateProductResponse> getHandler() {
        return sagaPayload -> {
            log.info("Running {} Handler", getName());
        };
    }

    @Override
    public SagaStepCompensator<CreateProductResponse> getCompensator() {
        return sagaPayload -> {
            log.info("Running {} compensator", getName());
            log.info("Only show 2 comments here");
        };
    }
}
