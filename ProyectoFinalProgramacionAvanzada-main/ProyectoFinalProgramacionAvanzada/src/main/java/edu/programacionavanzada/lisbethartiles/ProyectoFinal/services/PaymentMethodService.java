package edu.programacionavanzada.lisbethartiles.ProyectoFinal.services;


import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod.GetAllPaymentMethodCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.command.paymentmethod.GetPaymentMethodCommand;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.payment.CreatePaymentMethodRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.payment.DeletePaymentMethodRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.request.payment.UpdatePaymentMethodRequest;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.CreatePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.DeletePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.model.response.payment.UpdatePaymentMethodResponse;
import edu.programacionavanzada.lisbethartiles.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PaymentMethodService {

    private final CommandBus commandBus;

    public GetPaymentMethodResponse getAll() {
        return commandBus.sendCommand(GetAllPaymentMethodCommand.builder().build());
    }

    public GetPaymentMethodResponse get(Long id) {
        return commandBus.sendCommand(GetPaymentMethodCommand.builder().id(id).build());
    }

    public CreatePaymentMethodResponse create(CreatePaymentMethodRequest createPaymentMethodRequest) {
        return commandBus.sendCommand(createPaymentMethodRequest.toCommand());
    }

    public UpdatePaymentMethodResponse update(UpdatePaymentMethodRequest updatePaymentMethodRequest) {
        return commandBus.sendCommand(updatePaymentMethodRequest.toCommand());
    }

    public DeletePaymentMethodResponse delete (DeletePaymentMethodRequest deletePaymentMethodRequest) {
        return commandBus.sendCommand(deletePaymentMethodRequest.toCommand());
    }
}
