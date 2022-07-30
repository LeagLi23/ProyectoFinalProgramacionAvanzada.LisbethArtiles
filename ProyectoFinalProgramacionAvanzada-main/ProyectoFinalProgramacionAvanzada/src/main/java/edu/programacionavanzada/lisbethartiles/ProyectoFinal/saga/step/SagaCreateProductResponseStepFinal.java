package edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.CreateProductCommand;
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
public class SagaCreateProductResponseStepFinal implements SagaStep<CreateProductResponse> {

    @Override
    public String getName() {
        return "Demo Step final";
    }

    @Override
    public SagaStepHandler<CreateProductResponse> getHandler() {
        return sagaPayload -> {
            CreateProductCommand command = sagaPayload.getProperty(new SagaPayLoadKey<>("command", CreateProductCommand.class));
            log.info("Running {} Handler", getName());
            System.out.println("Testing Demo Handler");
            BigDecimal decimal = sagaPayload.getProperty(new SagaPayLoadKey<>("decimal", BigDecimal.class));
            log.info("Reading value from step 1: {}", decimal);
        };
    }

    @Override
    public SagaStepCompensator<CreateProductResponse> getCompensator() {
        return null;
    }
}
