package dto;


import enums.AppType;
import enums.TargetingAttribute;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.time.temporal.TemporalUnit;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@Builder
public class EventDetail {
    private Long templateId;
    private AppType appType;
    private Set<Long> deviceIds = new HashSet<>();
    private Set<Long> userIds = new HashSet<>();
    private Map<String, String> variables = new HashMap<>();
    private Map<String, String> data = new HashMap<>();
    private HashMap<TargetingAttribute, Set<String>> targetingAttributes = new HashMap<>();
    private OffsetDateTime scheduledDateTime=OffsetDateTime.now();
}
