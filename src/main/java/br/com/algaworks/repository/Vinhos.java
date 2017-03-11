package br.com.algaworks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algaworks.models.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{

	List<Vinho> findByNomeContainingIgnoreCase(String nome);
}
