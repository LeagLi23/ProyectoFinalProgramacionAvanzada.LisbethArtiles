package edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
@Slf4j
public class SagaCreateProductResponseStep1 implements SagaStep<CreateProductResponse> {

    @Override
    public String getName() {
        return "Demo Step 1";
    }

    @Override
    public SagaStepHandler<CreateProductResponse> getHandler() {
        return sagaPayload -> {
            log.info("Running {} Handler", getName());
            System.out.println("Testing Demo Handler");
            sagaPayload.addProperty(new SagaPayLoadKey<>("decimal", BigDecimal.class), new BigDecimal(500));
        };
    }

    @Override
    public SagaStepCompensator<CreateProductResponse> getCompensator() {
        return sagaPayload -> {
            log.info("Running {} compensator", getName());
            log.info("Fallando epicamente!");
        };
    }
}
