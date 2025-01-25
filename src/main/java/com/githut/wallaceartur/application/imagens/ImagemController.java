package com.githut.wallaceartur.application.imagens;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.githut.wallaceartur.FullStackProjectApplication;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/imagens")
@Slf4j
public class ImagemController {

	private static final Logger log = LoggerFactory.getLogger(FullStackProjectApplication.class);
	
	@PostMapping
	public ResponseEntity save(
	@RequestParam("file") MultipartFile file,
	@RequestParam("name") String name,
	@RequestParam("tags")List<String> tags) {
		
		 
        log.info("Imagem recebida: {}, tamanho: {}", file.getOriginalFilename(), file.getSize());
        log.info("Nome definido para a imagem: {}", name);
        log.info("Tags: {}", tags);
		
		return ResponseEntity.ok().build();
	}
}
