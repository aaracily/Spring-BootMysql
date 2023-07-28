import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChecklistMapper {
    ChecklistMapper INSTANCE = Mappers.getMapper(ChecklistMapper.class);

    @Mapping(target = "idCapacitacion", source = "idCapacitacion")
    @Mapping(target = "idProfesional", source = "idProfesional")
    ChecklistDTO checklistToChecklistDTO(Checklist checklist);

    @Mapping(target = "idCapacitacion", source = "idCapacitacion")
    @Mapping(target = "idProfesional", source = "idProfesional")
    Checklist checklistDTOToChecklist(ChecklistDTO checklistDTO);
}
