package uz.letstrip.userservice.kafka;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import uz.letstrip.userservice.enums.AppType;
import uz.letstrip.userservice.enums.TargetingAttribute;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@Schema(description = "Event detail information for scheduling and targeting events")
public class EventDetail {

    @Schema(
            description = "Template ID of the event",
            example = "12345"
    )
    private Long templateId;

    @Schema(
            description = "Application type where the event will be triggered : [LETSTRIP_APP,LETSTRIP_AI_APP]",
            example = "LETSTRIP_APP"
    )
    private AppType appType;

    @Schema(
            description = "List of device IDs to target",
            example = "[35707]"
    )
    private Set<Long> deviceIds = new HashSet<>();

    @Schema(
            description = "List of user IDs to target",
            example = "[310]"
    )
    private Set<Long> userIds = new HashSet<>();

    @Schema(
            description = "Dynamic template variables (key-value pairs)",
            example = "{\"userName\": \"John\", \"promoCode\": \"SUMMER2025\"}"
    )
    private Map<String, String> variables = new HashMap<>();

    @Schema(
            description = "Additional data for event processing",
            example = "{\"clickUrl\": \"https://example.com\", \"imageUrl\": \"https://img.example.com/banner.jpg\"}"
    )
    private Map<String, String> data = new HashMap<>();

    @Schema(
            description = "Targeting attributes for segmentation[   LANGUAGE,COUNTRY,PLATFORM]",
            example = "{\"COUNTRY\": [\"ZZ\", \"ZZ\"], \"PLATFORMM\": [\"ANDROID\", \"IOS\"]}"
    )
    private HashMap<TargetingAttribute, Set<String>> targetingAttributes = new HashMap<>();

    @Schema(
            description = "Date and time when the event is scheduled (ISO 8601 format)",
            example = "2025-08-20T15:30:00Z"
    )
    private OffsetDateTime scheduledDateTime;

}
