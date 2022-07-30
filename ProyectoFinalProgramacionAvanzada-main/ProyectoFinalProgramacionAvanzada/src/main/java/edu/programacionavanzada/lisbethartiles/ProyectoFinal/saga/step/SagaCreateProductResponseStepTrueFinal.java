package edu.programacionavanzada.lisbethartiles.ProyectoFinal.saga.step;

import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.CreateProductCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.exceptions.BadSagaException;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SagaCreateProductResponseStepTrueFinal implements SagaStep<CreateProductResponse> {

    @Override
    public String getName() {
        return "Demo Step true final";
    }

    @Override
    public SagaStepHandler<CreateProductResponse> getHandler() {
        return sagaPayload -> {
            CreateProductCommand command = sagaPayload.getProperty(new SagaPayLoadKey<>("id", CreateProductCommand.class));
            log.info("Running {} Handler", getName());
            if (command.isExplote()) {
                throw new BadSagaException();
            }
            sagaPayload.setResult(CreateProductResponse.builder().product().build());
        };
    }

    @Override
    public SagaStepCompensator<CreateProductResponse> getCompensator() {
        return null;
    }
}
