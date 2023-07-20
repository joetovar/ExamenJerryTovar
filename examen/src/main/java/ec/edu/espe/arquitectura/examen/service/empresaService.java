package ec.edu.espe.arquitectura.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.dto.empresaDto;
import ec.edu.espe.arquitectura.examen.model.empresa;
import ec.edu.espe.arquitectura.examen.repository.empresaRepository;

@Service
public class empresaService {
    @Autowired
    empresaRepository empresaRepository;

    
    public empresaService(empresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public empresa crearEmpresaConEmpleados(empresaDto empresaDTO) {
        empresa empresa = mapEmpresaDTOToEmpresa(empresaDTO);
        return empresaRepository.save(empresa);
    }

    private empresa mapEmpresaDTOToEmpresa(empresaDto empresaDTO) {
        empresa empresa = new empresa();
        empresa.setRUC(empresaDTO.getRUC());
        empresa.setRazonSocial(empresaDTO.getRazonSocial());
        empresa.setCuentaPrincipal(empresaDTO.getCuentaPrincipal());
        empresa.setEmpleados(empresaDTO.getEmpleados());
        return empresa;
    }
}