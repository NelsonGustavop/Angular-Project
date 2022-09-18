package com.Slayer.Angular.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.Angular.domain.Chamado;
import com.Slayer.Angular.domain.Cliente;
import com.Slayer.Angular.domain.Tecnico;
import com.Slayer.Angular.domain.enums.Perfil;
import com.Slayer.Angular.domain.enums.Prioridade;
import com.Slayer.Angular.domain.enums.Status;
import com.Slayer.Angular.repositories.ChamadoRepository;
import com.Slayer.Angular.repositories.ClienteRepository;
import com.Slayer.Angular.repositories.PessoaRepository;
import com.Slayer.Angular.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tR;
	@Autowired
	private ClienteRepository cR;
	@Autowired
	private ChamadoRepository chR;
	@Autowired
	private PessoaRepository pR;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Maquiavel", "519849885", "mak@gmail.com", "Tu é doido doido");
		t1.addPerfis(Perfil.ADMIN);
		Cliente c1 = new Cliente(null, "Nero", "85456.65", "Nero@gmail.com", "cleitin06");

		Chamado chamado = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro  chamado", t1,
				c1);
		tR.saveAll(Arrays.asList(t1));
		cR.saveAll(Arrays.asList(c1));
		chR.saveAll(Arrays.asList(chamado));
	}
}
