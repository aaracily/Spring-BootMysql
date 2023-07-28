@Mapper
public interface PagosMapper {
    PagosMapper INSTANCE = Mappers.getMapper(PagosMapper.class);

    @Mappings({
        @Mapping(source = "cliente.id", target = "idCliente"),
        @Mapping(source = "administrativo.id", target = "idAdministrativo")
    })
    PagosDTO pagosToPagosDTO(Pagos pagos);

    @Mappings({
        @Mapping(source = "idCliente", target = "cliente.id"),
        @Mapping(source = "idAdministrativo", target = "administrativo.id")
    })
    Pagos pagosDTOToPagos(PagosDTO pagosDTO);
}
