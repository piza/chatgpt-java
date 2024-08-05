package com.plexpt.chatgpt.entity.billing;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author plexpt
 */
@Data
public class Usage {
    @JsonProperty("prompt_tokens")
    private long promptTokens;
    @JsonProperty("completion_tokens")
    private long completionTokens;
    @JsonProperty("total_tokens")
    private long totalTokens;

    @JsonProperty("prompt_cache_hit_tokens")
    private long promptCacheHitTokens;

    @JsonProperty("prompt_cache_miss_tokens")
    private long promptCacheMissTokens;

}
