@RestController
@RequestMapping("/pagos")
public class PagoController {
    private final PagoServiceImpl pagoService;

    public PagoController(PagoServiceImpl pagoService) {
        this.pagoService = pagoService;
    }

    // Para ingresar datos

    @PostMapping("/guardarPago")
    public ResponseEntity<String> guardarPago(@RequestParam Double monto, 
                                              @RequestParam Date fecha, 
                                              @RequestParam Long cliente, 
                                              @RequestParam Long administrativo) {
        Pago pago = new Pago();
        pago.setMonto(monto);
        pago.setFecha(fecha);

        // Recupera los objetos Cliente y Administrativo por sus ids
        Cliente clienteObj = clienteRepository.findById(cliente).orElse(null);
        Administrativo administrativoObj = administrativoRepository.findById(administrativo).orElse(null);

        pago.setCliente(clienteObj);
        pago.setAdministrativo(administrativoObj);

        pagoService.ingresarPago(pago);
        return new ResponseEntity<>("Pago guardado exitosamente.", HttpStatus.OK);
    }
}
