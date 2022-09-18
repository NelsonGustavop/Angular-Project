package com.Slayer.Angular;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

@SpringBootApplication
public class AngularApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tR;
	@Autowired
	private ClienteRepository cR;
	@Autowired
	private ChamadoRepository chR;
	@Autowired
	private PessoaRepository pR;

	public static void main(String[] args) {
		SpringApplication.run(AngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico t1 = new Tecnico(null, "Maquiavel", "519849885", "mak@gmail.com", "Tu é doido doido");
		t1.addPerfis(Perfil.ADMIN);
		Cliente c1 = new Cliente(null, "Nero", "85456.65", "Nero@gmail.com", "cleitin06");

		Chamado chamado = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro  chamado", t1,
				c1);
		tR.saveAll(Arrays.asList(t1));
		cR.saveAll( Arrays.asList(c1));
		chR.saveAll(Arrays.asList(chamado));
	}

}
