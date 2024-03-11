package com.danielnunesro.pets.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.danielnunesro.pets.dtos.RequestDto;
import com.danielnunesro.pets.dtos.ResponseDto;
import com.danielnunesro.pets.entities.HistoricoPeso;

@Mapper
public interface RequestMapper {
	
	RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);

    @Mapping(target = "infoId.dono", source = "dono")
    @Mapping(target = "infoId.emailDono", source = "emailDono")
    @Mapping(target = "infoId.telefoneDono", source = "telefoneDono")
    @Mapping(target = "infoId.nomeAnimal", source = "nomeAnimal")
    @Mapping(target = "infoId.especie", source = "especie")
    @Mapping(target = "infoId.raca", source = "raca")
	HistoricoPeso convertDtoToHistoricoPeso(RequestDto requestDto);
    
    @Mapping(source = "infoId.dono", target = "dono")
    @Mapping(source = "infoId.emailDono", target = "emailDono")
    @Mapping(source = "infoId.telefoneDono", target = "telefoneDono")
    @Mapping(source = "infoId.nomeAnimal", target = "nomeAnimal")
    @Mapping(source = "infoId.especie", target = "especie")
    @Mapping(source = "infoId.raca", target = "raca")
    ResponseDto convertHistoricoPesoToDto(HistoricoPeso historicoPeso);
    
    default ResponseDto convertHistoricoPesoToResponseDto(HistoricoPeso historicoPeso) {
        return new ResponseDto(
            historicoPeso.getInfoId().getDono(),
            historicoPeso.getInfoId().getEmailDono(),
            historicoPeso.getInfoId().getTelefoneDono(),
            historicoPeso.getInfoId().getNomeAnimal(),
            historicoPeso.getInfoId().getEspecie(),
            historicoPeso.getInfoId().getRaca(),
            historicoPeso.getPeso(),
            historicoPeso.getData()
        );
    }
    
    
   
    
    

}
