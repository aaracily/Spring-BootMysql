@Service
public class ChecklistService {
    private final ChecklistRepository checklistRepository;

    public ChecklistService(ChecklistRepository checklistRepository) {
        this.checklistRepository = checklistRepository;
    }

    public void agregarChecklist(ChecklistDTO checklistDTO) {
        
        Checklist checklist = new Checklist();
        checklist.setIdCapacitacion(checklistDTO.getIdCapacitacion());
        checklist.setCharla(checklistDTO.isCharla());
        checklist.setAsistencia(checklistDTO.isAsistencia());
        checklist.setPago(checklistDTO.isPago());
        checklist.setCierre(checklistDTO.isCierre());
        checklist.setIdProfesional(checklistDTO.getIdProfesional());
        checklist.setFechaUltimaVisita(checklistDTO.getFechaUltimaVisita());

        checklistRepository.save(checklist);
    }
}
