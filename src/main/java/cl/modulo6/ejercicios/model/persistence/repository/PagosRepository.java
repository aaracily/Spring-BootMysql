@Service
public class PagosService {
    private final PagosRepository pagosRepository;

    @Autowired
    public PagosService(PagosRepository pagosRepository) {
        this.pagosRepository = pagosRepository;
    }

    public Pagos savePagos(Pagos pagos) {
        return pagosRepository.save(pagos);
    }

    public Pagos getPagosById(Long id) {
        return pagosRepository.findById(id).orElse(null);
    }

    public List<Pagos> getAllPagos() {
        return pagosRepository.findAll();
    }

    public void deletePagos(Long id) {
        pagosRepository.deleteById(id);
    }

}
