package com.example.demo.repository;


import com.example.demo.entity.AuditLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditLogRepository extends ElasticsearchRepository<AuditLog, String> {
    List<AuditLog> findByUserName(String userName);

    List<AuditLog> findByEventType(String eventType);

    // TODO search by date range
}
