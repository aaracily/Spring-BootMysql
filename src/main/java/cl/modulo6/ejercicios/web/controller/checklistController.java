@RestController
@RequestMapping("/checklists")
public class ChecklistController {
    private final ChecklistService checklistService;

    public ChecklistController(ChecklistService checklistService) {
        this.checklistService = checklistService;
    }

    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "checklistFormulario"; 
    }

    @PostMapping("/agregar")
    public ResponseEntity<String> agregarChecklist(@RequestBody ChecklistDTO checklistDTO) {
        checklistService.agregarChecklist(checklistDTO);
        return new ResponseEntity<>("Checklist agregado exitosamente.", HttpStatus.OK);
    }
}
