package com.amol.audit.repository;

import com.amol.audit.model.AuditData;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Amol Limaye
 **/
public interface AuditRepository extends PagingAndSortingRepository<AuditData,Long> {

    Iterable<AuditData> findAll();

    AuditData save(AuditData auditData);
}
