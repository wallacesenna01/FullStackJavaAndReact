package com.githut.wallaceartur.application.imagens;
import org.springframework.stereotype.Service;

import com.githut.wallaceartur.domain.entities.Image;
import com.githut.wallaceartur.domain.services.ImageService;
import com.githut.wallaceartur.infra.repositories.ImageRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImagemServiceImpl implements ImageService{

	private final ImageRepository repository;

    public ImagemServiceImpl(ImageRepository repository) {
        this.repository = repository;
    }
	 
	@Override
	@Transactional
	public Image save(Image image) {		
		return repository.save(image);
	}

}
