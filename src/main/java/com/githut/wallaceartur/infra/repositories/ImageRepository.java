package com.githut.wallaceartur.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.githut.wallaceartur.domain.entities.Image;

public interface ImageRepository extends JpaRepository<Image, String>{

}
