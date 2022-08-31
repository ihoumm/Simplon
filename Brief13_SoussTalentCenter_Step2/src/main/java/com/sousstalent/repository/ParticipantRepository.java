package com.sousstalent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sousstalent.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
