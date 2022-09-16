package com.soussHealthOnlineStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soussHealthOnlineStore.entity.Role;
import com.soussHealthOnlineStore.entity.URole;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(URole name);
}