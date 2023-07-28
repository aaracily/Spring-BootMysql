package cl.modulo6.ejercicios.model.domain.service;

import cl.modulo6.ejercicios.model.persistence.repository.PagosRepository;
import cl.modulo6.ejercicios.web.service.PagosService;
import org.springframework.stereotype.Service;

@Service
public class PagosServiceImpl implements PagosService {
    private final PagosRepository pagoRepository;

    public PagosServiceImpl(PagosRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    public PagoDTO ingresarPago(PagoDTO pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public Pago ingresarPago(Pago pago) {
        return null;
    }

    public List<PagoDTO> listarPagos() {
        return pagoRepository.findAll();
    }
}
