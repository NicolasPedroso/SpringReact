package br.ufpr.sislamir.service;

import java.rmi.dgc.VMID;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.ufpr.sislamir.model.Solicitante;
import br.ufpr.sislamir.repository.SolicitanteRepository;

@Service
public class SolicitanteService {
    
    @Autowired
    private SolicitanteRepository solicitanteRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    //CREATE
    public Solicitante createSolicitante(Solicitante solicitante, String senha) {

        Optional<Solicitante> existente = solicitanteRepository.findByEmail(solicitante.getEmail());

        if (existente.isPresent()) {
            throw new RuntimeException("Email já cadastrado!");
        }

        String senhaCriptografada = passwordEncoder.encode(senha);

        solicitante.setSenha(senhaCriptografada);

        return solicitanteRepository.save(solicitante);
    }
}
