package com.github.twitch4j.helix.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModeratorList {

    @JsonProperty("data")
    private List<Moderator> moderators;

    @JsonProperty("pagination")
    private HelixPagination pagination;

    /**
     * @return the moderators from this query
     * @deprecated in favor of getModerators()
     */
    @Deprecated
    public List<Moderator> getSubscriptions() {
        return this.moderators;
    }
}
